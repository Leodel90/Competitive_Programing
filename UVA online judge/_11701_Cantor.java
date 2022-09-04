import java.io.*;
import java.util.BitSet;
public class _11701_Cantor {
	public static void main(String[] args) throws IOException {
		BufferedReader  br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		while(true){
			String N= br.readLine(),r="MEMBER";
			if(N.equals("END"))break;
			double n= Double.parseDouble(N);
			if(n<1){
				BitSet R= new BitSet();
				while(!R.get((int)(n*1000000))){
					R.set((int)(n*1000000));
					if((int)(n*3)==1){
						r="NON-MEMBER";break;
					}n=n*3-(int)(n*3);
				} 
			}
			pw.println(r);
		}
		pw.close();
	}
}
