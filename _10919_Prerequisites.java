import java.util.*;
public class _10919_Prerequisites {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			int k= leer.nextInt();
			if(k>0){
			int m = leer.nextInt();
			boolean N[]= new boolean[10000];
			for (int i = 0; i < k; i++)
			N[leer.nextInt()]= true;
			boolean q=true;
			for (int i = 0; i < m; i++) {
				int c = leer.nextInt();
				int r = leer.nextInt();
				for (int j = 0; j < c; j++){
					if(N[leer.nextInt()])r--;
				}
				q=q&&r<=0;
			}
			if(q)System.out.println("yes");
			else System.out.println("no");}
			else break;
		}
	}
}
