import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;
public class _10138_CDVII{
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		DecimalFormat F= new DecimalFormat("0.00");
		for (int i = 0; i < t; i++) {
			double V[]= new double[24];
			TreeMap<String, TreeMap<String, Integer>> A = new TreeMap<String, TreeMap<String, Integer>>();
			for (int j = 0; j < 24; j++) 
				V[j]=leer.nextDouble()/100;
			leer.nextLine();
			try{
				while(true){
					String cad = leer.nextLine();
					if(cad.length()==0) break;
					String P[]= new String[4];P[0]="";
					for (int j = 0,k=0; j < cad.length(); j++){
						char x = cad.charAt(j);
						if(x==' '){k++;P[k]="";}
						else P[k]+=x;
					}
					if(P[2].length()==4)P[1]+='x';else P[1]+='n';
					TreeMap<String, Integer> aux = new TreeMap<String, Integer>();
					if(A.containsKey(P[0]))aux=A.get(P[0]);
					aux.put(P[1], Integer.parseInt(P[3]));
					A.put(P[0], aux);
				}
			}catch(Exception e){}
			if(i>0)System.out.println();
			while(!A.isEmpty()){
				Entry <String, TreeMap<String,Integer>>R= A.pollFirstEntry();
				double B=2;
				TreeMap<String, Integer> aux = R.getValue();
			    Entry <String, Integer> a = aux.pollFirstEntry();
				while(!aux.isEmpty()){
					Entry <String, Integer> b = aux.pollFirstEntry();
					if(a.getKey().charAt(11)=='n'&&b.getKey().charAt(11)=='x')
						B=B+V[(a.getKey().charAt(6)-48)*10+a.getKey().charAt(7)-48]*(Math.abs(b.getValue()-a.getValue()))+1;
					a=b;
				}
				if(B>2){
					String Bill= F.format(B);
					Bill=Bill.substring(0,Bill.length()-3)+"."+Bill.charAt(Bill.length()-2)+Bill.charAt(Bill.length()-1);
					System.out.println(R.getKey()+" $"+Bill);
				}
			}
		}
	}
}


/*
1

10 10 10 10 10 10 20 20 20 15 15 15 15 15 15 15 20 30 20 15 15 10 10 10
ABCD123 01:01:06:01 enter 17
765DEF 01:01:07:00 exit 95
ABCD123 01:01:08:03 exit 95
765DEF 01:01:05:59 enter 17

*/