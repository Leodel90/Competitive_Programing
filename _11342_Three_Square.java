import java.io.*;
import java.util.BitSet;
public class _11342_Three_Square {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter (System.out)));
		int P[]= new int [280];
		BitSet V= new BitSet();int k=0;
		int D[]= new int [50001];
		for (int i = 0,ii=0; ii <=50000; i++,ii=i*i,k=i){P[i]=ii;V.set(ii);D[ii]=i;}
		P[k]=Integer.MAX_VALUE;
		for (int i = Integer.parseInt(br.readLine()); i>0; i--){
			boolean q=true;
			k=Integer.parseInt(br.readLine());
			double k3=k/3.0;
			for (int a = 0,kk=k-P[a]; P[a]<=k3&&q;a++,kk=k-P[a]){
				for (int b = a,cc=kk-P[b]; P[b]<=cc&&q; b++,cc=kk-P[b]){
					q=!V.get(cc);
					if(!q)pw.println(a+" "+b+" "+D[cc]);
				}
			}
			if(q)pw.println("-1");
		}
		pw.close();
	}
}
