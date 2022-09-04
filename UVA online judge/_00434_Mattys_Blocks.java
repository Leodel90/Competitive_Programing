import java.util.*;
public class _00434_Mattys_Blocks {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for (int xd = 0; xd < t; xd++){
			int k = leer.nextInt();
			int C1[]= new int [9],C2[]= new int [9];
			int D1[]= new int [k],D2[]= new int [k];
			int n=0;
			for (int j = 0; j < k; j++){D1[j]=leer.nextInt();C1[D1[j]]++;}
			for (int j = 0; j < k; j++){D2[j]=leer.nextInt();C2[D2[j]]++;}
			for (int i = 0; i <=8; i++) {n+=Math.max(C1[i], C2[i])*i;}
			int m =0;
			for (int i = 0; i < k; i++){
				for (int j = 0; j < k; j++){m+=Math.min(D1[i], D2[j]);}
			}m=m-n;
			System.out.println("Matty needs at least "+n+" blocks, and can add at most "+m+" extra blocks.");
		}

	}
}

/*
3
4
2 0 3 1
1 1 2 3
1 
1 
1
4
4 3 2 1
1 2 3 4
4
2 0 3 1
1 2 2 3
*/
