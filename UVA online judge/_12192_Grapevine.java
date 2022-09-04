import java.io.*;
import java.util.StringTokenizer;
public class _12192_Grapevine{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw =  new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		while(true){
			 StringTokenizer tk = new StringTokenizer(br.readLine());
			 int n=Integer.parseInt(tk.nextToken()),m= Integer.parseInt(tk.nextToken());
			 if(n==0)break;
			 int H[][]= new int[n+2][m+2];
			 for (int i = 1; i <=n; i++){
				 tk = new StringTokenizer(br.readLine());
				for (int j = 1; j <=m; j++)H[i][j]= Integer.parseInt(tk.nextToken()); 
			}
			 for (int i = 1; i <=m; i++){H[0][i]= Integer.MIN_VALUE;H[n+1][i]= Integer.MAX_VALUE;}
			 for (int i = 1; i <=n; i++){H[i][0]= Integer.MIN_VALUE;H[i][m+1]= Integer.MAX_VALUE;}
			 int q= Integer.parseInt(br.readLine());
			 for (int i = 0,L,U; i < q; i++){
				tk = new StringTokenizer(br.readLine());
				L= Integer.parseInt(tk.nextToken());U= Integer.parseInt(tk.nextToken());
				int cr=1,cc=m,r=0;
				while(Math.min(cr,cc)>r){
					if(H[cr][cc]<=U){
						if(H[cr][cc]>=L && H[cr+1][cc]>U){
							int lic=cc-Math.min(cr, cc)+1,lir=cr-Math.min(cr, cc)+1,lsc=cc,lsr=cr;
							while(lic<lsc){
								int mc = (lic+lsc)>>1,mr = (lir+lsr)>>1;
								if(H[mr][mc]<L){lic=mc+1;lir=mr+1;}
								else{lsc=mc;lsr=mr;}
							}r=Math.max(r,cc-lsc+1);
						}cr++;
					}else cc--;
				}
				pw.println(r);
			}
			 pw.println("-");
		}
		pw.close();
	}
}
/*

4 5
13 21 25 33 34
16 21 33 35 35
16 33 33 45 50
23 51 66 83 93
3
22 90
33 35
20 100
4 4
1 7 9 11
5 8 10 12
7 10 15 17
11 19 30 41
4
6 20
7 9
10 10
13 14
0 0

*/