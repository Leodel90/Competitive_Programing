import java.util.*;
public class _00141_The_Spot_Game{
	static boolean M[][][],D[][];
	static int c,n;
	public static boolean Compara(){
		int p=c-1;
		while(p>=0){boolean r=true;
			for (int i = 1; i <=n&&r; i++){
				for (int j = 1; j <=n&&r; j++){
					r=r&&D[i][j]==M[i][j][p];
				}
			}
			if(r)return r;
			p--;
		}
		return false;
	}
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
        while(leer.hasNext()){
        	n = leer.nextInt();
        	if(n==0)break;
        	int max = 0, l=n<<1;c=0;int d=0;
        	M= new boolean [n+1][n+1][l];
        	boolean f=false;
        	for (int i = 0; i < l; i++) {
				int x = leer.nextInt();
				int y = leer.nextInt();
				leer.next();
				if(!f){
				if(c>0){D= new boolean[n+1][n+1];
					for (int j = 1; j <=n; j++){
						for (int k = 1; k <=n; k++){
							M[j][k][c]=M[j][k][c-1];
						   	D[j][k]=M[j][k][c]; 
						}
					}
					if(M[x][y][c])d--;
					else d++;
					M[x][y][c]=!M[x][y][c];
					D[x][y]=M[x][y][c];
					if(d<=max){
					if(!Compara()){
					boolean C[][]= new boolean[n+1][n+1];
					for (int j = 1; j <=n; j++){
						for (int k = 1; k <=n; k++){
							C[k][n-j+1]=D[j][k];
						}
					}
					D=C;
					if(!Compara()){
					C=  new boolean[n+1][n+1];
					for (int j = 1; j <=n; j++){
						for (int k = 1; k <=n; k++){
							C[n-j+1][n-k+1]=D[j][k];
						}
					}D=C;
					if(!Compara()){
					C=  new boolean[n+1][n+1];
					for (int j = 1; j <=n; j++){
						for (int k = 1; k <=n; k++){
							C[n-k+1][j]=D[j][k];
						}
					}D=C;
					f=Compara();
					}else f=true;
					}else f=true;
					}else f=true; 
					}else max=d;
				}else {M[x][y][c]=true; d++;max++;}
			    c++;
			    }
        	}
        	if(f)System.out.println("Player "+(2-(1-c%2))+" wins on move "+c);
        	else System.out.println("Draw");
        }
	}
}


/*
 3
3 3 +
3 3 -
2 2 +
2 2 -
3 2 +
2 3 -
0

2
1 1 +
1 1 -
1 1 +
1 1 -
0
 
 2
1 1 +
1 1 -
1 1 +
1 1 -
 */