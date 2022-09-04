package rpc2017_12;
import java.io.*;
public class A{
	public static long gcd (long a,long b){
		if(b==0)return a;else return gcd(b,a%b);
	}
	public static void main(String[] args) {
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		try{
			while(true){
				long n = Long.parseLong(br.readLine());
				if((3*n)%((n<<1)+1)!=0){long GCD=gcd(3*n,((n<<1)+1));
				long N=(3*n)/GCD,D=((n<<1)+1)/GCD;pw.println(N+"/"+D);}
				else pw.println((3*n)/((n<<1)+1));
				
			}
		}catch(Exception e){}
		pw.close();
	}
}

/*

99999999
99999999
99999999
99999999
99999999
99999999
99999999
99999999
99999999
99999999
99999999
99999999
99999999
99999999
99999999
99999999
99999999
99999999
99999999
99999999

*/