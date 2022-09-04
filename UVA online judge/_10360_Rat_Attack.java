import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _10360_Rat_Attack {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n= Integer.parseInt(br.readLine());
		StringTokenizer tk;
		for (int xd = 0; xd < n; xd++){
			int M[][]= new int [1025][1025];
			int d= Integer.parseInt(br.readLine()),p=Integer.parseInt(br.readLine());
			for (int i = 0; i < p; i++){
				tk= new StringTokenizer(br.readLine());
				M[Integer.parseInt(tk.nextToken())][Integer.parseInt(tk.nextToken())]=Integer.parseInt(tk.nextToken());
			}
			for (int i = 0,s=0; i < 1025; i++,s=0){
				LinkedList<Integer> P= new LinkedList<Integer>();
				for (int j = 0; j < d; j++)s+=M[j][i];
				for (int j = 0,S=0; j < 1025;j++,S=0){
					P.addLast(M[j][i]);
					if(j>d)S-=P.removeFirst();
					S+=s; 
					if(j+d<1025)S+=M[j+d][i];
					s=S;
					M[j][i]=S;
				}
			}
			int x=0,y=0,max=0;
			for (int i = 0,s=0; i < 1025; i++,s=0){
				for (int j = 0; j < d; j++)s+=M[i][j];
				for (int j = 0,S=0; j < 1025; j++,S=0){
					if(j>d)S-=M[i][j-d-1];
					S+=s;
					if(j+d<1025)S+=M[i][j+d];
					if(S>max){x=i;y=j;max=S;}
					s=S;
				}
			}
			pw.println(x+" "+y+" "+max);
		}
		pw.close();

	}

}

/*
3
1
2
4 4 10
6 6 20
0
3
0 0 2
1 1 2
0 1 3
1
3
0 0 2
1 1 2
0 1 3

*/