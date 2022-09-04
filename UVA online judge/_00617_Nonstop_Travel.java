import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00617_Nonstop_Travel{
	public static void main(String[] args) throws NumberFormatException, IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    PrintWriter pw = new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
	    int c=1;
	    StringTokenizer tk;
	    String z;
	    while(true){
	    	while(true){z=br.readLine();if(z.length()>0)break;}
	    	tk= new StringTokenizer(z);
	    	int N= Integer.parseInt(tk.nextToken()),l,nl;
	    	if(N==-1)break;
	    	LinkedList<Integer> L= new LinkedList<Integer>();
	    	for (int i = 30; i <=60; i++)L.add(i);
	    	l=31;
	    	for (int i = 0; i < N; i++){
				tk= new StringTokenizer(br.readLine());
				double d= Double.parseDouble(tk.nextToken()),v,t;
				int g =Integer.parseInt(tk.nextToken()),y =Integer.parseInt(tk.nextToken()),r =Integer.parseInt(tk.nextToken());
				t=g+y+r;
		        nl=0;
		        while(l>0){l--;			 
		        	v=L.remove();
		        	double THS=(d*3600.0/v)%t;
		            if(THS<=g+y){L.add((int)v);nl++;
		            }
		        }
		        l=nl;
			}
	    	if(L.size()>0){
	    		L.add(62);
	    		pw.print("Case "+c+":");
	    		String h=" ";
	    		int li=L.remove(),a=li;
	    	while(!L.isEmpty()){
	    		int ls=L.remove();
	    		if(ls>a+1){
	    			 if(li<a)pw.print(h+li+"-"+a);
	    			  else pw.print(h+li);
	    			h=", ";
	    			li=ls;
	    		}a=ls;
	    	}
	    	pw.println();
	    	}
	    	else pw.println("Case "+c+": No acceptable speeds.");
	    	c++;
	    }
	    pw.close();
	}
}
/*
1
5.5 40 8 25

3
10.7 10 2 75
12.5 12 5 57
17.93 15 4 67

-1
*/