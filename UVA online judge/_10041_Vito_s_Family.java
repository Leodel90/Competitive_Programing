import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class _10041_Vito_s_Family {
	public static void main(String[] args) throws NumberFormatException, IOException {
         BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
         PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
         int t = Integer.parseInt(br.readLine());
         for (int i = 0; i < t; i++){
         StringTokenizer tk= new StringTokenizer(br.readLine());
         int r=Integer.parseInt(tk.nextToken());
         int C[]= new int[r];
		  for (int j = 0; j < r; j++)C[j]=Integer.parseInt(tk.nextToken());
		  Arrays.sort(C);
		  int m = (r>>1)+(r&1)-1,s=0;
		  for (int j = 0; j < r; j++)s+=Math.abs(C[j]-C[m]);
		  pw.println(s);
		 }
         pw.close();
	}
}

/*
2
2 2 4
3 2 4 6

*/