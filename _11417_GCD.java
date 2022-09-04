import java.io.*;
public class _11417_GCD {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int GCD[][]= new int [501][],G[]=new int[501];
		for(int i = 1; i<=500; i++){
			GCD[i]= new int[i+1];
			for(int j=1,a,b,c;j<=i;j++){
				a=i;b=j;
				while(a%b!=0){c=b;b=a%b;a=c;}
				GCD[i][j]=b;
			}
		}
		for(int n=2;n<=500;n++){
			for(int j=1;j<n;j++){
				for(int k=j+1;k<=n;k++)G[n]+=GCD[k][j];
			}
		}
		while(true){
			int n = Integer.parseInt(br.readLine());
			if(n==0)break;
			pw.println(G[n]);
		}
		pw.close();
	}
}
/*
10
100
500
0


*/