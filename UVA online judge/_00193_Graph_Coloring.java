import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00193_Graph_Coloring{
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
        int m = Integer.parseInt(br.readLine());
        StringTokenizer tk;
        for (int xd = 0; xd < m; xd++){
        	tk= new StringTokenizer(br.readLine());
        	int n = Integer.parseInt(tk.nextToken()),k= Integer.parseInt(tk.nextToken());
			LinkedList<Integer> G[]= new LinkedList[n];
			for (int i = 0; i < n; i++)G[i]=new LinkedList<Integer>();
			for (int i = 0,x,y; i < k; i++){
				tk= new StringTokenizer(br.readLine());
				x=Integer.parseInt(tk.nextToken())-1;y=Integer.parseInt(tk.nextToken())-1;
				G[x].add(y);G[y].add(x);
			}
			int minB= Integer.MAX_VALUE,r;
			boolean R[] = null,V[],q;
			LinkedList<Integer> PN;
			for (int i = 0,p,cb; i < n; i++){p=i;cb=0;
			V= new boolean[n];q=true;PN= new LinkedList<Integer>();
				for (int j = 0; j < n&&q; j++,p=(p+1)%n){
					if(!V[p]){V[p]=true;PN.add(p);
					    for (int l = 0,L=G[p].size(),e; l < L&&q; l++){
							e=G[p].remove();G[p].add(e);
							if(!V[e]){V[e]=true;cb++;q=cb<minB;}
						}
					}
				}
				if(q){minB=cb;R= new boolean[n];
				while(!PN.isEmpty())R[PN.remove()]=true;
				}
			}
			r=n-minB;
			pw.println(r);
			for (int i = 0; i < n; i++){
				if(R[i]){pw.print(i+1);r--;	
					if(r==0){pw.println();break;}
					else pw.print(" ");
				}
			}
		}pw.close();
	}
}

/*
1
6 8
1 2
1 3
2 4
2 5
3 4
3 6
4 6
5 6
*/