import java.util.*;
public class _01197_The_Suspects2 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(true){
        	int n = leer.nextInt();
        	int m = leer.nextInt();
        	if(n+m==0)break;
        	int P[]= new int [n];
        	int R[]= new int [n];
        	int C[]= new int [n];
        	for (int i = 0; i < m; i++){
				int k = leer.nextInt();int X[]= new int [2];
				if(k>=1)X[0]=leer.nextInt();
				for (int j = 1; j < k; j++){
					X[1] = leer.nextInt();
					LinkedList<Integer> L[]= new LinkedList[2];
					for (int l = 0; l < 2; l++){L[l]= new LinkedList<Integer>();
						while(P[X[l]]!=0){L[l].add(X[l]);X[l]=P[X[l]]-1;}
						if(C[X[l]]==0)C[X[l]]=1;
					}
					if(X[0]!=X[1]){
						if(R[X[0]]>=R[X[1]]){P[X[1]]=X[0]+1;
						while(!L[1].isEmpty())P[L[1].remove()]=X[0]+1;
						C[X[0]]+=C[X[1]];
					    if(R[X[0]]==R[X[1]])R[X[0]]++;
						}else{P[X[0]]=X[1]+1;
							while(!L[0].isEmpty())P[L[0].remove()]=X[1]+1;
							C[X[1]]+=C[X[0]];
						}
					}
				}
			}
        	int x=0;
        	while(P[x]!=0)x=P[x]-1;
        	System.out.println(Math.max(C[x], 1));
        }
	}
}

