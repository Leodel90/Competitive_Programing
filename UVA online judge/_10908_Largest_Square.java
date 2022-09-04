import java.io.*;
import java.util.StringTokenizer;
public class _10908_Largest_Square{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	    int t = Integer.parseInt(br.readLine());
	    StringTokenizer tk;
	    for (int xd = 0; xd < t; xd++){
			tk = new StringTokenizer(br.readLine());
			int M= Integer.parseInt(tk.nextToken());
			int N= Integer.parseInt(tk.nextToken());
			int Q= Integer.parseInt(tk.nextToken());
			char R[][]= new char[M][N];
			for (int i = 0; i < M; i++){
				String m=br.readLine();
				for (int j = 0; j < N; j++){
					R[i][j]=m.charAt(j);
				}
			}
			pw.println(M+" "+N+" "+Q);
			for (int i = 0; i < Q; i++){
				tk= new StringTokenizer(br.readLine());
				int r = Integer.parseInt(tk.nextToken()),c=Integer.parseInt(tk.nextToken());
				int m=1,xi=r-1,xs=r+1,yi=c-1,ys=c+1;
				boolean q=true;
				while(q&&xi>=0&&xs<M&&yi>=0&&ys<N){
				 for (int j = yi; j <=ys&&q; j++)
					q=R[xi][j]==R[r][c]&&R[xs][j]==R[r][c];
				 for (int j = xi+1; j <xs&&q; j++)
					q=R[j][yi]==R[r][c]&&R[j][ys]==R[r][c];
				 if(q)m=m+2;
				xi--;xs++;yi--;ys++;
				}
				pw.println(m);
			}
		}pw.close();
	}
}
/*
1
7 10 4
abbbaaaaaa
abbbaaaaaa
abbbaaaaaa
aaaaaaaaaa
aaaaaaaaaa
aaccaaaaaa
aaccaaaaaa
1 2
2 4
4 6
5 2

*/