import java.util.*;
public class El_libro_y_la_torre_de_taburetes {
	public static void main(String[] args) {
	Scanner leer = new Scanner (System.in);
	while(leer.hasNext()){
	int x = leer.nextInt();
	for (int xd = 0; xd < x; xd++) {
		int n=leer.nextInt();
		double t = leer.nextDouble();
		double h = leer.nextDouble();
		double abc = Math.max(leer.nextDouble(),Math.max(leer.nextDouble(), leer.nextDouble()));
		boolean q=h<=abc;
		if(!q){q=t<=h;
			if(q){
			h=(h-abc)/t;
		    if(h!=(int)h)h++;
			q=n>=(int)h;
			}
		}else h=0;
	    if(q)System.out.println((int)h);
	    else System.out.println(":(");
	}
	}
  }
}
/*
3
10 1 15
1 2 5
3 100 7
3 5 1
10 1 6
1 2 5
*/
