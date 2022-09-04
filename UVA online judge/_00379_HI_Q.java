import java.util.*;
public class _00379_HI_Q {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int n =leer.nextInt();
        System.out.println("HI Q OUTPUT");
        for (int xd = 0; xd < n; xd++){
			int B[][]= new int[7][7];
			int X[]= new int[34];
			int Y[]= new int[34];
			int c=1;
			for (int i = 0; i < 2; i++) {
				for (int j = 2; j < 5; j++) {
					X[c]=i;Y[c]=j;
					B[i][j]=c;c++;
				}
			}
			for (int i = 2; i < 5; i++) {
				for (int j = 0; j < 7; j++) {X[c]=i;Y[c]=j;
					B[i][j]=c;c++;
				}
			}
			for (int i = 5; i < 7; i++) {
				for (int j = 2; j < 5; j++) {X[c]=i;Y[c]=j;
					B[i][j]=c;c++;
				}
			}boolean V[]= new boolean[34];
			int g=-1;
			for (int i = 1; i <=33; i++){
				if(i>g&&g!=0)g= leer.nextInt();
				V[i]=i==g;
			}
			if(g>0)leer.nextInt();
			int x[]={-1,0,1,0},a,b,k=33;
			int y[]={0,1,0,-1};
			while(k>0){
				if(!V[k]){
				int p=0,r=0,s=0;
				for (int i = 0; i < 4; i++){a=X[k];b=Y[k];
				boolean q=true;
					for (int j = 0; j<2&&q; j++){
						a+=x[i];b+=y[i];
						q=a>=0&&b>=0&&a<7&&b<7&&B[a][b]>0&&V[B[a][b]];
					}
				    if(q&&B[a][b]>B[r][s]){r=a;s=b;p=i;}
				}
				if(r+s>0){
					V[k]=true;
					V[B[r][s]]=false;
					r=r-x[p];s=s-y[p];
					V[B[r][s]]=false;
					k=34;
				}
				}
				k--;
			}
			int s=0;
			for (int i = 1; i < 34; i++){
				if(V[i])s+=i;
			}
			System.out.println(s);
		}
        System.out.println("END OF OUTPUT");
	}
}
/*
4
10 12 17 19 25  0 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
16 17 18 19 20
21 22 23 24 25 26    27 28 29 30 31 32 33 0
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 18 19 20
21 22 23 24 25 26 27 28 29 30 31 32 33 0 


*/