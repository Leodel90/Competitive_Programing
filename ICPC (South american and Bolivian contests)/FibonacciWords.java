import java.util.*;
public class FibonacciWords {
//Concurso 143
	static Scanner leer = new Scanner(System.in);
	public static void main(String[] args){
		int ñ=leer.nextInt();
		for (int xd = 0; xd < ñ; xd++) {
			int n= leer.nextInt();
			int i= leer.nextInt();
	        int j= leer.nextInt();
	        String a = "0";
	        String b = "1";
		    String c;
		    while(true){
		    	c=b+a;
		    	if(c.length()>=j){System.out.println(c.substring(i,j));break;}
		    a=b;b=c;
		    }
		
		}
//-------------------------
/*
8
5 2 4
10 3 7 
50 100 110
20 400 500
90 20 30
80 10 20
20 50 55
30 10 10
 





*/
		
	}
}
