import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _10503_The_dominoes_solitaire {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
		StringTokenizer tk;
		while (true) {
			int n=Integer.parseInt(br.readLine()),m;
			if(n==0)break;
			m=Integer.parseInt(br.readLine());
			tk = new StringTokenizer(br.readLine());
			tk.nextToken(); int d=Integer.parseInt(tk.nextToken()),d1;
			tk = new StringTokenizer(br.readLine());
			d1=Integer.parseInt(tk.nextToken());
			int D[][]= new int[m][3],nd=0;
			for (int i = 0; i < m; i++){tk= new StringTokenizer(br.readLine());
				D[nd][0]=Integer.parseInt(tk.nextToken());D[nd][1]=Integer.parseInt(tk.nextToken());
				D[nd][2]=D[nd][0];D[nd][0]=Math.min(D[nd][0],D[nd][1]);D[nd][1]=Math.max(D[nd][2],D[nd][1]);D[nd][2]=1;
				for (int j = 0; j < nd; j++){
					if(D[j][0]==D[nd][0] && D[j][1]==D[nd][1]){
						D[j][2]++;D[nd][2]=0;nd--;break;
					}
				}nd++;
			}
			LinkedList<Integer> Pd=new LinkedList<Integer>();
			LinkedList<Integer> Pi=new LinkedList<Integer>();
			int c=0,i=0;
			boolean q=true,qq=true;
			String r="NO";
			while(true){
				if(q){
					if(qq){q=c<n;
						if(!q&&d==d1){r="YES";break;}
					}qq=false;
					while(q&&i<nd){
						qq=(D[i][0]==d||D[i][1]==d)&&D[i][2]>0;
						if(qq){D[i][2]--;
							Pd.add(d);Pi.add(i);
							if(D[i][0]==d)d=D[i][1];
							else d=D[i][0];c++;
							i=0;break;
						}i++;
					}q=qq;
				}else{
					if(c==0)break;
					i=Pi.removeLast();d=Pd.removeLast();
					c--;D[i][2]++;q=true;i++;
				}
			}
			pw.println(r);
		}
		pw.close();
	}
}
/*
3
4
0 1
3 4
2 1
5 6
2 2
3 2
2
4
0 1
3 4
1 4
4 4
3 2
5 6
14
14
0 1
9 0
1 7
9 1
1 2
3 1 
1 4
5 1
1 5
6 1
2 1
1 6
1 7
9 9
3 1
1 4
0

*/