import java.util.*;
public class _11136_Hoax_or_what {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(true){
        	int n = leer.nextInt();
        	if(n==0)break;
        	int B[]= new int [1000001];
        	TreeSet<Integer> T= new TreeSet<Integer>();
        	long r =0;
        	for (int i = 0; i < n; i++){
				int k = leer.nextInt();
				for (int j = 0; j < k; j++){
					int b=leer.nextInt();
					if(B[b]==0)T.add(b);
					B[b]++;
				}
				int ls=T.last(),li=T.first();
				r=r+ls-li;B[ls]--;B[li]--;
				if(B[ls]==0)T.pollLast();
				if(B[li]==0)T.pollFirst();
			}System.out.println(r);
        }
	}
}

/*
5
3 1 2 3
2 1 1
4 10 5 5 1
0
1 2
2
2 1 2
2 1 2
0
*/