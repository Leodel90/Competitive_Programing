import java.util.*;
public class _10583_Ubiquitous_Religions {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int xd=1;
        while(true){
        	int n = leer.nextInt();
        	int m = leer.nextInt();
        	if(n+m==0) break;
        	int P[]= new int[n];
        	int R[]= new int[n];
        	int X[]= new int [2];
        	for (int i = 0; i < m; i++) {
        		LinkedList<Integer> L[]= new LinkedList[2];
				for (int j = 0; j < 2; j++){X[j]=leer.nextInt()-1;
				L[j]= new LinkedList<Integer>();
				 while(P[X[j]]!=0){L[j].add(X[j]);X[j]=P[X[j]]-1;}
				}
				if(X[0]!=X[1]){
					n--;
				    if(R[X[0]]>=R[X[1]]){
				    	P[X[1]]=X[0]+1;
				    	if(R[X[0]]==R[X[1]])R[X[0]]++;X[1]=X[0];
				    }else {P[X[0]]=X[1]+1;X[0]=X[1];}
				}
				for (int j = 0; j < 2; j++) {
				   while(!L[j].isEmpty())P[L[j].remove()]=X[j]+1;
				}
			}
        	System.out.println("Case "+xd+": "+n);xd++;
        	}
        }
	}