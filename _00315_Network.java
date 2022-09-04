import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00315_Network {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		while(true){
			int n =Integer.parseInt(br.readLine());
			if(n==0)break;
			LinkedList<Integer> G[]= new LinkedList[n];
			for (int i = 0; i < n; i++)G[i]=new LinkedList<Integer>();
			boolean M[][]= new boolean [n][n];
			while(true){
				StringTokenizer tk = new StringTokenizer(br.readLine());
				int v= Integer.parseInt(tk.nextToken()),nv;
				if(v==0)break;v--;
				while(tk.hasMoreTokens()){
					nv= Integer.parseInt(tk.nextToken())-1;
					if(!M[v][nv]){G[v].add(nv);G[nv].add(v);M[v][nv]=true;M[nv][v]=true;}
				}
			}
			int r=0;
			for (int i = 0,c; i < n; i++){
				LinkedList<Integer> C = new LinkedList<Integer>();C.add((i+1)%n);
				boolean V[]= new boolean [n];V[(i+1)%n]=true;c=0;
				while(!C.isEmpty()){c++;
					int p = C.removeFirst();
					for (Integer np: G[p]){
						if(np!=i && !V[np]){C.add(np);V[np]=true;}
					}
				}
				if(c<n-1)r++;
			}
			pw.println(r);
			
		}
		pw.close();
	}
}
/*

5
5 1 2 3 4
0
6
2 1 3
5 4 6 2
0
0
*/