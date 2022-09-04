import java.util.*;
public class Mediana {
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
        while(leer.hasNext()){
        	int n = leer.nextInt();
        	int V[]= new int[n];
        	for (int i = 0; i < n; i++) {
				V[i]= leer.nextInt();
			}
        	if(n%2==1){Arrays.sort(V);System.out.println(V[n/2]);}else System.out.println(-1);
        }
	}

}
