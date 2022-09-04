import java.io.*;
import java.util.*;
import java.util.Map.Entry;
public class _12321_Gas_Stations {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
		while(true){
			StringTokenizer tk= new StringTokenizer(br.readLine());
			int L=Integer.parseInt(tk.nextToken()),G= Integer.parseInt(tk.nextToken());
			if(L==0)break;
			TreeMap<Integer, Integer> GS= new TreeMap<Integer, Integer>();
			for(int i = 0,r,li,ls,x; i < G; i++){tk= new StringTokenizer(br.readLine());
				x=Integer.parseInt(tk.nextToken());r=Integer.parseInt(tk.nextToken());
				li=Math.max(x-r, 0);ls=x+r;
				if(!GS.containsKey(li) || GS.get(li)<ls)GS.put(li,ls);
			}
			int l=-1,nl=0,c=-1,li,ls;GS.put(L+1,L+1);
			while(!GS.isEmpty()){
				Entry<Integer,Integer> e= GS.pollFirstEntry();li=e.getKey();ls=e.getValue();
				if(l<li){c++;l=nl;if(l>=L)break;if(nl<li){c=G+1;break;}}
				nl=Math.max(nl,ls);
			}
			pw.println(G-c);
		}
		pw.close();
	}
}
/*
40 3
5 5
20 10
40 10
40 5
5 5
11 8
20 10
30 3
40 10
40 5
0 10
10 10
20 10
30 10
40 10
40 3
10 10
18 10
25 10
40 3
10 10
18 10
25 15
0 0

*/