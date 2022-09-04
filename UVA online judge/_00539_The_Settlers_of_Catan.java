import java.io.*;
import java.util.*;
public class _00539_The_Settlers_of_Catan {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer tk;
		while(true){
			tk= new  StringTokenizer(br.readLine());
			int n=Integer.parseInt(tk.nextToken()),m=Integer.parseInt(tk.nextToken());
			if(n==0)break;
			LinkedList<Integer> E[]= new LinkedList[n];
			for (int i = 0; i < n; i++)E[i]=new LinkedList<Integer>();
			for (int i = 0,a,b; i < m; i++){tk= new StringTokenizer(br.readLine());
				a=Integer.parseInt(tk.nextToken());b=Integer.parseInt(tk.nextToken());E[a].add(b);E[b].add(a);
			}
			int max =0;
			for (int i = 0,x,nx,r,c; i < n; i++){
				x=i;boolean V[][]= new boolean[n][n],q=true,qq=true;r=0;c=0;
				LinkedList<Integer>Pr= new LinkedList<Integer>(),Px= new LinkedList<Integer>();
				while(true){
					if(q){
						if(qq){max=Math.max(max,c);r=E[x].size();}
						while(r>0){
							nx=E[x].removeFirst();E[x].add(nx);
							if(!V[x][nx]){V[x][nx]=true;V[nx][x]=true;Px.add(x);Pr.add(r);qq=true;c++;x=nx;break;
							}r--;
						}
						q=r>0;
					}else{
						if(Pr.isEmpty())break;
						r=Pr.removeLast()-1;x=Px.removeLast();
						nx=E[x].getLast();V[x][nx]=false;V[nx][x]=false;c--;
						qq=false;q=true;
					}
				}
			}
			pw.println(max);
		}
		pw.close();
	}
}
/*
3 2
0 1
1 2
15 16
0 2
1 2
2 3
3 4
3 5
4 6
5 7
6 8
7 8
7 9
8 10
9 11
10 12
11 12
10 13
12 14
0 0
*/
