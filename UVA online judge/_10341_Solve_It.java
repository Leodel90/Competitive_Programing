import java.io.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;
public class _10341_Solve_It {
	static int p,q,r,s,t,u;
	public static double F(double x){
		return p*Math.exp(-x)+q*Math.sin(x)+r*Math.cos(x)+s*Math.tan(x)+t*x*x+u;
	}
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		DecimalFormat df = new DecimalFormat("0.0000");
		try{
			while(true){
				StringTokenizer tk = new StringTokenizer(br.readLine());
				p=Integer.parseInt(tk.nextToken());q=Integer.parseInt(tk.nextToken());r=Integer.parseInt(tk.nextToken());
						s=Integer.parseInt(tk.nextToken());t=Integer.parseInt(tk.nextToken());u=Integer.parseInt(tk.nextToken());
				double F0=F(0),F1=F(1),li,ls,x=-1,fx;
				if(F0<=0&&0<=F1||F1<=0&&0<=F0){
					if(F0<=0&&0<=F1)li=0;
					else li=1; ls=1-li;
					while(li!=ls){
						x=(ls+li)/2.0;fx=F(x);
						if(x==li||x==ls)break;
						if(fx<0)li=x;else ls=x;
					}
					String R=df.format(x);
					pw.println(R.substring(0,R.length()-5)+"."+R.substring(R.length()-4,R.length()));
				}else pw.println("No solution");
			}
		}catch(Exception e){}
		pw.close();
	}
}
/*
0 0 0 0 -2 1
1 0 0 0 -1 2
1 -1 1 -1 -1 1

*/