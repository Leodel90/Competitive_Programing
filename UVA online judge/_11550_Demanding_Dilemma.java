import java.util.*;
public class _11550_Demanding_Dilemma {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int xd = 0; xd < t; xd++){
			int n = leer.nextInt();
			int m = leer.nextInt();
			boolean M[][]= new boolean [n][n];
			int E[]= new int[m];
			boolean r =true;
			for (int i = 0; i < n; i++){
				for (int j = 0; j < m; j++){
					if(leer.nextInt()==1){
						if(E[j]!=0){
						   r=r&&E[j]!=-1&&!M[E[j]-1][i];
						   if(r){M[E[j]-1][i]=true;M[i][E[j]-1]=true;E[j]=-1;}
						}else E[j]=i+1;	
					}
				}
			}
			for (int i = 0; i < m&&r; i++)r=E[i]==-1; 
				
			if(r)System.out.println("Yes");
			else System.out.println("No");
		}
	}
}
