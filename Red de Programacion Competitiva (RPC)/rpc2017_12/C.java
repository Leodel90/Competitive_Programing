package rpc2017_12;
import java.io.*;
import java.math.BigInteger;
public class C {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
		BigInteger C[][]= new BigInteger[101][];
		C[0]= new BigInteger[1];C[0][0]=new BigInteger("1");
		for (int i = 1; i <=100; i++){
			C[i]= new BigInteger[i+1];C[i][0]=new BigInteger("1");
			for (int j = 1; j <i; j++){
				C[i][j]=C[i-1][j-1].add(C[i-1][j]);
			}C[i][i]=new BigInteger("1");
		}
		for (int t = Integer.parseInt(br.readLine()); t>0; t--){
			int n= Integer.parseInt(br.readLine());
			for (int j = 0,x=n,y=0; j < n; j++,x--,y++){
				if(!C[n][j].equals(C[0][0])|| x==0&&y==0)pw.print(C[n][j]);
				if(x!=0){pw.print("x");if(x!=1)pw.print("^"+x);}
				if(y!=0){pw.print("y");if(y!=1)pw.print("^"+y);}
				pw.print("+");
			}
			if(!C[n][n].equals(C[0][0]) || n==0)pw.print(C[n][n]);
			if(n!=0){pw.print("y");if(n!=1)pw.print("^"+n);}
			pw.println();
		}
		pw.close();
	}
}
