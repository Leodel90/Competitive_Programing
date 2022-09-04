import java.util.*;
public class _11588_Image_Coding {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int x = leer.nextInt();
        for (int xd = 1; xd <=x; xd++) {
			int r=leer.nextInt();
			int c = leer.nextInt();
			int m= leer.nextInt();
			int n=  leer.nextInt();
			int V[]= new int [26];
			int M=0,max=0;
			for (int i = 0; i < r; i++){String cad=leer.next();
				for (int j = 0; j < c; j++){
					int t=cad.charAt(j)-65;
					V[t]++;
					if(V[t]>=max){
						if(V[t]>max){M=V[t];max=V[t];}
						else M+=V[t]; 
					}
				}
			}M=(r*c-M)*n+M*m;
			System.out.println("Case "+xd+": "+M);
		}
	}
}
