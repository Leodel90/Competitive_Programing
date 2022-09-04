import java.io.*;
import java.util.StringTokenizer;
public class _11059_Maximum_Product{
	public static void main(String[] args){
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        try{StringTokenizer tk;
        int c =1;
        	while(true){
        		int n = Integer.parseInt(br.readLine());
                tk = new StringTokenizer(br.readLine()+" 0");
                long MAX =0,ant=1,act=1,an=1,pn=1,pact=0;
                boolean q=true,p=false;
                while(tk.hasMoreTokens()){
                	long x=Long.parseLong(tk.nextToken());
                	if(x==0){
                		if(!q)act=Math.max(ant,(ant*an*act)/(pn*pact));
                		if(p)MAX= Math.max(MAX, act);
                		act=1;pn=1;p=false;q=true;
                	}else{if(x<0){
                		   if(q){ant=act;an=x;act=1;if(pn==1){pn=x;pact=ant;}
                		   }else {act=ant*an*act*x;p=true;}
                		   q=!q;
                	    }else {act=act*x;p=true;}
                	}
                }
                pw.println("Case #"+c+": The maximum product is "+MAX+".");
                c++;
                pw.println();
                br.readLine();
        }
        }catch(Exception e){}
        pw.close();
	}
}

/*
3
2 4 -3

5
2 5 -1 2 -1

6
2 -1 3 -1 4 -4


*/