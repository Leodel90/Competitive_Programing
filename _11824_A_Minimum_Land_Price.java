import java.util.*;
public class _11824_A_Minimum_Land_Price {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();        
        for (int i = 0; i < t; i++){
			LinkedList<Integer> L= new LinkedList<Integer>();
			while(true){
				int x = leer.nextInt();
				if(x==0)break;
				L.add(x);
			}
			int p=0;
			int P[]= new int[L.size()];
			while(!L.isEmpty()){
				P[p]=L.remove();p++;
			}
			Arrays.sort(P);
		    long S=0;
		    for (int j = p-1,k=1; j >=0; j--,k++) {
				S+=Math.pow(P[j],k)*2;
				if(S>5000000)break;
			}
		    if(S<=5000000)System.out.println(S);
		    else System.out.println("Too expensive");
		}
	}
}
/*
3
7
2
10
0
20
29
31
0
42
41
40
37
20
0
*/