import java.util.*;
public class Areas {
public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   try{
   while(leer.hasNext()){
	   int n = leer.nextInt();
	   double s =0;
	   double x0=leer.nextDouble();
	   double y0=leer.nextDouble();
	   double x=x0,y=y0;
	   for (int i = 1; i < n; i++) {
		double xi=leer.nextDouble(); 
		double yi=leer.nextDouble();   
	    s=s+x*yi-xi*y;
	    x=xi;y=yi;
	   }
	   s=(s+x*y0-x0*y)/2;
	   System.out.printf("%.600f%n",s);
   }
   }catch (Exception e) {
	   //esto es para el juez patito ¬¬
	   
   }
	}
}
/*
3
0 0
1 0
0 1
 
*/
 