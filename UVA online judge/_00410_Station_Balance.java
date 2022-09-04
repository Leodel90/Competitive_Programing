import java.io.*;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.StringTokenizer;
public class _00410_Station_Balance {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int xd=1;DecimalFormat df= new DecimalFormat("0.00000");
		try{
		while(true){
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(tk.nextToken()),s=Integer.parseInt(tk.nextToken()),M[]= new int[s];
			double a=0,I=0,l;tk = new StringTokenizer(br.readLine());
			for (int i = 0; i < s; i++){M[i]=Integer.parseInt(tk.nextToken());a+=M[i];}
			Arrays.sort(M);a=a/c;
			pw.println("Set #"+xd);xd++;
			for (int j = s-1,i=0;i<c;j--,i++){
				pw.print(" "+i+":");l=0;
				if(j>=0){pw.print(" "+M[j]);l=M[j];
					if(s-(j+(c<<1)-s)-1>=0){pw.print(" "+M[s-(j+(c<<1)-s)-1]);l+=M[s-(j+(c<<1)-s)-1];}
				}
				I+=Math.abs(l-a);
				pw.println();
			}
			String r=df.format(I);
			pw.println("IMBALANCE = "+r.substring(0,r.length()-6)+"."+r.substring(r.length()-5,r.length()));
			pw.println();
		}
		}catch(Exception e){}
		pw.close();
	}
}
/*
2 3
6 3 8
3 5
51 19 27 14 33
5 9
1 2 3 5 7 11 13 17 19

*/