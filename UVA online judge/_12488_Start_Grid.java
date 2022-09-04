import java.io.*;
import java.util.StringTokenizer;
public class _12488_Start_Grid {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter (new BufferedWriter(new OutputStreamWriter(System.out)));
          try{
        	   StringTokenizer tk;
        	   while(true){
        		   int n = Integer.parseInt(br.readLine());
        		   int C[]= new int [n],p=0;
        		   tk= new StringTokenizer(br.readLine());
        		   int D[]= new int [n];
        		   while(tk.hasMoreTokens()){C[p]=Integer.parseInt(tk.nextToken())-1;D[C[p]]=p;p++;}
        		   tk= new StringTokenizer(br.readLine());
        		   int s=0;
                   for (int i = 0; i < n; i++){
					  int x = Integer.parseInt(tk.nextToken())-1,a,d=D[x]-i,r=i;
					  s=s+d;
					  while(d>0){a=C[r];C[r]=x;x=a;
					  D[x]++;r++;d--;
					  }
					  C[r]=x;
			       }
                   pw.println(s);
        	   }
            } catch( Exception e){}
           pw.close();
           
	}
}
