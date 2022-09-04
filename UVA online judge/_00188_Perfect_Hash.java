import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class _00188_Perfect_Hash {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        try{StringTokenizer tk;
        while(true){String t= br.readLine(),q;
        	tk= new StringTokenizer(t);
        int n=tk.countTokens(),p=0;
        int W[]= new int[n];
        	while(tk.hasMoreTokens()){q=tk.nextToken();
        	      int s=0;
        	      for (int i = 0; i < q.length(); i++)
					 s=(s<<5)+q.charAt(i)-96;
        	      W[p]=s;p++;
        	}
        	Arrays.sort(W);p=0;
        	int C= W[0],r=0;
            int G[]= new int[n];
        	while(p<n){int h=(C/W[p])%n;
        		if((r&(1<<h))==(1<<h)){
				    C=Math.min(((C/W[G[h]])+1)*W[G[h]],((C/W[p])+1)*W[p]);
					p=0;r=0;
        		}else{r=r|(1<<h);G[h]=p;p++;}
        	}
        	pw.println(t);
        	pw.println(C);
        	pw.println();
        }
        }catch(Exception e){}
        pw.close();
	}
}

/*
this is  a test of some words to try out
a bee see dee
the of and to a in that is i it with for as 

*/