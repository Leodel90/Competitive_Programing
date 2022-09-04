import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import javax.swing.InputMap;
public class _11402_Ahoy_Pirates{
	static int BU[],s,l,r;
	static char LP[];
	static char H;
	static LinkedList<Integer>T;
	static LinkedList<String>P;
	public static void llena(int L, int R, int x){
		LP[x]=' ';
		if(R==L){if(s==T.getFirst()){T.remove();P.remove();s=0;}
		if(P.getFirst().charAt(s%P.getFirst().length())=='1')BU[x]=1;
		s++;
		return;}
		int m=(L+R)/2,y=(x<<1)+1;
		llena(L,m,y);
		llena(m+1,R,y+1);
		BU[x]=BU[y]+BU[y+1];
	}
	public static void C(int L, int R, int x){
		int t= R-L+1,a=(x-1)/2;
		if(x>0&&LP[a]!=' '){
			if(LP[a]=='I'){BU[x]=t-BU[x];
			if(LP[x]!=' '){
				if(LP[x]!='I'){if(LP[x]=='F')LP[x]='E';else LP[x]='F';
				}else LP[x]=' ';
			}else LP[x]='I';
			}
			else {if(LP[a]=='F')BU[x]=t;else BU[x]=0;
			LP[x]=LP[a];
			} 
		}
		if(R<l||L>r)return;
		int m=(L+R)/2,y=(x<<1)+1;
		if(l<=L&&R<=r){
			if(H=='I'){BU[x]=t-BU[x];
			if(LP[x]!=' '){
				if(LP[x]!='I'){
					if(LP[x]=='F')LP[x]='E';else LP[x]='F';
				}else LP[x]=' ';
			}else LP[x]='I';
			}else{if(H=='F')BU[x]=t;else BU[x]=0;
			LP[x]=H;
			}
	    }else{
		C(L,m,y);C(m+1,R,y+1);
		BU[x]=BU[y]+BU[y+1];
		LP[x]=' ';
		}
	}
	public static void S(int L, int R, int x){
		int t= R-L+1,a=(x-1)/2;
		if(x>0&&LP[a]!=' '){
			if(LP[a]=='I'){BU[x]=t-BU[x];
			if(LP[x]!=' '){
				if(LP[x]!='I'){if(LP[x]=='F')LP[x]='E';else LP[x]='F';
				}else LP[x]=' ';
			}else LP[x]='I';
			}
			else{if(LP[a]=='F')BU[x]=t;else BU[x]=0;
			LP[x]=LP[a];}
		}
		if(R<l||L>r) return;
		if(l<=L&&R<=r){s+=BU[x];return;}
		int m=(L+R)/2,y=(x<<1)+1;S(L,m,y);S(m+1,R,y+1);
		BU[x]=BU[y]+BU[y+1];
		LP[x]=' ';
	}
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int W = Integer.parseInt(br.readLine());
        double u=Math.log(2);
        for (int xd = 1; xd <=W; xd++){
        	int m = Integer.parseInt(br.readLine()),n=0;
        	T= new LinkedList<Integer>();
        	P= new LinkedList<String>();
        	for (int i = 0; i < m; i++){
				T.add( Integer.parseInt(br.readLine()));
				P.add(br.readLine());
				T.add(T.removeLast()*P.getLast().length());
				n+=T.getLast();
			}
        	double y=Math.log(n)/u+1;
        	if((int)y<y)y++;
        	BU= new int[1<<(int)y];
        	LP=new char [1<<(int)y];s=0;
        	llena(0,n-1,0);
        	int q = Integer.parseInt(br.readLine());
        	System.out.println("Case "+xd+":");int c=1;
        	for (int i = 0; i < q; i++){
        		StringTokenizer R= new StringTokenizer(br.readLine());
				H=R.nextToken().charAt(0);
				l=Integer.parseInt(R.nextToken());
				r=Integer.parseInt(R.nextToken());
				if(H=='S'){s=0;S(0,n-1,0);System.out.println("Q"+c+": "+s);c++;}
				else C(0,n-1,0);
			}
		}
	}
}

/*
2
2
5
10
2
1000
5
F 0 17
I 0 5
S 1 10
E 4 9
S 2 10
3
3
1
4
0
2
0
2
I 0 2
S 0 8


1
2
5
10
3
101
10
F 0 18
I 2 10
I 2 3
S 2 3
S 0 17
S 0 5
S 1 10

1
2
5
10
3
101
10
I 2 10
F 4 7
I 0 18
S 4 7

1
2
5
11
3
111
10
I 4 6
I 2 8
I 0 10
S 4 6
I 4 6
S 4 6

1
2
5
11
3
111
10
I 4 6
I 2 8
I 0 10
F 4 6
S 4 6

S 4 6

*/
