import java.util.*;
public class Rumores {
public static boolean Relaciona(int x,int y){
	if(!caminos[x]){
	   for (int j = 0; j < n && !res; j++) {
		   if(M[x][j]==1){
			if(j==y){return true;}
			else{
				
				M[x][j]=-1;M[j][x]=-1;
				res=Relaciona(j,y);
				M[x][j]=1;M[j][x]=1;
			}
		}
	   }
	   
	   caminos[x]=true;
	}
	return res;
}

static int M[][];
static boolean caminos[],res;
static int n;
	public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
		while(leer.hasNext()){
			int t = leer.nextInt();
			for (int i = 0; i < t; i++) {
				n = leer.nextInt();
				int m = leer.nextInt(),u,v;
				M=new int [n][n];
				caminos = new boolean[n];
				for (int j = 0; j < m; j++) {
                  u=leer.nextInt();v=leer.nextInt();
                     M[u-1][v-1]=1;
                     M[v-1][u-1]=1;
				}
				int x = leer.nextInt(),y=leer.nextInt();
			    res =false;
			    if(Relaciona(x-1,y-1))System.out.println("SI");else System.out.println("NO");
				
				
			}
			
			
		}

	}
/*
4
4 3
1 2
2 3
3 4
1 4

4 3
1 2
2 3
3 1
1 4

5 5
1 2
1 3
2 3
4 5
5 2
1 4

5 6
1 2
2 3
3 1
4 5
5 2
1 4
1 4

*/
	

}
