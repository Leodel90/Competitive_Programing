import java.util.*;
public class _10443_Rock_Scissors_Paper {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		int x[]= {-1,0,1,0};
		int y[]= {0,1,0,-1};
		for (int xd = 0; xd < t; xd++) {
			int r = leer.nextInt();
			int c = leer.nextInt();
			int n = leer.nextInt();
			char T[][]= new char[r][c];
			char V[][]= new char[r][c];
			for (int i = 0; i < r; i++) {String cad = leer.next();
				for (int j = 0; j < c; j++){
					T[i][j]= cad.charAt(j);
				V[i][j]=T[i][j];}
			}
			char p=0;
			for (int i = 0; i < n;i++){
				for (int j = 0; j < r; j++) {
					for (int k = 0; k < c; k++) {
						if(T[j][k]=='R')p='S';
						if(T[j][k]=='S')p='P';
						if(T[j][k]=='P')p='R';
						for (int l = 0,a,b; l < 4; l++){a=j+x[l];b=k+y[l];
							if(a>=0&&b>=0&&a<r&&b<c&&T[a][b]==p)V[a][b]=T[j][k];
						}
					}
				}
				for (int k = 0; k < r; k++) {
					for (int j = 0; j < c; j++) 
						T[k][j]=V[k][j];
				}
			}
			if(xd>0)System.out.println();
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) 
					System.out.print(T[i][j]);
				System.out.println();
			}
		}
	}
}
