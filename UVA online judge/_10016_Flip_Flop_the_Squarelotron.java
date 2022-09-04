import java.util.*;
public class _10016_Flip_Flop_the_Squarelotron {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int m = leer.nextInt();
        for (int xd = 0; xd < m; xd++){
        	int n = leer.nextInt();
        	int S[][]= new int [n][n];
        	for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) 
					S[i][j]=leer.nextInt();
			}
        	int l = n/2+n%2;
        	for (int i = 0; i < l; i++){
				int t = leer.nextInt();
				int lim=n-1-i,aux;
				for (int j = 0; j < t; j++){
					int c = leer.nextInt();
					if(c==1){
					    for (int k = i; k <=lim; k++){
							aux=S[i][k];S[i][k]=S[lim][k];S[lim][k]=aux;}int k =i+1,nk=lim-1;
					    while(k<nk){aux=S[k][i];S[k][i]=S[nk][i];S[nk][i]=aux;
							aux=S[k][lim];S[k][lim]=S[nk][lim];S[nk][lim]=aux;k++;nk--;}
					}
					if(c==2){
					    for (int k = i; k <=lim; k++){
							aux=S[k][i];S[k][i]=S[k][lim];S[k][lim]=aux;}int k=i+1,nk=lim-1;
						while(k<nk){
							aux=S[i][k];S[i][k]=S[i][nk];S[i][nk]=aux;
							aux=S[lim][k];S[lim][k]=S[lim][nk];S[lim][nk]=aux;k++;nk--;}
					}
					if(c==3){
						for (int k = i+1; k <lim; k++){
							aux=S[i][k];S[i][k]=S[k][i];S[k][i]=aux;
							aux=S[k][lim];S[k][lim]=S[lim][k];S[lim][k]=aux;
						}aux=S[i][lim];S[i][lim]=S[lim][i];S[lim][i]=aux;
					}
					if(c==4){
						for (int k = i+1; k<lim; k++){
							aux=S[i][k];S[i][k]=S[n-k-1][lim];S[n-k-1][lim]=aux;
							aux=S[k][i];S[k][i]=S[lim][n-k-1];S[lim][n-k-1]=aux;
						}aux=S[i][i];S[i][i]=S[lim][lim];S[lim][lim]=aux;
					}
				}
			}
        	for (int x = 0; x < n; x++){
				for (int y = 0; y < n; y++){
					if(y!=0)System.out.print(" ");
					System.out.print(S[x][y]);
				}System.out.println();
			}
		
		}
	}
}

/*
4
3
1 2 3
4 5 6
7 8 9
2 1 2
4 1 2 3 4
4
1 2 3 4
5 6 7 8
9 1 2 3
4 5 6 6
2 1 2
2 3 4
5
1 2 3 4 5
6 7 8 9 1
2 3 4 5 6
7 8 9 1 2
3 4 5 6 7
2 3 4
2 1 3
4 1 3 2 4
6
1 2 3 4 5 6
7 8 9 1 2 3
4 5 6 7 8 9
1 2 3 4 5 6
7 8 9 1 2 3
4 5 6 7 8 9
2 4 1
2 2 3
1 1

*/