import java.io.*;
import java.math.BigInteger;
public class _10862_Connect_the_Cable_Wires {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		BigInteger P[] = new BigInteger[2001];
		BigInteger I[] = new BigInteger[2001];
		P[1]= new BigInteger("1");I[1]= new BigInteger("0");
		for (int j = 2; j <=2000; j++){
			P[j]=P[j-1].add(P[j-1]).add(I[j-1]);
			I[j]=P[j-1].add(I[j-1]);
		}
			while(true){
				int n = Integer.parseInt(br.readLine());
				if(n==0)break;
				pw.println(P[n].add(I[n]));
			}
		pw.close();
	}
}
