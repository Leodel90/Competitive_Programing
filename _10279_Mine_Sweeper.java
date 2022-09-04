import java.util.*;
public class _10279_Mine_Sweeper {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
        int t = leer.nextInt();
        for (int i = 0; i < t; i++){
			int n = leer.nextInt();
			int M[][]= new int [n+2][n+2];
			boolean V[][]= new boolean[n+2][n+2];
			for (int j = 1; j <=n; j++) {
				String cad = leer.next();
				for (int k = 1; k <=n; k++) {
					if(cad.charAt(k-1)=='*'){
						M[j][k]='*';
						if(M[j-1][k-1]!='*')M[j-1][k-1]++;
						if(M[j-1][k]!='*')M[j-1][k]++;
						if(M[j-1][k+1]!='*')M[j-1][k+1]++;
						if(M[j][k-1]!='*')M[j][k-1]++;
						if(M[j][k+1]!='*')M[j][k+1]++;
						if(M[j+1][k-1]!='*')M[j+1][k-1]++;
						if(M[j+1][k]!='*')M[j+1][k]++;
						if(M[j+1][k+1]!='*')M[j+1][k+1]++;
					}
				}
			}
			boolean m=false;
			for (int j = 1; j <=n; j++){
				String cad = leer.next();
				for (int k = 1; k <=n; k++){
					if(cad.charAt(k-1)=='x'){V[j][k]=true;
						m=m||M[j][k]=='*';}
				}
			}
			if(i>0)System.out.println();
			for (int j = 1; j <=n; j++){
				for (int k = 1; k <=n; k++){
					if(V[j][k]||m&&M[j][k]=='*'){
						if(M[j][k]=='*')System.out.print('*');
						else System.out.print(M[j][k]);
					}else System.out.print('.');
				}System.out.println();
			}
		}
        
	}
}
