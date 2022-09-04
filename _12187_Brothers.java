import java.util.*;
public class _12187_Brothers {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		try{
			while(true){
				int n= leer.nextInt();
				int r = leer.nextInt();
				int c = leer.nextInt();
				int k= leer.nextInt();
				int K[][]= new int [r+2][c+2];
				for (int i = 1; i <=r; i++){
					for (int j = 1; j <=c; j++) 
					K[i][j]=leer.nextInt()+1;
				}
				int X[]={-1,0,1,0};
				int Y[]={0,1,0,-1};
				for (int q = 0; q < k; q++){
					int V[][]= new int [r+2][c+2];
					for (int i = 1; i <=r; i++){
						for (int j = 1; j <=c; j++){V[i][j]=K[i][j];
							for (int l = 0; l < 4; l++){
								if(K[i+X[l]][j+Y[l]]>0&&K[i+X[l]][j+Y[l]]%n+1==K[i][j]){V[i][j]=K[i+X[l]][j+Y[l]];break;}
							}
						}
					}
					for (int i = 1; i <=r; i++){
						for (int j = 1; j <=c; j++)
							K[i][j]=V[i][j];
					}
				}
				for (int i = 1; i <=r; i++) {
					for (int j = 1; j <=c; j++){
						if(j>1)System.out.print(" ");
						System.out.print(K[i][j]-1);
					}System.out.println();
				}
			}
		}catch(Exception e){}

	}

}
