import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class _01232_SKYLINE{
	static int H[],e,l,r,h;
	public static void NB(int L, int R,int x){
		if(R<l||L>r)return;
		if(H[x]>-1&&l<=L&&R<=r){
			if(H[x]<=h){e=e+R-L+1;H[x]=h;}
		}else{int m =(L+R)/2,y=x<<1;
		    if(H[x]>-1){H[y]=H[x];H[y+1]=H[x];}
			NB(L,m,y);
			NB(m+1,R,y+1);
			if(H[y]>-1&&H[y+1]>-1&&H[y]==H[y+1])H[x]=H[y];
			else H[x]=-1;
		}	
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int p=(1<<18)+1;
        for (int i = 0; i < t; i++){
			int n = Integer.parseInt(br.readLine());
			int s =0;
			H= new int[p];
			StringTokenizer G;
			for (int j = 0; j < n; j++){
				G= new StringTokenizer(br.readLine());
				l=Integer.parseInt(G.nextToken());r=Integer.parseInt(G.nextToken())-1;
				h=Integer.parseInt(G.nextToken());e=0;
				NB(1,100000,1);
				s+=e;
			}System.out.println(s);
		}br.readLine();
	}
}
/*
3
10
5 6 10
4 7 9
3 8 8
2 9 7
1 10 6
1 10 6
2 9 7
3 8 8
4 7 9
5 6 10
4
3 4 10
8 10 6
14 17 12
3 15 10
5
3 5 10
8 10 6
14 17 12
4 15 10
8 10 7
0
*/