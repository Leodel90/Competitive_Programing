import java.util.*;
public class _12532_Interval_Product{
	static int P[],S[],s,l,r;
	public static void llena(int L, int R, int x){
		if(L==R){S[x]=P[L];return;}
		int m = (L+R)/2,y=(x<<1)+1;
		llena(L,m,y);llena(m+1,R,y+1);
		S[x]=S[y]*S[y+1];
	}
	public static void act(int L,int R, int x){
		if(L==R){S[x]=r;return;}
		int m = (L+R)/2,y=(x<<1)+1;
		if(l<=m)act(L,m,y);else act(m+1,R,y+1);
		S[x]=S[y]*S[y+1];
	}
	public static void Q(int L, int R, int x){
		if(L>r||l>R)return;
		if(L<l||R>r){
			int m=(L+R)/2,y=(x<<1)+1;
			Q(L,m,y);Q(m+1,R,y+1);
		}else s*=S[x];
	}
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		double u= Math.log(2);
        try{while(true){
        	int n = leer.nextInt();
        	int k = leer.nextInt();
        	P= new int[n];
        	for (int i = 0; i < n; i++){int x=leer.nextInt();
        	if(x!=0){if(x>0)P[i]=1;else P[i]=-1;}
        	}
        	double y=Math.log(n)/u+1;if((int)y<y)y++;
        	S= new int[1<<(int)y];
        	llena(0,n-1,0);
        	for (int i = 0; i < k; i++){
				if(leer.next().charAt(0)=='P'){s=1;l=leer.nextInt()-1;r=leer.nextInt()-1;
				  Q(0,n-1,0);
				  char e;if(s!=0){if(s==1)e='+';else e='-';}else e='0';
				  System.out.print(e);
				}else{l = leer.nextInt()-1;r=leer.nextInt();if(r!=0){if(r>0)r=1;else r=-1;}act(0,n-1,0);}
			}
        	System.out.println();
        }
        }catch(Exception e){}
	}
}

/*
4 6
-2 6 0 -1
C 1 10
P 1 4
C 3 7
P 2 2
C 4 -5
P 1 4
5 9
1 5 -2 4 3
P 1 2
P 1 5
C 4 -5
P 1 5
P 4 5
C 3 0
P 1 5
C 4 -5
C 4 -5

*/