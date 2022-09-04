import java.io.*;
import java.util.StringTokenizer;
public class _00107_The_Cat_in_the_Hat {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new OutputStreamWriter(System.out));
		double e=0.000000001;
		while(true){
			StringTokenizer tk = new StringTokenizer(br.readLine());
			long h=Integer.parseInt(tk.nextToken()), w=Integer.parseInt(tk.nextToken());
			if(h+w==0)break;
			if(h!=1){
				for(int p=1;p<32;p++){
					long n=(long)(Math.pow(w, 1.0/p)+e);
					if((int)Math.pow(n,p)==w && Math.pow(n+1, p)==h){
						long np1=(long)(Math.pow(n,p+1)+e),n1p1=(long)(Math.pow(n+1, p+1)+e);
						long r1,r2=n1p1-np1;
						if(n!=1)r1=(1-w*n)/(1-n)-w;
						else r1=p;
						pw.println(r1+" "+r2);
					}
				}
			}else pw.println("0 1");
		}
		pw.close();
	}
}
/*
216 125
5764801 1679616
0 0


*/