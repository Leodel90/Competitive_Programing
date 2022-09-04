import java.io.*;
import java.util.StringTokenizer;
public class _01237_Expert_Enough {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw= new PrintWriter(new BufferedWriter( new OutputStreamWriter(System.out)));
        int t = Integer.parseInt(br.readLine());
        for (int xd = 0; xd < t; xd++){
            if(xd>0)pw.println();
			int d= Integer.parseInt(br.readLine());
			String M[]= new String[d];
			int L[]= new int [d];
			int R[]= new int [d];
			for (int i = 0; i < d; i++){
				StringTokenizer r= new StringTokenizer(br.readLine());
				M[i]=r.nextToken();
				L[i]=Integer.parseInt(r.nextToken());
				R[i]=Integer.parseInt(r.nextToken());
			}
			int q = Integer.parseInt(br.readLine());
			for (int i = 0; i < q; i++){
				int p=Integer.parseInt(br.readLine());
				int c=0,k=0;
				for (int j = 0; j < d&&c<=1; j++){
					if(L[j]<=p&&R[j]>=p){c++;k=j;}
				}
				if(c==1)pw.println(M[k]);
				else pw.println("UNDETERMINED");
			}
			
		}
        pw.close();
	}
}

/*
2
4
HONDA 10000 45000
PEUGEOT 12000 44000
BMW 30000 75900
CHEVROLET 7000 37000
4
60000
7500
5000
10000
4
HONDA 10000 45000
PEUGEOT 12000 44000
BMW 30000 75900
CHEVROLET 7000 37000
4
60000
7500
5000
10000

*/