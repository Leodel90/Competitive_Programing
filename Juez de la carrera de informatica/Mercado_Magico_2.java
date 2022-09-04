import java.util.*;
public class Mercado_Magico_2 {
	public static void main(String[] args) {
		Scanner leer= new Scanner (System.in);
		while(leer.hasNext()){
			int t = leer.nextInt();
			for (int xd = 0; xd < t; xd++) {
				int n = leer.nextInt();
				int P[]= new int [n+1];
				int F[]= new int [n+1];
			    int nroa = leer.nextInt();
			    for (int i = 1; i <=n; i++) {
					P[i]=leer.nextInt();
					F[i]=P[i]+F[i-1];
				}
			    int min=n+1;
			    for (int i = 0; i < nroa; i++) {
					String cad = leer.next();
					int x = leer.nextInt();
					int y = leer.nextInt();
					if(cad.charAt(0)=='P'){
						for (int j = min; j <=n; j++) {
							F[j]=P[j]+F[j-1];
						}
						min=n+1;
						System.out.println(F[y]-F[x-1]);
					}
					else{
						P[x]=y;
						if(x<min)min=x;
					}
				}
			}
		}
	}
}
/*
1 
4 9 
37 14 23 78 
P 2 2 
A 2 74 
A 1 75 
A 2 52 
P 2 3 
P 1 2 
P 2 2 
A 4 67
A 3 32

*/
