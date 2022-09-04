import java.util.*;
public class _12503_Robot_Instructions {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for (int i = 0; i < t; i++){
			int n = leer.nextInt();
			int x=0;
			int I[]= new int[n+1];
			for (int j = 1; j <=n; j++){
				char c= leer.next().charAt(0);
				if(c=='S'){
					leer.next();
					I[j]=I[leer.nextInt()];
				}
				else {
					if(c=='R')I[j]=1;
					else I[j]=-1;
				}
				x+=I[j];
			}
			System.out.println(x);
		}
	}
}
