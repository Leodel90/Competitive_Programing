import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class _11389_The_Bus_Driver_Problem {
	public static void main(String[] args) throws IOException {
		BufferedReader br=  new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		while(true){
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(tk.nextToken()),d= Integer.parseInt(tk.nextToken()),r= Integer.parseInt(tk.nextToken());
			if(n==0)break;int MR[]= new int[n],ER[]=new int[n],m=0;
			tk = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++)MR[i]=Integer.parseInt(tk.nextToken());
			tk = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++)ER[i]=Integer.parseInt(tk.nextToken());
			Arrays.sort(MR);Arrays.sort(ER);
			for (int i = 0,D; i < n; i++){
				D=MR[i]+ER[n-i-1];
				if(D>d)m+=(D-d)*r;
			}
			pw.println(m);
		}
		pw.close();
	}
}
/*

*/