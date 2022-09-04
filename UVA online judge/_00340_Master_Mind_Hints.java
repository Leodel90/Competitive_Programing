import java.util.*;
public class _00340_Master_Mind_Hints {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int d =1;
		while(leer.hasNext()){
			int n =leer.nextInt();
			if(n>0){
				int C[]= new int[n];
				for (int i = 0; i < n; i++)
					C[i]= leer.nextInt();
				System.out.println("Game "+d+":");
				while(true){
					int K[]= new int[n];
					int s=0;
					for (int i = 0; i < n; i++){ 
						K[i]=leer.nextInt();s+=K[i];
					}
					if(s>0){
						int S=0,W=0;
						int T[]= new int [10];
						for (int i = 0; i < n; i++) {
							if(K[i]!=C[i]){
								T[K[i]]--;
								T[C[i]]++;
								if(T[K[i]]>=0)W++;
								if(T[C[i]]<=0)W++;
							}else S++;
						}
						System.out.println("    ("+S+","+W+")");						
					}else break;
				}d++;
			}else break;
		}
	}
}
