import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _11504_Dominos {
	static int P[],R[];
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=  new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int xd= Integer.parseInt(br. readLine()); xd>0; xd--){
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n =Integer.parseInt(tk.nextToken()),m=Integer.parseInt(tk.nextToken()),c=0;
			LinkedList<Integer>G[]= new LinkedList[n];
			for (int i = 0; i < n; i++)G[i]= new LinkedList<Integer>();
			for (int i = 0; i < m; i++){
				tk = new StringTokenizer(br.readLine());
				G[Integer.parseInt(tk.nextToken())-1].add(Integer.parseInt(tk.nextToken())-1);
			}
			boolean V[] = new boolean[n],B[] = new boolean[n];
			for (int i = 0; i < n; i++){
				if(!V[i]){
					LinkedList<Integer> C = new LinkedList<Integer>();
					V[i]=true;C.add(i);c++;B[i]=true;
					while(!C.isEmpty()){
						int p = C.removeFirst();
						for(Integer np:G[p]){
							if(V[np]){if(B[np]){c--;B[np]=false;}}
							else {C.add(np);V[np]=true;}
						}
					}
				}
			}
			
		}
		pw.close();
	}
}
