import java.util.*;
public class _00394_Mapmaker{
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int r = leer.nextInt();
        String N[]= new String[n];
        int B []= new int[n];
        int C[]= new int [n];
        int D[]= new int [n];
        LinkedList<Integer> L[]= new LinkedList [n];
        LinkedList<Integer> U[]= new LinkedList [n];
        for (int i = 0; i < n; i++){
			N[i]=leer.next();
			B[i]=leer.nextInt();
			C[i]=leer.nextInt();
			D[i]=leer.nextInt();
			L[i]=new LinkedList<Integer>();
			U[i]=new LinkedList<Integer>();
			for (int j = 0; j < D[i]; j++) {L[i].add(leer.nextInt());U[i].add(leer.nextInt());}
		}
        for (int i = 0; i < r; i++) {
			String t= leer.next();
			int p=0;
			for (int j = 0; j < n; j++){if(N[j].equals(t)){p=j;break;}}
			int P[]= new int[D[p]];
			for (int j = 0; j < D[p]; j++)P[j]=leer.nextInt();
			long Ca= C[p];
			long R=B[p]-C[p]*L[p].getLast()+Ca*P[D[p]-1];
			if(D[p]>1){
				for (int j = D[p]-2; j >=0; j--){
					int l=L[p].removeLast(),u=U[p].removeLast();
					long k=Ca*(u-l+1);
					R+=k*P[j];Ca=k;
					L[p].addFirst(l);U[p].addFirst(u);
					R-=Ca*L[p].getLast();
				}
				L[p].addFirst(L[p].removeLast());
				U[p].addFirst(U[p].removeLast());
			}
			String Res="["+P[0];
			for (int j = 1; j < D[p]; j++) Res+=", "+P[j];
			Res+="] = ";
			System.out.println(t+Res+R);
		}
	}
}

/*
3 4
ONE    1500 2 2 0 3 1 5
TWO   2000 4 3 1 4 0 5 5 10
THREE   3000 1 1 1 9
ONE 2 4
THREE 7
TWO 2 0 6
TWO 3 3 9

*/