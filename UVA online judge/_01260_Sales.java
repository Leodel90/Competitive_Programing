import java.io.*;
import java.util.StringTokenizer;
public class _01260_Sales {
	public static void main(String[] args) throws IOException {
         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
         PrintWriter pw = new  PrintWriter( new BufferedWriter(new OutputStreamWriter(System.out)));
         int t = Integer.parseInt(br.readLine());
         for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine()),s = 0;
			int V[]= new int [n];
			StringTokenizer tk = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++){V[j]=Integer.parseInt(tk.nextToken());
			    for (int k = 0; k <j; k++){
					if(V[k]<=V[j])s++;
				}
			}
			pw.println(s);
		}pw.close(); br.close();
	}
}
