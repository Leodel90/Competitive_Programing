import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class _12049_Just_Prune_The_List {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int xd = 0; xd < t; xd++){
        	StringTokenizer T= new StringTokenizer(br.readLine());
			int n = Integer.parseInt(T.nextToken());int m = Integer.parseInt(T.nextToken());
			TreeMap<Long, Integer> E= new TreeMap<Long, Integer>();
			T= new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++){
				long x=Long.parseLong(T.nextToken());
				if(E.containsKey(x))E.put(x, E.get(x)+1);
				else E.put(x, 1);
			}
			int r =0;
			T= new StringTokenizer(br.readLine());
			for (int i = 0; i < m; i++){
				long x = Long.parseLong(T.nextToken());
				if(E.containsKey(x)){
					int g=E.get(x)-1;
					if(g>0) E.put(x, g);
					else E.remove(x);
				}else r++;
			}
			while(!E.isEmpty())r+=E.pollFirstEntry().getValue();
			System.out.println(r);
		}
	}
}
