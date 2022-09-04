import java.io.*;
import java.util.Arrays;
public class _10487_Closest_Sums {
	public static void main(String[] args) throws NumberFormatException, IOException {
	  BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	  PrintWriter pw = new PrintWriter (new BufferedWriter(new OutputStreamWriter(System.out)));
	  int y =1;
	  while(true){int n = Integer.parseInt(br.readLine());
	     if(n==0)break;
	     int S[]= new int [n+2];
	     S[0]=Integer.MIN_VALUE;
	     S[n+1]=Integer.MAX_VALUE;
	     for (int i = 1; i <=n; i++)S[i]= Integer.parseInt(br.readLine());
	     Arrays.sort(S);
	     int r =Integer.MAX_VALUE;
	     int M= Integer.parseInt(br.readLine());
	     pw.println("Case "+y+":");y++;
	     for (int w = 0; w < M; w++){
	    	 boolean V[]= new boolean[n+2];
	    	 long q=Long.parseLong(br.readLine());
	     for (int i = 1; i <=n; i++){
	    	 if(V[i]==false){
			int li=1,ls=n,m=0,a=-1;
			while(ls>=li){
				m=(ls+li)>>1;
	            if(S[i]+S[m]!=q&&a!=m){
	            	if(S[i]+S[m]<q)li=m+1;
	            	else ls=m;
	            }else break;
	            a=m;
			}
			int min1=S[i]+S[m-1],min2=S[i]+S[m+1],min=Math.abs(S[i]+S[m]-(int)q);
			if(Math.abs(q-min1)<min||Math.abs(q-min2)<min||i==m){
				if(Math.abs(q-min1)<Math.abs(q-min2))m--;
				else m++;
			}
			if(Math.abs(q-r)>Math.abs(S[m]+S[i]-q))r=S[i]+S[m];
			V[m]=true;
	    	}
		 }
	     pw.println("Closest sum to "+q+" is "+r+".");
	     }
	  }
      pw.close();
	}
}
/*
5
3
12
17
33
34
3
1
51
30
3
1
2
3
3
1
2
3
3
1
2
3
3
4
5
6
0

*/