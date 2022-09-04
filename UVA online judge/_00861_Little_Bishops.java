import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00861_Little_Bishops {
	static long CK[][];
	static int n,k,bn;
	public static void RB(int s){
		LinkedList<Integer> Pi = new LinkedList<Integer>(),Pj = new LinkedList<Integer>();
		boolean q=true,qq=true;
		int i=0,j=0,v=0,c=0;
		while(true){
			if(q){
				if(qq){q=c<k&&s<n;
					if(q){
						if(s<0){i=0;j=-s;}else{j=0;i=s;}
					}
				}qq=false;
				while(i<n && j<n&&q){
					if((v&(1<<(i+j)))==0){v|=1<<(i+j);
						c++;CK[bn][c]++;Pi.add(i);Pj.add(j);
						s+=2;qq=true;
						break;
					}i++;j++;
				}
				if(q&&(i==n||j==n)){
					Pi.add(i);Pj.add(j);s+=2;qq=true;
				}q=qq;
			}
			else{
				s-=2;
				if(s<=-n)break;
				i=Pi.removeLast();j=Pj.removeLast();
				if(i<n&&j<n){c--;v=v&~(1<<(i+j));i++;j++;}
				else {i=n+1;j=i;}
				qq=false;q=true;
			}
		}
	}
	public static void main(String[] args) throws IOException {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
			while(true){
				StringTokenizer tk = new StringTokenizer(br.readLine());
				n=Integer.parseInt(tk.nextToken());
				if(n==0)break;
				k=Integer.parseInt(tk.nextToken());
				long S=0;
				if(k<=2*n-1){
					CK= new long[2][k+1];
					bn=0;RB(-(n-1));CK[0][0]=1;
					bn=1;RB(-(n-2));CK[1][0]=1;
					for (int i = 0; i <=k; i++)S+=CK[0][i]*CK[1][k-i];
				}
				pw.println(S);
			}
			pw.close();
			
	}

}
/*
8 6
4 4
1 0
1 1
8 8
8 15
8 14
8 13
8 1
8 2
0 0

*/