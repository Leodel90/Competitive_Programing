import java.io.*;
import java.util.StringTokenizer;
public class _10452_Marcus {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		char P[]= {'I','E','H','O','V','A','#'};
		int X[]={0,-1,0},Y[]={-1,0,1};
		String R[]={"left","forth","right"};
		for (int t = Integer.parseInt(br.readLine()); t>0; t--){
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int m=Integer.parseInt(tk.nextToken()),n=Integer.parseInt(tk.nextToken());
			char CS[][]= new char[m+1][n+2];
			for (int i = 1; i <=m; i++)CS[i]=(" "+br.readLine()+" ").toCharArray();
			int x=m,y=0;
			for (int i = 1; i <=n; i++){if(CS[x][i]=='@'){y=i;break;}}
			StringBuilder rr= new StringBuilder();
			for (int i = 0; i < 7; i++){
				for (int j = 0; j < 3; j++){
					if(CS[x+X[j]][y+Y[j]]==P[i]){
						x+=X[j];y+=Y[j];
						rr.append(R[j]);
						if(i<6)rr.append(" ");
						break;
					}
				}
			}
			pw.println(rr);
		}
		pw.close();
	}
}
/*
3
6 5
PST#T
BTJAS
TYCVM
YEHOF
XIBKU
N@RJB
5 4
JA#X
JVBN
XOHD
DQEM
T@IY
3 3
VA#
OHE
F@I
*/