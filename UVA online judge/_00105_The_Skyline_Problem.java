import java.io.*;
import java.util.*;
public class _00105_The_Skyline_Problem{
	static int S[],L,R,n,H;
	static StringBuilder sb;
	public static void B(int l, int r,int x){
		if(n!=-1)S[x]=S[n];
		if(R<l||L>r)return;
		if(L<=l&&r<=R&&S[x]!=-1){
			if(H>S[x])S[x]=H;
		}else{if(S[x]!=-1&&n==-1)n=x;
		     int m = (l+r)>>1,y= (x<<1)+1;
		     B(l,m,y);B(m+1,r,y+1);
		     if(n==x)n=-1;
		     if(S[y]==S[y+1])S[x]=S[y];
		     else S[x]=-1;
		}
}
	public static void M(int l,int r,int x){
		if(S[x]!=-1){
		    if(S[x]!=H){
		    	if(sb.length()>0)sb.append(" "+l+" "+S[x]);
		    	else sb.append(l+" "+S[x]);
		    	H=S[x];
		    }R=r;
		}else {int m = (l+r)>>1,y= (x<<1)+1;
		     M(l,m,y);M(m+1,r,y+1);
		}
	}
	
	public static void main(String[] args){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new  PrintWriter ( new BufferedWriter (new OutputStreamWriter(System.out)));
		S= new int[32767];
        try{while(true){
        		StringTokenizer tk= new StringTokenizer(br.readLine());
        	    L= Integer.parseInt(tk.nextToken());
        	    H= Integer.parseInt(tk.nextToken());
        	    R= Integer.parseInt(tk.nextToken())-1;
        	    n=-1;
        	    B(0,10000,0);
        	}
        }catch(Exception e){}
        sb= new StringBuilder();H=0;
        M(0,10000,0);
        if(H!=0)sb.append(R+1+" 0");
        pw.println(sb);
        pw.close();
	}
}

/*
1 11 5
2 6 7
3 13 9
12 7 16
14 3 25
19 18 22
23 13 29
24 4 28

0 12 9999
1 13 2

5 8 9 
4 9 10
*/