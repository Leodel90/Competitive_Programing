import java.io.*;
import java.util.StringTokenizer;
public class _12032_The_Monkey_and_the_Oiled_Bamboo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		PrintWriter pw= new PrintWriter(new BufferedWriter( new OutputStreamWriter(System.out)));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int xd = 1,t=Integer.parseInt(br.readLine());xd <=t; xd++) {
			br.readLine();
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int a=0,k=0,ka=0,r,d;
			while(tk.hasMoreTokens()){r=Integer.parseInt(tk.nextToken());
				d=r-a;
				if(d>k){k=d;ka=d;}
				if(ka<=d){if(ka<d){k++;ka=k;}else ka--;}
				a=r;
			}
			pw.println("Case "+xd+": "+k);
		}
		pw.close();
	}
}
/*
2
5
1 6 7 11 13
4
3 9 10 14
*/