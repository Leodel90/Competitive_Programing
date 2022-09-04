import java.util.*;
public class _10855_Rotated_squares{
	public static void main(String[] args){
		Scanner leer  = new Scanner(System.in);
		while(true){
		int N = leer.nextInt();
        int n = leer.nextInt();
        if(N+n==0)break;
        char S[][]= new char[N][N];
        for (int i = 0; i < N; i++) {
			String h = leer.next();
			for (int j = 0; j < N; j++) 
				S[i][j]=h.charAt(j);
		}
        char s[][]= new char[n][n];
        for (int i = 0; i < n; i++){
        	String h = leer.next();
			for (int j = 0; j < n; j++) 
			    s[i][j]=h.charAt(j);
		}
        N=N-n+1;
        int c[]= new int [4];
        int Ain[]={0,-1,0,1};
        int Bin[]={1,0,-1,0};
        int A[]={0,n-1,n-1,0};
        int B[]={0,0,n-1,n-1};
        int Aex[]={1,0,-1,0};
        int Bex[]={0,1,0,-1};
        for (int i = 0; i < N; i++){
			for (int j = 0; j < N; j++){
				for (int k = 0; k < 4; k++){
					int a=A[k],b=B[k];boolean q=true;
					for (int l = 0; l < n&&q; l++){if(k%2==0)b=B[k];
					else a=A[k];
						for (int m = 0; m < n&&q; m++){
							q=s[a][b]==S[i+l][j+m];
							a+=Ain[k];b+=Bin[k];
						}
						a+=Aex[k];b+=Bex[k];
					}
					if(q)c[k]++;
				}
			}
		}
        System.out.println(c[0]+" "+c[1]+" "+c[2]+" "+c[3]);
		}
	}
}
