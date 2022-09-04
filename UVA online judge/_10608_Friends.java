import java.util.*;
public class _10608_Friends {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int xd= 0; xd < t;xd++){
			int n =leer.nextInt();
			int m = leer.nextInt();
			int P[]= new int [n];
			int R[]= new int [n];
			int C[]= new int [n];
			int X[]= new int [2];
			int max=1;
			for (int i = 0; i < m; i++) {
				LinkedList<Integer> L[]= new LinkedList[2];
				for (int j = 0; j < 2; j++) {X[j]= leer.nextInt()-1;
				L[j]= new LinkedList<Integer>();
					while(P[X[j]]!=0){L[j].add(X[j]);X[j]=P[X[j]]-1;}
					if(C[X[j]]==0)C[X[j]]=1;
				}
				if(X[0]!=X[1]){
					if(R[X[0]]>=R[X[1]]){
						P[X[1]]=X[0]+1;
						C[X[0]]+=C[X[1]];if(R[X[0]]==R[X[1]])R[X[0]]++;
						X[1]=X[0];
						if(C[X[0]]>max)max=C[X[0]];
					}else{P[X[0]]=X[1]+1;C[X[1]]+=C[X[0]];X[0]=X[1];
					if(C[X[1]]>max)max=C[X[1]];
					}
				}
				for (int j = 0; j < 2; j++){
					while(!L[j].isEmpty())P[L[j].remove()]=X[j]+1;
				}
			}
			System.out.println(max);
		}
	}
}
/*
*/