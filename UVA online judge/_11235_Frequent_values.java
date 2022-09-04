import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class _11235_Frequent_values {
	static int ST[],I[],J[],l,r,max;
	public static void  llena(int L, int R, int x){
		if(L==R){ST[x]=J[L]-I[L]+1;return;}
		int m = (L+R)/2,y=(x<<1)+1;
		llena(L,m,y);llena(m+1,R,y+1);
		ST[x]=Math.max(ST[y], ST[y+1]);
	}
	public static void Q(int L, int R, int x){
		if(r<I[L]||l>J[R])return;
		  if(l<I[L]&&J[R]<r){if(max<ST[x])max=ST[x];}
		  else{
			  if(L==R){max=Math.max(max, Math.min(J[L],r)-Math.max(I[L],l)+1);}
			  else{int m = (L+R)/2,y=(x<<1)+1;Q(L,m,y);Q(m+1,R,y+1);}
		  }
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		double u=Math.log(2);
        while(true){
        	StringTokenizer G= new StringTokenizer(br.readLine());
        	if(G.countTokens()==1)break;
        	int n=Integer.parseInt(G.nextToken());
        	int q=Integer.parseInt(G.nextToken());
        	G= new StringTokenizer(br.readLine());
        	int p=0,a=Integer.parseInt(G.nextToken());
        	I= new int[n];J= new int[n];
        	I[p]=1;
        	for (int i = 2; i <=n; i++){
        	    int x=Integer.parseInt(G.nextToken());
    		    if(a<x){J[p]=i-1;p++;a=x;I[p]=i;}
        	}
        	J[p]=n;
        	double w=(Math.log(p)/u)+1;
        	if((int)w<w)w++;
        	ST= new int [1<<(int)w];
        	llena(0,p,0);
        	for (int i = 0; i < q; i++){
				G= new StringTokenizer(br.readLine());
				l=Integer.parseInt(G.nextToken());r=Integer.parseInt(G.nextToken());
				max=-1;
				Q(0,p,0);
				System.out.println(max);
			}
       }
	}
}

/*
10 3
-1 -1 1 1 1 1 3 10 10 10
2 3
1 10
5 10
0
*/