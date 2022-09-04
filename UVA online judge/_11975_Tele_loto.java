import java.io.*;
import java.util.StringTokenizer;
public class _11975_Tele_loto {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw  = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int  t = Integer.parseInt(br.readLine());
		StringTokenizer tk;
		for (int xd = 1; xd <=t; xd++){
			if(xd>1)pw.println();
			tk= new StringTokenizer(br.readLine());
			int n = Integer.parseInt(tk.nextToken()),l=Integer.parseInt(tk.nextToken());
            int N[]= new int[76];tk= new StringTokenizer(br.readLine());
			for (int i = 1; i <=n; i++)N[Integer.parseInt(tk.nextToken())]=i;
			int V[]= new int [4];tk= new StringTokenizer(br.readLine());
			for (int i = 0; i < 4; i++) V[i]=Integer.parseInt(tk.nextToken());
		    pw.println("Case "+xd+":");
			for (int i = 0; i < l; i++){int M=0;
				int W[]={4,5,9,25};
			     for (int j = 0; j < 5; j++){tk= new StringTokenizer(br.readLine());
					for (int k = 0,x; k < 5; k++){x=Integer.parseInt(tk.nextToken());
					   if(N[x]<=35&&N[x]!=0&&((j==0||j==4)&&(k==0||k==4)))W[0]--;
					   if(N[x]<=40&&N[x]!=0&&j==2)W[1]--;
					   if(N[x]<=45&&N[x]!=0&&(j==k||j+k==4))W[2]--;
					   if(N[x]!=0)W[3]--;
					}
				}
			     for (int k = 0; k < 4; k++){if(W[k]==0)M+=V[k];}
			     pw.println(M);
			}
		}pw.close();
	}
}
/*
1
9 1
12 67 8 75 4 30 42 54 74
2 5 10 1000
12 20 36 57 67
2 28 45 59 63
4 30 42 54 74
5 26 34 49 70
8 16 37 48 75

*/