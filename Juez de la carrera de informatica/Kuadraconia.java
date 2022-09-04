import java.util.*;
public class Kuadraconia {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(leer.hasNext()){
        	int t = leer.nextInt();
        	for (int xd = 0; xd < t; xd++) {
				int n = leer.nextInt();
				int m = leer.nextInt();
				char C [][]= new char[n][m];
				for (int i = 0; i < n; i++) {
					C[i]= leer.next().toCharArray();
				}
				int f = leer.nextInt()-1,c=leer.nextInt()-1;
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < m; j++) {
						System.out.print(C[f][c]);
						c=(c+1)%m;
					}f=(f+1)%n;System.out.println();
				}
			}
        	
        }
	}
}

/*
3
3 5
ABRCB
RCARA
RAMNB
3 4
 
 
*/
