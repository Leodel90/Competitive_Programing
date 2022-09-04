import java.util.*;
public class _11222_Only_I_did_it {
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for (int i = 1; i <=t; i++){
			boolean M[][]= new boolean[3][10001];
			int P[]= new int [10001];
			int C[]= new int [3];
			int m=0;
			for (int j = 0; j <3; j++){
				int s= leer.nextInt();
				for (int k = 0; k < s; k++){
					int h= leer.nextInt();
					if(P[h]>0){
						for (int l = j-1; l>=0; l--){
							if(M[l][h]){C[l]--;M[l][h]=false;}
						}
					}else {C[j]++;M[j][h]=true;}
					P[h]++;
				}
			}m=Math.max(C[0], Math.max(C[1],C[2]));
            System.out.println("Case #"+i+":");
			for (int j = 0; j<3; j++){
				if(C[j]==m){
					System.out.print(j+1+" "+m);
					for (int k = 0; k <=10000; k++){
					    if(M[j][k]&&P[k]==1)System.out.print(" "+k);
					}System.out.println();
				}
			}
			
		}
	}
}

/*
4
3 1 2 3
4 4 5 6 7
5 8 9 10 11 12
2 1 5
2 2 3
3 2 3 1
6 400 401 402 403 404 405
2 101 100
7 400 401 402 403 404 405 406
1 1
1 2
1 3

*/