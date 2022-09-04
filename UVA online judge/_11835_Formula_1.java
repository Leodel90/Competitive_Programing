import java.util.*;
public class _11835_Formula_1 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(true){
        	int g = leer.nextInt();
        	int p = leer.nextInt();
        	if(g+p==0)break;
        	int C[][]= new int [g][p];
        	for (int i = 0; i < g; i++) {
				for (int j = 0; j < p; j++) 
					C[i][leer.nextInt()-1]=j;
			}
        	int s = leer.nextInt();
        	for (int i = 0; i < s; i++){
				int n= leer.nextInt();
				int P[]= new int [p];
				int K[]= new int [n];
				int max = 0;
				for (int j = 0; j < n; j++){
					K[j]=leer.nextInt();
				    for (int k = 0; k < g; k++){
				 	   P[C[k][j]]+=K[j];
				       if(P[C[k][j]]>max)max=P[C[k][j]];
				    }
			    }
				boolean q=false;
                for (int j = 0; j < p; j++){
					if(max==P[j]){
					if(q)System.out.print(" ");
						else q=true;
						System.out.print(j+1);
					}
				}System.out.println();
			}
        	
        }
	}
}
