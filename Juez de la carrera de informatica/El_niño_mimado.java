import java.util.*;
public class El_niño_mimado {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(true){
			int n= leer.nextInt();
			int m = leer.nextInt();
			int v[] = new int[n];
			int ini=0;
			for (int i = 0; i < n; i++) {
				v[i]=leer.nextInt();
				if(v[i]>ini)ini=v[i];
			}
			while(true){
				int c=ini,p=m;
				int k=0;


				while(p>0&&k<n){
					if(c>=v[k]){c=c-v[k];k++;}
					else{c=ini;p--;}
				}

				if(k==n)break;
				ini++;
			}
			System.out.println(ini);
		}
	}
}
/*
5 3 
1 2 3 4 5
3 2
4 78 9
4 2
3 5 7 2
4 3
3 5 7 2
2 100000000 
5 9
*/
 