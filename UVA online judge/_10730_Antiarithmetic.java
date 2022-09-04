import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class _10730_Antiarithmetic {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    PrintWriter pw = new PrintWriter( new BufferedWriter(new OutputStreamWriter(System.out)));
	    StringTokenizer tk;
	    while(true){tk= new StringTokenizer(br.readLine());
	    String h=tk.nextToken();
	    if(h.charAt(0)=='0')break;
	    int n = Integer.parseInt(h.substring(0,h.length()-1));
	    int V[]= new int [n],p=0;
	    int D[]= new int [n];
	    boolean q =false;
	    while(tk.hasMoreTokens()&&!q){
	    	V[p]=Integer.parseInt(tk.nextToken());
	    	D[V[p]]=p;p++;
	    }
	    for (int i = 0; i < n&&!q; i++){
			for (int j = i+1; j <n&&!q; j++){
				int d=(V[j]<<1)-V[i];
				if(d<n&&d>=0)
					q=D[d]>j;
			}
		}
	    if(q)pw.println("no");
	    else pw.println("yes");
	    }
	    pw.close();
	}
}

/*
3: 0 2 1
5: 2 0 1 3 4
6: 2 4 3 5 0 1
0
*/