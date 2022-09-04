import java.util.*;
public class Reduciendo_Costos {
	public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       while(leer.hasNext()){
    	   int t = leer.nextInt();
    	   for (int i = 1; i <=t; i++) {
			int x = leer.nextInt();
			int y=leer.nextInt();
			int z = leer.nextInt();
			int res=z;
			if(x>z&&x<y || x>y && x<z){res=x;}
			else {if(y>z && y<x || y>x && y<z){res=y;}}
			System.out.println("Case "+i+": "+res);
		}
       }

	}

}
