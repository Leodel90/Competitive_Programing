import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class _12086_Potentiometers{
	static int P[],l,r;
	static long s,S[];
	public static void llena(int L, int R, int x){
		if(L==R){S[x]=P[L];return;}
		int m= (L+R)/2,y=(x<<1)+1;
		llena(L,m,y);llena(m+1,R,y+1);
		S[x]=S[y]+S[y+1];
	}
	public static void S(int L, int R,int x){
		if(R==L){S[x]=r;return;}
		int m= (L+R)/2,y=(x<<1)+1;
		if(l<=m)S(L,m,y);
		else S(m+1,R,y+1);
		S[x]=S[y]+S[y+1];
	}
	public static void Q(int L, int R, int x){
		if(L>r||R<l)return;
		if(L<l||R>r){int m=(L+R)/2,y=(x<<1)+1;Q(L,m,y);Q(m+1,R,y+1);}
		else s+=S[x];
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		double u = Math.log(2);
		int e=1;
        while(true){
        	int n = Integer.parseInt(br.readLine());
        	if(n==0)break;
        	P= new int [n];
        	for (int i = 0; i < n; i++)P[i]=Integer.parseInt(br.readLine());
        	double y=Math.log(n)/u+1;if((int)y<y)y++;
        	S= new long[1<<(int)y];
        	llena(0,n-1,0);
        	if(e>1)System.out.println();
        	System.out.println("Case "+e+":");e++;
        	while(true){
        		StringTokenizer q = new StringTokenizer(br.readLine());
        		if(q.countTokens()==1)break;
        		String h=q.nextToken();
        		l=Integer.parseInt(q.nextToken())-1;
        		r=Integer.parseInt(q.nextToken());
				if(h.charAt(0)=='M'){s=0;r--;Q(0,n-1,0);System.out.println(s);}
				else S(0,n-1,0);
			}
        }
	}
}
/*
3
100
100
100
M 1 1
M 1 3
S 2 200
M 1 2
S 3 0
M 2 3
END
10
1
2
3
4
5
6
7
8
9
10
M 1 10
END
0


*/