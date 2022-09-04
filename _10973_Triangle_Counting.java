import java.io.*;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _10973_Triangle_Counting{
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int t = Integer.parseInt(br.readLine()); t >0; t--){
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken()),m=Integer.parseInt(tk.nextToken()),v1,v2,s;
			boolean M[][]= new boolean[n][];
			LinkedList<Integer> G[]= new LinkedList[n];
			BitSet B[]= new BitSet[n];
			for (int i = 0; i < n; i++){M[i]=new boolean[i];G[i]= new LinkedList<Integer>();B[i]= new BitSet(3000);}
			for (int i = 0; i < m; i++){
				tk = new StringTokenizer(br.readLine());
				v1=Integer.parseInt(tk.nextToken())-1;v2=Integer.parseInt(tk.nextToken())-1;
				if(v1>v2){s=v2;v2=v1;v1=s;}
				M[v2][v1]=true;G[v1].add(v2);B[v1].set(v2);
			}s=0;
			for (int i = 0; i < n; i++){
				while(!G[i].isEmpty()){
					v1=G[i].removeFirst();
						BitSet c=(BitSet)B[v1].clone();c.and(B[i]);
						v2=-1;s+=c.cardinality();
				}
			}
			pw.println(s);
		}
		pw.close();
	}
}
/*
2
4 6
2 3
3 1
1 4
2 4
3 4
1 2
6 9
5 4
1 2
2 3
3 1
1 4
2 4
3 4
5 6
4 6



*/