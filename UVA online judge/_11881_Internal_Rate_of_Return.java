import java.io.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;
public class _11881_Internal_Rate_of_Return {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		DecimalFormat df =new DecimalFormat("0.00");
		while(true){
			int t = Integer.parseInt(br.readLine());
			if(t==0)break;
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int CF0=-Integer.parseInt(tk.nextToken()),CF[]= new int [t];
			for (int i = 0; i < t; i++)CF[i]=Integer.parseInt(tk.nextToken());
			double li=-1,ls=20001;
			while((long)(li*1000000)<(long)(ls*1000000)){
				double m=(li+ls)/2.0,f=0,irr=1+m,p=irr;
				for (int i = 0; i <t; i++){f+=CF[i]/p;p*=irr;}
				if(f<CF0)ls=m;else li=m;
			}
			String r= df.format(li);
			pw.println(r.substring(0,r.length()-3)+"."+r.charAt(r.length()-2)+r.charAt(r.length()-1));
		}
		pw.close();
	}
}
/*
1
-1 2
2
-8 6 9
10
-1 10000 10000 10000 10000 10000 10000 10000 10000 10000 10000
10
-2000000000 10000 10000 10000 10000 10000 10000 10000 10000 10000 10000
0
*/
