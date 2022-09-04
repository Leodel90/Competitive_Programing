import java.io.*;
import java.util.StringTokenizer;
public class _10114_Loansome_Car_Buyer {
	public static void main(String[] args) throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         PrintWriter pw= new  PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
         while(true){
        	 StringTokenizer tk = new StringTokenizer(br.readLine());
        	 int nm= Integer.parseInt(tk.nextToken());
        	 if(nm<0)break;
        	 double pm=Double.parseDouble(tk.nextToken()),L=Double.parseDouble(tk.nextToken()),va=pm+L;
        	 int d= Integer.parseInt(tk.nextToken());
        	 double D[]= new double[d+1];int M[]= new int[d+2];
        	 for (int i = 0; i < d; i++){tk = new StringTokenizer(br.readLine());
        	 	M[i]=Integer.parseInt(tk.nextToken());D[i]=Double.parseDouble(tk.nextToken());
        	}
        	int cm=0,im=1;pm=L/nm;va*=(1-D[0]);
        	while(L>=va && cm<nm){L-=pm;cm++;
        		if(M[im]==cm)im++;
        		va*=(1-D[im-1]);
        	}
        	if(cm==1)pw.println("1 month");
        	else pw.println(cm+" months");
         }
         pw.close();
	}
}
/*
30 500.0 15000.0 3
0 .10
1 .03
3 .002
12 500.0 9999.99 2
0 .05
2 .1
60 2400.0 30000.0 3
0 .2
1 .05
12 .025
-99 0 17000 1
*/