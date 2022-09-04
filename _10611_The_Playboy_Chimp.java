import java.io.*;
import java.util.StringTokenizer;
public class _10611_The_Playboy_Chimp {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer tk = new StringTokenizer(br.readLine());
		int N[]= new int [n+1];n=1;
		while(tk.hasMoreTokens()){
			N[n]=Integer.parseInt(tk.nextToken());
			if(N[n]!=N[n-1])n++;
		}
		 br.readLine();
		tk = new StringTokenizer(br.readLine());
		while(tk.hasMoreTokens()){
			int h= Integer.parseInt(tk.nextToken()),li=1,ls=n-1,m;
			while(li<ls){
				m=(li+ls)>>1;
				if(N[m]<h && (m==n || N[m+1]<h))li=m+1;
				else ls=m;
			}
			if(N[li]<h)pw.print(N[li]+" ");
			else pw.print("X ");
			li=1;ls=n-1;
			while(li<ls){
				m=(li+ls)>>1;
				if(N[m]<=h)li=m+1;
				else ls=m;
			}
			if(N[li]>h)pw.println(N[li]);
			else pw.println("X");
		}
		pw.close();
	}
}
