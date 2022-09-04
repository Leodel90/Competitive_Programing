import java.text.DecimalFormat;
import java.util.*;
public class Tuncuña {
	public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      while(leer.hasNext()){
      long t = leer.nextLong();
      for (long xd = 0; xd < t; xd++) {
		long x = leer.nextLong();
	    double u= (Math.sqrt(x*8+1)-1)/2;
	    if(u==(long)u){
	    	DecimalFormat p= new DecimalFormat("0");
	    	System.out.println("Go On Bob "+p.format(u));}
	    	else System.out.println("Better Luck Next Time");
       }
      }
	}
}
/*
3
2
3
1000000000000000000

*/