import java.io.*;
import java.math.*;
public class _00623_500 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		BigInteger f[]= new BigInteger[1001];
		f[0]=new BigInteger("1");
		for (int i = 1; i <=1000; i++)f[i]=new BigInteger(i+"").multiply(f[i-1]);
		try{
			while(true){
				int n =Integer.parseInt(br.readLine());
				pw.println(n+"!");
				pw.println(f[n]);
			}
		}catch(Exception e){}
	
		pw.close();
	}
}
/*
10
30
50
100

*/