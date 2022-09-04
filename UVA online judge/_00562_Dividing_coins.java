import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00562_Dividing_coins {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for(int xd = Integer.parseInt(br.readLine()); xd >0; xd--){
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n =Integer.parseInt(tk.nextToken()),s=0;
			LinkedList<Integer> L= new LinkedList<Integer>(),LC=new LinkedList<Integer>();
			boolean V[]=new boolean[25001];
			if(!tk.hasMoreTokens())tk= new StringTokenizer(br.readLine());
			while(tk.hasMoreTokens()){LC.add(Integer.parseInt(tk.nextToken()));s+=LC.getLast();}
			L.add(0);V[0]=true;
			for (int i = 0,c; i < n; i++){c=LC.removeFirst();
			 	for (int j = L.size(),l; j>0; j--){l=L.removeFirst();
					if(c+l<=(s>>1)&&!V[c+l]){V[c+l]=true;L.addLast(c+l);}
					L.addLast(l);
				}
			}
			int r=0;
			while(!L.isEmpty())r=Math.max(r,L.removeFirst());
			pw.println(s-r*2);
		}
		pw.close();
	}
}
/*
4
3
2 3 5
4
1 2 4 6
100
500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500
100
500 499 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500 500

*/