import java.util.*;
public class _00755_487_3279 {
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for (int xd = 0; xd < t; xd++) {
		int n = leer.nextInt();
		leer.nextLine();
		int N[]=new int [10000000];
		String T[]= new String[10000000];
		TreeSet<Integer> V= new TreeSet<Integer>();
		for (int i = 0; i < n; i++){
			String cad = leer.nextLine();
			int number=0;
			String h="";
			for (int j = 0; j < cad.length();j++){
			     int x=cad.charAt(j);
			     if(x>=48&&x<=57||x>=65&&x<=90){
			    	 if(x>=65){
			    		 if(x>'Q')x--;
			    		 x=((x-65)/3)+2;
			    		 number=number*10+x;
			    	 }else {x=x-48;number=number*10+x;}
			    	 h=h+x; 
			    	 if(h.length()==3)h=h+'-';
			     }else {if(h.length()==8)break;}
			}
			T[number]=h;N[number]++;
			if(N[number]>=2)V.add(number);
		}
		if(xd>0)System.out.println();
		if(!V.isEmpty()){while(!V.isEmpty())System.out.println(T[V.first()]+" "+N[V.pollFirst()]);
		}else System.out.println("No duplicates.");
		
		}
	}
}
/*
1

12
4873279
ITS-EASY
888-4567
3-10-10-10
888-GLOP
TUT-GLOP
967-11-11
310-GINO
F101010
888-1200
-4-8-7-3-2-7-9-
487-3279
*/
