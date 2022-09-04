import java.util.*;
public class Modulo {
	public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     while(leer.hasNext()){
    	 int t = leer.nextInt();
    	 for (int i = 0; i < t; i++) {
			String A = leer.next();
		     int m = leer.nextInt();
		     int res=0,d=1;
		     for (int j = A.length()-1; j>=0; j--) {
				int a=((A.charAt(j)-48)%m*d)%m;
				res=(res+a)%m;
				d=(d*10)%m;
		     }
		     System.out.println(res);
		}
     }
	}
}
/*
4
651838061 99
836075 51
284235 810
17 533
*/
