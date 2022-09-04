import java.util.*;
public class _11360_Have_fun_with_Matrices {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int xd = 1; xd <=t; xd++) {
        	int n = leer.nextInt();
        	int M[][]= new int [n][n];
        	for (int i = 0; i < n; i++) {
				String c = leer.next();
				for (int j = 0; j < n; j++){
					M[i][j]=c.charAt(j)-48;
				}
			}
        	int S=0;
        	int m = leer.nextInt();
        	for (int i = 0; i < m; i++) {
				String cad = leer.next();
				if(cad.charAt(0)=='r'||cad.charAt(0)=='c'){
					int a = leer.nextInt()-1;
					int b = leer.nextInt()-1;
					if(cad.charAt(0)=='r'){
						for (int j = 0; j < n; j++) {
							int aux=M[a][j];
							M[a][j]=M[b][j];M[b][j]=aux;
						}
					}else {
						for (int j = 0; j < n; j++) {
							int aux=M[j][a];
							M[j][a]=M[j][b];M[j][b]=aux;
						}
					}
				}else {
					if(cad.charAt(0)=='t'){
						for (int j = 0; j < n; j++) {
							for (int k = j+1; k < n; k++) {
								int aux=M[j][k];
								M[j][k]=M[k][j];M[k][j]=aux;
							}
						}
					}
					else{
						if(cad.charAt(0)=='i')S++;
						else S--;
					}
				}
			}
        	System.out.println("Case #"+xd);
        	for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++){
					System.out.print((M[i][j]+S+50)%10);
				}System.out.println();
			}
        	System.out.println();
		}
	}
}
