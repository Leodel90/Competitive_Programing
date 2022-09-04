import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _11553_Grid_Game {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int t = Integer.parseInt(br.readLine());
		for (int xd = 0; xd < t; xd++){
			int n = Integer.parseInt(br.readLine());
			int M[][]= new int [n][n];
			for (int i = 0; i < n; i++){
				StringTokenizer tk = new StringTokenizer(br.readLine());
				for (int j = 0; j < n; j++) M[i][j]=Integer.parseInt(tk.nextToken());
			}
			int v=0,s=0,p=0,a=0,min=Integer.MAX_VALUE;
			LinkedList<Integer> Pi= new LinkedList<>();
			boolean q=true,qq=true;
			while(true){
				if(q){
					if(qq){
						if(p==n){min=Math.min(min,s);q=false;}
					}qq=false;
					for (int i = a; i < n&&q; i++){
						if((v&(1<<i))==0){v|=1<<i;Pi.add(i);a=0;qq=true;s+=M[p][i];p++;break;}
					}
					q=qq;
				}else{
					if(p==0)break;
					a=Pi.removeLast();
					v=v&~(1<<a);
					p--;s-=M[p][a];
					a++;q=true;qq=false;
				}
			}
			pw.println(min);
		}
		pw.close();
	}
}
/*
4
2
10 10
-5 -5
2
10 -5
10 -5
2
10 -5
-5 10
3
1 2 3
3 4 5
-10 100 100


*/
