import java.io.*;
import java.util.StringTokenizer;
public class _00927_Integer_Sequence_from {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int c= Integer.parseInt(br.readLine());
        for (int xd = 0; xd < c; xd++){
        	StringTokenizer tk= new StringTokenizer(br.readLine());
			int I= Integer.parseInt(tk.nextToken())+1;
			int C[]= new int [I];
			for (int j = 0; j <I; j++)C[j]=Integer.parseInt(tk.nextToken());
			int d = Integer.parseInt(br.readLine());
			int k = Integer.parseInt(br.readLine());
			double n=(Math.sqrt(1+4*((double)(k*2/d)))-1)/2.0;
			if((int)n<n)n++;
			long bm=0,N=1;
			for (int j = 0; j <I; j++){
				bm=bm+C[j]*N;
				N=N*(long)n;
			}
			pw.println(bm);
		}
        pw.close();
	}

}
/*
3
4 3 0 0 0 23
25
100
1 0 1
1
6
20 10000 10000 10000 10000 10000 10000 10000 10000 10000 10000 10000 10000 10000 10000 10000 10000 10000 10000 10000 10000 10000
100000
1000000
*/