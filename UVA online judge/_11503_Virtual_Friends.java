import java.util.*;
public class _11503_Virtual_Friends {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int i = 0; i < t; i++){
			int f = leer.nextInt();
			int  P[]= new int [f<<1];
			int  R[]= new int [f<<1];
			int  C[]= new int [f<<1];
			int X[]= new int [2];
			int p=0;
			TreeMap<String, Integer> M = new TreeMap<String, Integer>();
			for (int j = 0; j < f; j++){
				LinkedList<Integer> L[]= new LinkedList[2];
				for (int k = 0; k < 2; k++){
					String cad = leer.next();
					L[k]= new LinkedList<Integer>();
					if(!M.containsKey(cad)){M.put(cad, p);p++;}
					X[k]=M.get(cad);
					while(P[X[k]]!=0){L[k].add(X[k]);X[k]=P[X[k]]-1;}
					if(C[X[k]]==0)C[X[k]]=1;
				}
				if(X[0]!=X[1]){
					if(R[X[0]]>=R[X[1]]){
						P[X[1]]=X[0]+1;
						C[X[0]]+=C[X[1]];
						if(R[X[0]]==R[X[1]])R[X[0]]++;
						X[1]=X[0];
					}else{P[X[0]]=X[1]+1;C[X[1]]+=C[X[0]];X[0]=X[1];}
				}
				System.out.println(C[X[0]]);
				for (int k = 0; k < 2; k++){
					while(!L[k].isEmpty())P[L[k].remove()]=X[k]+1;
				}
			}
			
		}
	}
}
