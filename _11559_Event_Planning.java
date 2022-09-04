import java.util.*;
public class _11559_Event_Planning {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			int n =leer.nextInt();
			int b= leer.nextInt();
			int h= leer.nextInt();
			int w= leer.nextInt();
			long min=Long.MAX_VALUE;
			for (int i = 0; i < h; i++){
				int p = leer.nextInt();
				boolean q= false;
				for (int j = 0; j < w; j++) {
					int a = leer.nextInt();
					q=q||a>=n;
				}
				long r=p*n;
				if(q&&min>r&&r<=b)
					min=r;
			}
			if(min!=Long.MAX_VALUE)System.out.println(min);
			else System.out.println("stay home");
		}
	}
}
