import java.util.*;
public class _10685_Nature {
	public static void main(String[] args) {
	 	Scanner leer = new Scanner(System.in);
        while(true){
        	int c = leer.nextInt();
        	int r= leer.nextInt();
        	if(c+r==0)break;
        	int P[]= new int [c];
        	int R[]= new int [c];
        	int C[]= new int [c];
        	TreeMap<String, Integer> M= new TreeMap<String, Integer>();
        	for (int i = 0; i < c; i++){
				String cad = leer.next();
				M.put(cad, i);
			}
        	int X[]= new int [2];
        	int max =1;
        	for (int i = 0; i < r; i++){
        		LinkedList<Integer>L[]= new LinkedList[2];
        		for (int j = 0; j < 2; j++){
        			L[j]=new LinkedList<Integer>();
				     String cad = leer.next();
				     X[j]=M.get(cad);
				     while(P[X[j]]!=0){L[j].add(X[j]);X[j]=P[X[j]]-1;}
				     if(C[X[j]]==0)C[X[j]]=1;
				}
        		if(X[0]!=X[1]){
        			if(R[X[0]]>=R[X[1]]){
        				P[X[1]]=X[0]+1;
        				C[X[0]]+=C[X[1]];
        				if(R[X[0]]==R[X[1]])R[X[0]]++;X[1]=X[0];
        			}else{P[X[0]]=X[1]+1;C[X[1]]+=C[X[0]];
        			X[0]=X[1];
        			}
        			if(C[X[0]]>max)max=C[X[0]];
        		}
        		for (int j = 0; j < 2; j++) {
					while(!L[j].isEmpty()){P[L[j].remove()]=X[j]+1;}
				}
			}
        	System.out.println(max);
        }
	}
}

