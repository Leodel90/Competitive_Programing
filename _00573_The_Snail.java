import java.util.*;
public class _00573_The_Snail {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			int h = leer.nextInt();
			double u= leer.nextDouble();
			int d= leer.nextInt();
			double f = u*leer.nextDouble()/100;
			if(h>0){
				double r = 0;
				int c=1;
				while(true){
					r+=u;
					if(r>h)break;
					r-=d;
					if(r<0)break;
					if(u>=f)u-=f;
					else u=0;
					c++;
				}
				if(r>=h)System.out.println("success on day "+c);
				else System.out.println("failure on day "+c);
			}
		}
	}
}
/*
6 3 1 10
10 2 1 50
50 5 3 14
50 6 4 1
50 6 3 1
1 1 1 1
0 0 0 0
*/