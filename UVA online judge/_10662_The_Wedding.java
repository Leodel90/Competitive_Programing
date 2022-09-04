import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _10662_The_Wedding {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
		StringTokenizer tk;
		try{
        while(true){tk= new StringTokenizer(br.readLine());
            int t = Integer.parseInt(tk.nextToken()),r= Integer.parseInt(tk.nextToken()),h= Integer.parseInt(tk.nextToken());
            int T[]= new int [t];
            int R[]= new int [r];
            int H[]= new int [h];
            LinkedList<Integer> TR[]= new LinkedList[t];
            LinkedList<Integer> RH[]= new LinkedList[r];
            boolean HT[][]= new boolean [h][t];
            for (int i = 0; i < t; i++){tk= new StringTokenizer(br.readLine());
                T[i]=Integer.parseInt(tk.nextToken());
                TR[i]=new LinkedList<Integer>();
                for (int j = 0; j < r; j++){if(tk.nextToken().equals("0"))TR[i].add(j);}
			}
            for (int i = 0; i < r; i++){tk= new StringTokenizer(br.readLine());
            R[i]=Integer.parseInt(tk.nextToken());
            RH[i]=new LinkedList<Integer>();
            for (int j = 0; j < h; j++){if(tk.nextToken().equals("0"))RH[i].add(j);}
		    }
            for (int i = 0; i < h; i++){tk= new StringTokenizer(br.readLine());
            H[i]=Integer.parseInt(tk.nextToken());
            for (int j = 0; j < t; j++)HT[i][j]=tk.nextToken().equals("0");
		    }
            int P=Integer.MAX_VALUE;
            int mt=-1,mr=0,mh=0;
            for (int pt = 0; pt < t; pt++){
				for (int i = 0,pr; i < TR[pt].size(); i++){
					pr=TR[pt].remove();TR[pt].add(pr);
						for (int j = 0,ph;j < RH[pr].size(); j++){
							ph=RH[pr].remove();RH[pr].add(ph);
							if(HT[ph][pt]){
								if(T[pt]+R[pr]+H[ph]<P){mt=pt;mr=pr;mh=ph;P=T[pt]+R[pr]+H[ph];
								}
						    }
					    }
				}
			}
            if(mt>-1)
            pw.println(mt+" "+mr+" "+mh+":"+P);
            else pw.println("Don't get married!");
        }
        }catch(Exception e){}pw.close();
	}
}
/*
2 2 2
12 0 0
1 1 1
34 0 0
3 1 1
21 1 0
2 1 0
2 2 2
12 0 0
1 0 0
34 0 0
3 0 0
21 0 0
2 0 0
5 5 6
970 0 1 1 1 0
856 0 0 0 0 0
1290 1 0 0 1 0
1361 0 0 1 0 0
82 0 0 0 0 1
1182 0 0 0 1 1 0
450 0 1 1 0 0 1
895 0 0 1 0 1 1
1865 0 1 0 0 1 1
183 1 1 1 1 1 0
252 1 1 1 0 1
1813 1 0 0 1 1
1429 0 0 1 0 0
1522 1 1 1 0 0
1762 0 0 1 0 1
1946 0 1 0 0 0

*/