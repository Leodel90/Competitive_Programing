import java.io.*;
import java.util.StringTokenizer;
public class _10576_Y2K_Accounting_Bug {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		try{StringTokenizer tk;
			while(true){tk = new StringTokenizer(br.readLine());
				int s=Integer.parseInt(tk.nextToken()),d=Integer.parseInt(tk.nextToken());
				int x=(s*5)/(s+d)+1,nx=5-x,min=Math.min(2,nx),S=((s*nx-d*x)<<1)+s*min-d*(2-min);
				if(S>0)pw.println(S);
				else pw.println("Deficit");
			}
		}catch(Exception e){}
		pw.close();
	}
}
/*
59 237
375 743
200000 849694
2500000 8000000
1 1000
1000 1
*/