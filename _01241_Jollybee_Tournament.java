import java.util.*;
public class _01241_Jollybee_Tournament {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for (int xd = 0; xd < t; xd++){
			int n = leer.nextInt();
		    int  m = leer.nextInt();
		    int l = 1<<n;
		    boolean V[]= new boolean[l];
		    for (int i = 0; i < m; i++)
		    	V[leer.nextInt()-1]=true;
		    int c=0;
			for (int i = 0; i < n; i++){l=l>>1;
				boolean C[]= new boolean[l];
				for (int j = 0; j < V.length; j=j+2){
					if(V[j]!=V[j+1])c++;
					C[j/2]=V[j]&&V[j+1];
				}
				V=C;
			}
			System.out.println(c);
		}
	}
}
/*
3
2 2
3 4
3 5
1 2 3 4 5
2 1
2

*/