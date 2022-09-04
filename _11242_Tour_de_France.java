import java.io.*;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
public class _11242_Tour_de_France {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer tk;
		DecimalFormat dc= new DecimalFormat("0.00");
		while(true){tk= new StringTokenizer(br.readLine());
		int f = Integer.parseInt(tk.nextToken()),r,x;
		if(f==0)break;
		r= Integer.parseInt(tk.nextToken());
		tk= new StringTokenizer(br.readLine());
		int F[]= new int [f];
		for (int i = 0; i < F.length; i++) F[i]=Integer.parseInt(tk.nextToken());
		Arrays.sort(F);
		tk= new StringTokenizer(br.readLine());
		PriorityQueue<Double> DR= new PriorityQueue<Double>();
		while(tk.hasMoreTokens()){
		  x=Integer.parseInt(tk.nextToken());
		  for (int i = 0; i < f; i++) DR.add(x/(double)F[i]);
		}
		double d1=DR.remove(),d2,ms=0;
		while(!DR.isEmpty()){
			d2=DR.remove();
			ms=Math.max(d2/d1, ms);
			d1=d2;
		}
		String h=dc.format(ms);
		h=h.substring(0,h.length()-3)+"."+h.charAt(h.length()-2)+h.charAt(h.length()-1);
		pw.println(h);
		}
		pw.close();
	}
}
/*
2 4
40 50
12 14 16 19
0

*/