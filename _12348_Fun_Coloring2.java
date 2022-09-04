import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _12348_Fun_Coloring2{
	static String r;
	static int n,m,N[],ln,L[],c,LM[];
	static LinkedList<Integer> LN[];
	static boolean q;
	public static void G(){
		if(c==ln){q=false;r="Y";return;}
		Iterator<Integer> it=LN[c].iterator();
		boolean q1=true;
		while(it.hasNext()){int y=it.next();
			LM[y]++;q1=q1&&(LM[y]<L[y]||L[y]==1);
		}
		if(q1){c++;G();c--;}
		q1=true;it=LN[c].iterator();
		while(it.hasNext()&&q){int y=it.next();
			LM[y]-=2;q1=q1&&(Math.abs(LM[y])<L[y]||L[y]==1);
		}
		if(q1&&q){c++;G();c--;}
		it=LN[c].iterator();while(it.hasNext())LM[it.next()]++;
	}
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter (new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int k = Integer.parseInt(br.readLine()); k >0 ; k--){
			r="N";StringTokenizer tk = new StringTokenizer(br.readLine());
			n=Integer.parseInt(tk.nextToken());m=Integer.parseInt(tk.nextToken());
			N=new int [n+1];ln=0;L= new int[m];
			LN= new LinkedList[n+1];LM= new int[m];
			for(int i = 0; i < m; i++){tk = new StringTokenizer(br.readLine());
				while(tk.hasMoreTokens()){L[i]++;
					N[ln]=Integer.parseInt(tk.nextToken());
					LN[ln]= new LinkedList<Integer>();LN[ln].add(i);
					for (int j = ln-1; j >=0; j--){
						if(N[j]==N[ln]){
							LN[j].add(i);ln--;break;
						}
					}ln++;
				}
			}c=0;
			if(k>1)br.readLine();
			q=true;G();
			pw.print(r);
		}
		pw.close();
	}
}


/*
3
5 3
1 2 3
2 3 4
1 3 5

7 7
1 2
1 3
4 2
4 3
2 3
1 4
5 6 7

1 1
-2
*/