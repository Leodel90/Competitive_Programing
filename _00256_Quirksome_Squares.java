import java.io.*;
import java.util.LinkedList;
public class _00256_Quirksome_Squares{
	public static void main(String[] args){
		BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter( new BufferedWriter ( new  OutputStreamWriter( System.out)));
		LinkedList<String> N[]= new LinkedList[4];
		N[0]= new LinkedList<String>();
		N[1]= new LinkedList<String>();
		N[2]= new LinkedList<String>();
	    N[3]= new LinkedList<String>();
		N[0].add("00");N[1].add("0000");N[2].add("000000");N[3].add("00000000");
		N[0].add("01");N[1].add("0001");N[2].add("000001");N[3].add("00000001");
		int p = 1;
		for (int q = 0; q < 4; q++){p=p*10;
		for (int i = 1; i < p; i++){
			double r = Math.sqrt(1+i*(p-1)*4);
			if((int)r==r){
				r=(1-(i<<1)+r)/2.0;
				if((int)r==r){
					int s=(int)Math.pow(i+(int)r,2);
					if(s==i*p+(int)r){int l = q+1;
					StringBuilder t= new StringBuilder();
						for (int j=(int)Math.log10(i)+1;j<l;j++)t.append("0");
						t.append(s+"");
						
						N[q].add(t.toString());
					}
				}
			}
		}
		}
		try{
		while(true){
			int n=( Integer.parseInt(br.readLine())>>1)-1;
		    int l= N[n].size();
		    for (int i = 0; i < l; i++){
			   String r=N[n].removeFirst();N[n].addLast(r);
			   pr.println(r);
		    }
		}
		}catch(Exception e){}
		pr.close();
	}
}
/*
2
4
6
8
2
4
6
8
e
 
*/
