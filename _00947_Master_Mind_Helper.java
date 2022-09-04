import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00947_Master_Mind_Helper{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int n = Integer.parseInt(br.readLine()); n>0; n--){
			StringTokenizer tk = new StringTokenizer(br.readLine());
			char N[]= tk.nextToken().toCharArray();
			int CC=Integer.parseInt(tk.nextToken()),CI=Integer.parseInt(tk.nextToken()),V[]= new int[10];
			for (int i = 0; i < N.length; i++)V[N[i]-48]++;
			LinkedList<Integer> Pi= new LinkedList<Integer>();
			boolean q=true,qq=true;
			int cc=0,ci=0,c=0,r=0,i=1;
			while(true){
				if(q){
					if(qq){q=cc<=CC&&N.length-c>=CC-cc;
						if(q){
							if(N.length==c){
								Iterator<Integer> it= Pi.iterator();ci=0;c=0;
								int g []= V.clone();
								while(it.hasNext()){i=it.next();if(g[i]>0&&N[c]-48!=i){ci++;g[i]--;}c++;}
								if(ci==CI)r++;q=false;c=N.length;
							}
						}
					}qq=false;
					if(q&&i<=9){
						if(N[c]-48==i){cc++;V[i]--;}
						Pi.add(i);c++;i=1;qq=true;
					}
					q=qq;
				}else{if(c==0)break;
					i=Pi.removeLast();c--;
					if(N[c]-48==i){V[i]++;cc--;}
					q=true;qq=false;i++;
				}
			}
			pw.println(r);
		}
		pw.close();
	}
}
/*
10
1234 2 2
111 1 0
567 0 1
91543 5 0
91543 0 5
12 0 1
12 1 0
1111 1 0
121 0 1
121 1 0
*/