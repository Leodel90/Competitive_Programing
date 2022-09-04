import java.util.*;
public class _11349_Symetric_Matrix {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for (int xd = 1; xd <=t; xd++){
			leer.next();
			leer.next();
			int n =leer.nextInt();
			long M[][]= new long[n][n];
			boolean q=true;
			for (int i = 0; i < M.length; i++) {
				for (int j = 0; j < M.length; j++) {
					M[i][j]=leer.nextLong();	
					q=q&&M[i][j]>=0;
				}
			}
			for (int i = 0,k=n-1; i < n&&q; i++,k--) {
				for (int j = 0,l=n-1; j < n&&q; j++,l--) 
					q=M[i][j]==M[k][l];
			}
			if(q)System.out.println("Test #"+xd+": Symmetric.");
			else System.out.println("Test #"+xd+": Non-symmetric.");
		}
	}
}
