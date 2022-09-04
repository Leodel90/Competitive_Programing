import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _12346_Water_Gate_Management {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n = Integer.parseInt(br.readLine());
		int F[]= new int[n],C[]= new int[n]; long FF[]= new long[n+1];
		StringTokenizer tk;
		for (int i = 0; i < n; i++){tk = new StringTokenizer(br.readLine());
			F[i]= Integer.parseInt(tk.nextToken());C[i]=Integer.parseInt(tk.nextToken());}
		for (int i = n-1;i>=0;i--) {FF[i]=FF[i+1]+F[i];}
		int m = Integer.parseInt(br.readLine());
		for (int i = 1; i <=m; i++){
			tk = new StringTokenizer(br.readLine());
			int v=Integer.parseInt(tk.nextToken()),t=Integer.parseInt(tk.nextToken()),vv=0,c=0,c2=1,aux2;
			long min=Long.MAX_VALUE,sf=0,sc=0,aux1;
			boolean q=FF[0]*t>=v,qq=true;
			if(q){
				LinkedList<Long> Pv= new LinkedList<Long>(),Pc = new LinkedList<Long>();
				while(true){
					if(q){
						if(qq){q=sf<v;
							if(!q)min=sc;
						}qq=false;
						if(q){aux1=0;aux2=0;
							if((vv&c2)!=0||sf+FF[c+1]*t<v){
								if(sc+C[c]<min){vv|=c2;qq=true;aux1=(long)F[c]*t;aux2=C[c];}
								else vv&=~c2;
							}else qq=true;
							if(qq){Pv.add(sf);Pc.add(sc);sf+=aux1;sc+=aux2;c++;c2=c2<<1;}
						}q=qq;
					}else{if(c==0)break;
						c--;c2=c2>>1;sf=Pv.removeLast();sc=Pc.removeLast();
						q=(vv&c2)==0;
						if(q){qq=false;vv|=c2;}else vv-=c2;
					}
				}
				pw.println("Case "+i+": "+min);
			}else pw.println("Case "+i+": IMPOSSIBLE");
		}
		pw.close();
	}
}
/*
20
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
1000000000 1000000000
4
1000000000 50
1 0
5000000 7
1000000000 2

4
720000 120000
50000 60000
130000 50000
1200000 150000
3
5000000 7
5000000 30
63000000 24

*/