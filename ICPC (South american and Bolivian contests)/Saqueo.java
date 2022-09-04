import java.util.*;
public class Saqueo {
//Concurso 143
	static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
		while(true){
			int n = leer.nextInt();
			if(n>0){
				int z[]=new int [n+2];
				int p[]=new int [n];
				for (int i = 1; i <= n; i++) 
					z[i]=leer.nextInt();
				System.out.println();
				for (int i = 0; i < n; i++) {
					int s = 1;
					for (int j = 1; j <= n; j++){
						if(z[j-1]+z[j]+z[j+1]<z[s-1]+z[s]+z[s+1] && p[j-1]!=-1 || p[s-1]==-1)s=j;
					} 
					z[s-1]=0;z[s]=0;z[s+1]=0;
					p[s-1]=-1;
					System.out.print(s+" ");
				} 
				
			}else break;
		}

	}

}
