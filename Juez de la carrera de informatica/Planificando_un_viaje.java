import java.util.*;
public class Planificando_un_viaje {
	public static void main(String[] args) {
	  Scanner leer = new Scanner (System.in);
	  while(leer.hasNext()){
		  int n= leer.nextInt();
		  int p=leer.nextInt();
		  int h = leer.nextInt();
		  int s = leer.nextInt();
		  int min=p;boolean q =false;
		  for (int i = 0; i < h; i++) {
			int p1=leer.nextInt();
			int m=0;
			for (int j = 0; j < s; j++) {
				int s1=leer.nextInt();
		        if(s1>m)m=s1;
			}
			
			if(p1*n<=min && m>=n){min=p1*n;q=true;}
		  }
		  if(q)System.out.println(min);else System.out.println("quedarse en casa"); 
	  }

	}

}
