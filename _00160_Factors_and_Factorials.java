import java.io.*;
public class _00160_Factors_and_Factorials {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int ff[][]= new int[101][100],p=1;
		boolean v[]= new boolean[101];
		for(int i=2;i<=100;i++){
			if(!v[i]){ff[i][p]++;ff[i][0]=p;
				for(int j=i+i;j<=100;j+=i){
					ff[j][p]=
						ff[j/i][p]+1;
				v[j]=true;ff[j][0]=p;}p++;
			}
		}
		for(int i=2,l;i<=100;i++){
			l=Math.max(ff[i][0], ff[i-1][0]);
			for(int j=1;j<=l;j++)ff[i][j]+=ff[i-1][j];
			ff[i][0]=l;
		}
		while(true){
			int n =Integer.parseInt(br.readLine());
			if(n==0)break;
			if(n<10)pw.print(" ");
			if(n<100)pw.print(" ");
			pw.print(n+"! =");
			int ns=7;p=1;
			while(p<=ff[n][0]){
				for(int l=Math.min(p+14,ff[n][0]);p<=l;p++){
					for(int j = ns;j<=9;j++)-(ff[n][p]+"").length()pw.print(" ");
					pw.print(ff[n][p]);ns=7;
				}ns=1;pw.println();
			}
		}
		pw.close();
	}
}
/*
5
53
0


*/