import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class _10474_Where_is_the_Marble {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int xd=1;
		while(true){
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(tk.nextToken()),Q=Integer.parseInt(tk.nextToken());
			if(N==0&&Q==0)break;
			int M[]= new int [N];
			for (int i = 0; i <N; i++)M[i]=Integer.parseInt(br.readLine());
			Arrays.sort(M);
			pw.println("CASE# "+xd+":");xd++;
			for (int i = 0,q,li,ls,m; i < Q; i++){
				q=Integer.parseInt(br.readLine());
				li=0;ls=N-1;
				while(li<ls){m=(li+ls)>>1;
					if(M[m]>=q)ls=m;else li=m+1;
				}ls++;
				if(M[li]==q)pw.println(q+" found at "+ls);
				else pw.println(q+" not found");
			}
		}
		pw.close();
	}
}
/*
4 1
2
3
5
1
5
5 2
1
3
3
3
1
2
3
0 0

*/