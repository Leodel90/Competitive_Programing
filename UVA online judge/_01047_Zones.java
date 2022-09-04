import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _01047_Zones{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer tk;
		int y =1;
		while(true){
			tk= new StringTokenizer(br.readLine());
			int t= Integer.parseInt(tk.nextToken()),p= Integer.parseInt(tk.nextToken()),m;
			if(t==0 && p==0)break;
			int T[]= new int [t+1];tk= new StringTokenizer(br.readLine());
			for (int i = 1; i<=t; i++)T[i]= Integer.parseInt(tk.nextToken());
			m=Integer.parseInt(br.readLine());
			int IV[]= new int [m],I[]= new int [m];
			for (int i = 0,l; i < m; i++){
				tk = new StringTokenizer(br.readLine());
				l= Integer.parseInt(tk.nextToken());
				LinkedList<Integer> L= new LinkedList<Integer>();
				for (int j = 0,o; j < l; j++){o=Integer.parseInt(tk.nextToken());L.add(o);IV[i]|=1<<o;}
				I[i]= Integer.parseInt(tk.nextToken());
				while (!L.isEmpty())T[L.remove()]-=I[i];
			}
			LinkedList<Integer> PV= new LinkedList<Integer>(),PS= new LinkedList<Integer>(),
					PT= new LinkedList<Integer>(),R= new LinkedList<Integer>();
			boolean q=true,qq=true;
			int i=0,c=0,s=0,r=0,iv=0;
			while(true){
				if(q){
					if(qq){
						if(c==p){
							if(s>r){r=s;R=(LinkedList<Integer>) PT.clone();}
							q=false;
						}
					}i++;q=(i+p-c-1<=t)&&q;
					if(q){PV.add(iv);PS.add(s);s+=T[i];PT.add(i);c++;
						for (int j = 0; j < m; j++){
							if((iv&(1<<j))==0 && (IV[j]&(1<<i))==(1<<i)){s+=I[j];iv|=(1<<j);}
						}qq=true;
					}
				}else{c--;if(c==-1)break;
				iv=PV.removeLast();s=PS.removeLast();i=PT.removeLast();qq=false;q=true;
				}
			}
			pw.println("Case Number  "+y);y++;
			pw.println("Number of Customers: "+r);
			pw.print("Locations recommended:");
			while(!R.isEmpty())pw.print(" "+R.removeFirst());
			pw.println();
			pw.println();
		}pw.close();
	}
}

/*
5 3
15 20 25 30 24
5
2 1 2 7
3 1 2 3 3
2 2 3 2
2 3 4 5
2 4 5 6
5 3
25 25 25 25 25
4
2 1 2 5
2 2 3 5
2 3 4 5
2 4 5 5
5 3
25 25 25 25 25
0
0 0
*/