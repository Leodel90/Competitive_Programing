import java.io.*;
import java.util.StringTokenizer;
public class _00679_Dropping_Balls {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int i = Integer.parseInt(br.readLine()); i>0; i--) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int D= Integer.parseInt(tk.nextToken()),I=Integer.parseInt(tk.nextToken())-1;
			int d=1,r=1,na=1,n=2;
			while(d<D){r=r<<1;if(I%n>=na)r++;d++;na=n;n=n<<1;}
			pw.println(r);
		}
		br.readLine();
		pw.close();
	}
}
/*
5
4 2
3 4
10 1
2 2
8 128
-1

*/