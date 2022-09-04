import java.util.*;
public class _10189_Minesweeper {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int d=1;
		while(leer.hasNext()){
		 int n= leer.nextInt();
		 int m =leer.nextInt();
		 if(n+m>0){
			 int M[][]= new int[n+2][m+2];
			 for (int i = 1; i <=n; i++) {
				String cad = leer.next();
				for (int j = 1; j <=m; j++) {
					if(cad.charAt(j-1)=='*'){
						M[i][j]='*';
						if(M[i-1][j-1]!='*')M[i-1][j-1]++;
						if(M[i-1][j]!='*')M[i-1][j]++;
						if(M[i-1][j+1]!='*')M[i-1][j+1]++;
						if(M[i][j-1]!='*')M[i][j-1]++;
						if(M[i][j+1]!='*')M[i][j+1]++;
						if(M[i+1][j-1]!='*')M[i+1][j-1]++;
						if(M[i+1][j]!='*')M[i+1][j]++;
						if(M[i+1][j+1]!='*')M[i+1][j+1]++;
					}
				}
			}if(d!=1)System.out.println();
			 System.out.println("Field #"+d+":");
			 for (int i = 1; i <=n; i++){
				for (int j = 1; j <=m; j++){
					if(M[i][j]=='*')
					System.out.print((char)M[i][j]);
					else System.out.print(M[i][j]);
				}System.out.println();
			}d++;
			
		 }else break;
		}
	}
}
