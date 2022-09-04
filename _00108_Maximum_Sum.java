import java.io.*;
import java.util.StringTokenizer;
public class _00108_Maximum_Sum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		try{
			while(true){
			int n = Integer.parseInt(br.readLine()),N[][]=new int[n+1][n+1],ii=1,jj=1,max=Integer.MIN_VALUE;
			while(ii<=n){
				StringTokenizer tk = new StringTokenizer(br.readLine());
				while(tk.hasMoreTokens()){
					N[ii][jj]=Integer.parseInt(tk.nextToken())+N[ii][jj-1]+N[ii-1][jj]-N[ii-1][jj-1];
					if(jj==n){jj=1;ii++;}else jj++;
				}
			}
			for (int i = 1; i <=n; i++){
				for (int j = 1; j <=n; j++){
					for (int k = i; k <=n; k++){
						for (int l = j; l <=n; l++)
							max=Math.max(max,N[k][l]-N[i-1][l]-N[k][j-1]+N[i-1][j-1]);
					}
				}
			}
			pw.println(max);
			}
		}catch(Exception e){}
		pw.close();
	}
}
/*
4
0 -2 -7 0 9 2 -6 2
-4 1 -4 1 -1
8 0 -2


*/