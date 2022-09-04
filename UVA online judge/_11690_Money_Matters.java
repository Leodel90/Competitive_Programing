import java.util.*;
public class _11690_Money_Matters {
	public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int N= leer.nextInt();
     for (int xd = 0; xd < N; xd++) {
		int n = leer.nextInt();
		int m= leer.nextInt();
		int C[]= new int [n];
		for (int i = 0; i < n; i++)C[i]= leer.nextInt();
		int P[]= new int [n];
		int R[]= new int [n];
		int X[]= new int [2];
		for (int i = 0; i < m; i++){
			LinkedList<Integer> L[]= new LinkedList[2];
			for (int j = 0; j < 2; j++){X[j]=leer.nextInt();
				L[j]= new LinkedList<Integer>();
				while(P[X[j]]!=0){L[j].add(X[j]);X[j]=P[X[j]]-1;}
			}if(X[0]!=X[1]){
				if(R[X[0]]>=R[X[1]]){
					P[X[1]]=X[0]+1;
					C[X[0]]+=C[X[1]];
					if(R[X[0]]==R[X[1]])R[X[0]]++;X[1]=X[0];
				}else{
					P[X[0]]=X[1]+1;
					C[X[1]]+=C[X[0]];X[0]=X[1];
				}
			}
			for (int j = 0; j < 2; j++){
				while(!L[j].isEmpty())P[L[j].remove()]=X[j]+1;
			}
		}
		boolean q=true;
		for (int i = 0; i < n&&q; i++){
			LinkedList<Integer>L= new LinkedList<Integer>();
			int h=i;while(P[h]!=0){L.add(h);h=P[h]-1;}
			q=C[h]==0;
			while(!L.isEmpty())P[L.remove()]=h+1;
		}
		if(q)System.out.println("POSSIBLE");
		else System.out.println("IMPOSSIBLE");
		
	}
	}
}

/*
2
5 3
100
-75
-25
-42
42
0 1
1 2
3 4
4 2
15
20
-10
-25
0 2
1 3

*/