import java.util.*;
public class Homero {
	public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      while(leer.hasNext()){
    	  int t = leer.nextInt();
    	  for (int xd = 0; xd < t; xd++) {
    		  int n = leer.nextInt(),c=0;
    		  boolean q = true;
			for (int i = 0; i < n; i++) {
				String cad = leer.next();
				if(q){
					if(!cad.equals("porque")){
				            if(cad.substring(0,11).equals("instruccion"))c++;
				   
				}else q=false;
				}
			}System.out.println(c);
    	  }
      }
	}
}
/*
3
4
instruccion1
instruccion2
instruccion3
porque
3
instruccion1
porque
instruccion2
2
porque
blahblahblah
*/