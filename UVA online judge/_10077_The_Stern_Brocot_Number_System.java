import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class _10077_The_Stern_Brocot_Number_System {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		while(true){
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(tk.nextToken()),d=Integer.parseInt(tk.nextToken());
			if(n==1&&d==1)break;
			int N[]={0,1},D[]={1,0},num=1,den=1,r;
			double div=n/(double)d;
			StringBuilder sb= new StringBuilder();
			while(n!=num || d!=den){
				if(div<num/(double)den){r=0;sb.append('L');}
				else {r=1;sb.append('R');}
				N[1-r]=num;D[1-r]=den;num+=N[r];den+=D[r];
			}pw.println(sb);
		}
		pw.close();
	}
}
/*
5 7
878 323
1 1

1 1000000
1000000 1
1 2
1 1

*/