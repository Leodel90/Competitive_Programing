import java.io.*;
import java.util.StringTokenizer;
public class _11001_Necklace {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter ( new OutputStreamWriter (System.out)));
        while(true){
        	StringTokenizer tk= new StringTokenizer(br.readLine());
        	int vt= Integer.parseInt(tk.nextToken());
        	int v0= Integer.parseInt(tk.nextToken());
        	if(vt==0)break;
        	long r=0;
        	if(vt>v0){
        	double N=vt/(2.0*v0);
        	if((long)N<N){
        		if((long)(N*2.0)!=(N*2.0)){
        			r=(long)N;
        			if(N-(long)N>0.5)r++;
        		}else r=0;
        	}else r=(long)N;
        	}
        	pw.println(r);
        }
        pw.close();
	}
}
/*
10 1
10 2
10 5
60000 600
25 13
60000 1
234 45
45 17
5432 765
0 0


*/
