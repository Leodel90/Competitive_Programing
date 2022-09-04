import java.util.*;
public class _10050_Hartals {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int xd = 0; xd < t; xd++) {
			int n = leer.nextInt();
			boolean N[]= new boolean[n+1];
			int p= leer.nextInt();
			int c =0;
			for (int i = 0; i < p; i++){
				int h=leer.nextInt();
				int r=h;
				while(r<=n){
					if(!N[r] && (r+1)%7>1)c++;
					N[r]=true;r=r+h;
				}
			}
			System.out.println(c);
		}
	}
}

/*
2
14
3
3
4
8
100
4
12
15
25
40
*/