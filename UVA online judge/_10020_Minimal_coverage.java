import java.io.*;
import java.util.*;
public class _10020_Minimal_coverage {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int xd = Integer.parseInt(br.readLine()); xd >0; xd--){br.readLine();
			int m = Integer.parseInt(br.readLine());
			int L[]= new int[m+1],R[]= new int[m+1];
			BitSet vl= new BitSet(),vr= new BitSet();
			while(true){StringTokenizer tk = new StringTokenizer(br.readLine());
				int l= Integer.parseInt(tk.nextToken()),r= Integer.parseInt(tk.nextToken()),
						nl=Math.min(l,r),nr=Math.max(l,r);l=nl;r=nr;nl=Math.max(0,l);nr=Math.min(m,r);
				if(l==0&&r==0)break;
				if(nl<nr){
					if((!vl.get(nl)||L[nl]<nr) && (!vr.get(nr)||nl<R[nr])){
						if(vl.get(nl))vr.set(Math.min(m,L[nl]),false);
						if(vr.get(nr))vl.set(Math.max(0,R[nr]),false);
						L[nl]=r;R[nr]=l;vl.set(nl,true);vr.set(nr,true);
					}
				}
			}LinkedList<Integer> P= new LinkedList<Integer>();
			int l=-1,nl=-1;
			for (int i = 0; i<m; i++){
				if(!vl.get(i)){if(nl<=i){P=new LinkedList<Integer>();break;}}else nl=Math.max(nl,Math.min(L[i],m));
				if(l<=i){P.add(nl);l=nl;}
			}
			pw.println(P.size());
			while(!P.isEmpty()){l=P.removeFirst();
				pw.println(R[l]+" "+L[Math.max(0,R[l])]);
			}if(xd>1)pw.println();
		}
		pw.close();
	}
}
/*
2

1
-1 0
-5 -3
2 5
0 0

1
-1 0
0 1
0 0

*/