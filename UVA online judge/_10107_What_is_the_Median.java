import java.util.*;
public class _10107_What_is_the_Median {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		LinkedList<Integer> L= new LinkedList<Integer>();
		try{
			while(true)
				L.add(leer.nextInt());
		}catch(Exception e){}
		int p = L.size();
		long N[]= new long[p];
		for (int i = 0; i < p; i++){
			N[i]=L.remove();
			int h =i;
			while(h>0){
				if(N[h]>N[h-1]){long aux=N[h];N[h]=N[h-1];N[h-1]=aux;h--;}
				else break;
			}
			if(i%2==1)
				System.out.println((N[i/2]+N[i/2+1])/2);
			else System.out.println(N[i/2]);
		}
	}
}
/*
1
3
4
60
70
50
2

*/