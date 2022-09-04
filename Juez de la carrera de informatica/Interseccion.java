import java.util.*;
public class Interseccion {
public static void main(String[] args) {
   Scanner leer = new Scanner (System.in);
   while(leer.hasNext()){
      int a = leer.nextInt();
      boolean num[] = new boolean [10];
      int b = leer.nextInt();
      for (int i = 0; i < a; i++) {		
    	  num[leer.nextInt()]=true;
	  }
      int c=0;
      for (int i = 0; i < b; i++) {a=leer.nextInt();
	   if(num[a]){c++;num[a]=false;}	
	}System.out.println(c);
   }
	}
}
/*
5 6
1 5 3 3 6
0 5 5 5 5 3
*/
