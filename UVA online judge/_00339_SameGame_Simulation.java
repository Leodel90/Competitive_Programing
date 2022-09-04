import java.util.*;
public class _00339_SameGame_Simulation {
	static int n,m;
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int xd=1;
		while(leer.hasNext()){
			m = leer.nextInt();	
			n = leer.nextInt();
			if(n+m>0){
				int G[][]= new int [n+1][m+1];
				for (int i = 1; i <=m; i++) {
					for (int j = 1; j <=n; j++)
						G[j][i]= leer.nextInt();
				}int cf=n;
				int NC[]= new int [n+1];
				for (int i = 1; i <=n; i++)
				NC[i]=m;
				int T=n*m;
				while(true){
					int x=leer.nextInt(),y=leer.nextInt();
					if(x+y>0){
						if(x<=m && y <=n && x<=NC[y]&&y<=cf){
							LinkedList<Integer> X =new LinkedList<Integer>();
							LinkedList<Integer> Y =new LinkedList<Integer>();
							int c=G[y][x],d=1,ce=0;
							G[y][x]=-1;
							X.add(y);
							Y.add(x);
							while(!X.isEmpty()){
								d=X.size();
								for (int i = 0; i < d; i++){
									int a=X.remove();
									int b=Y.remove();ce++;T--;
										if(a>1&&G[a-1][b]==c){G[a-1][b]=-1;X.add(a-1);Y.add(b);}
										if(a<cf&&G[a+1][b]==c){G[a+1][b]=-1;X.add(a+1);Y.add(b);}									
										if(b>1&&G[a][b-1]==c){G[a][b-1]=-1;X.add(a);Y.add(b-1);}
										if(b<NC[a]&&G[a][b+1]==c){G[a][b+1]=-1;X.add(a);Y.add(b+1);}
								}
							}if(ce==1){G[y][x]=c;T++;}
							for (int i = 1,k; i <=cf; i++){k=1;
							
								for (int j = 1; j <=NC[i]; j++){
									if(G[i][j]!=-1){
										G[i][k]=G[i][j];k++;
									}
								}
								NC[i]=k-1;
							}int k=1;
							for (int i = 1; i <=cf; i++){
								if(NC[i]>0){
									G[k]=G[i];
									NC[k]=NC[i];k++;
								}
							}
							cf=k-1;
						}						
					}else break;
				}
				if(xd>1)System.out.println();
				System.out.println("Grid "+xd+".");xd++;
				if(T>0){
					for (int i = m; i >0; i--){
						System.out.print("    ");
						for (int j = 1; j <=cf; j++){
							if(NC[j]>=i)System.out.print(G[j][i]);
							else System.out.print(" ");
							if(j<cf)System.out.print(" ");
						}System.out.println();
					}
				}else System.out.println("    Game Won"); 
			}else break;
		}
	}
}

/*
3 5 
1 2 3 5 5
2 2 3 5 1
1 3 5 2 2
3 5
2 2
1 2
1 2
1 1
0 0

3 5
1 2 3 5 5
2 2 3 5 1
1 3 5 2 2
2 2      1 2     1 4  1 2
99 99 0 0


4 3
1 4 4
4 4 2
1 2 3
3 1 3
1 2 1 1 1 3 1 1 0 0
0 0
*/