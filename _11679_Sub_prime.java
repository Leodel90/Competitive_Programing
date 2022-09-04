import java.util.*;
public class _11679_Sub_prime {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			int b = leer.nextInt();
			int n= leer.nextInt();
			if(b>0|| n>0){
			  int B[]= new int[b+1];
			  for (int i = 1; i <=b; i++) 
				B[i]= leer.nextInt();
			  for (int i = 0; i < n; i++) {
				int d= leer.nextInt();
				int c= leer.nextInt();
				int v = leer.nextInt();
				B[d]-=v;
				B[c]+=v;
			  }
			  boolean q=true;
			  for (int i = 1; i <=b&&q; i++) 
				q=B[i]>=0;
			if(q)System.out.println("S");
			else System.out.println("N");
			}
		}
	}
}
