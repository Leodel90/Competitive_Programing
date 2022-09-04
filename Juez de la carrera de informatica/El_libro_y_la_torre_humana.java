import java.util.*;
public class El_libro_y_la_torre_humana {
public static void main(String[] args) {
	Scanner leer = new Scanner (System.in);
    while(leer.hasNext())
    {int t = leer.nextInt();
    for (int xd = 0; xd < t; xd++) {
		double a = leer.nextDouble();
		int n = leer.nextInt();
		double x;
		for (int i = 0; i < n;i++){
			x=leer.nextDouble();
			if(a>0)
			a=a-x;
		}
		if(a<=0)System.out.println(":)");
		else System.out.println(":(");
	}
    }	
	}
}
/*
4
5
1
2
3
0
10
3
3
3
4
5
3
1
2
3
*/
 