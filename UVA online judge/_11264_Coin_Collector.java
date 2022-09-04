import java.io.*;
import java.util.*;
public class _11264_Coin_Collector {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));		
		for (int t = Integer.parseInt(br.readLine()); t > 0; t--){
			int n = Integer.parseInt(br.readLine());
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int N[]= new int[n+1],MI[]= new int [n+1],MV[]= new int [n+1];
			for (int i = 1; i <=n;i++){
				N[i]=Integer.parseInt(tk.nextToken());
				MV[i]=Math.min(N[i]-N[i-1]-1,N[i-1]-1);
				if(MV[i]<MV[i-1]){MI[i]=MI[i-1];MV[i]=MV[i-1];}
				else MI[i]=i;
			}
			int c=0,k=N[n]<<1,i=n;
			while(k>0){
				if(N[i]<=k){
					if(Math.min(k-N[i],N[i]-1)>=MV[i]){c++;k=Math.min(k-N[i],N[i]-1);}
					else k=N[MI[i]];
				}i--;
			}
			pw.println(c);
		}
		pw.close();
	}
}
/*
2
6
1 2 4 8 16 32
6
1 3 6 8 15 20

*/