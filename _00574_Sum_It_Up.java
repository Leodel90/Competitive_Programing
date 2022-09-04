import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _00574_Sum_It_Up{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		while(true){
			StringTokenizer tk= new StringTokenizer(br.readLine());
			int t=Integer.parseInt(tk.nextToken()),n=Integer.parseInt(tk.nextToken());
			if(n==0)break;
			int N[]= new int [n];
			for (int i = 0; i < n; i++)N[i]=Integer.parseInt(tk.nextToken());
			LinkedList<Integer> Pa= new LinkedList<Integer>(),Ps= new LinkedList<Integer>(),Ln= new LinkedList<Integer>();
			boolean q=true,qq=true,r=true;
			int i=0,s=0,a=t+1,v=0;
			pw.println("Sums of "+t+":");
			while(true){
				if(q){
					if(qq){
						if(s>=t&&!Ln.isEmpty()){
							if(s==t){r=false;
								Iterator <Integer> it = Ln.iterator();
								pw.print(it.next());
								while(it.hasNext())pw.print("+"+it.next());
								pw.println();
							}q=false;
						}else q=i<n;
					}
					if(q){Ps.add(s);Pa.add(a);
						if((v&(1<<i))==0&&N[i]<a){
							s+=N[i];Ln.add(N[i]);
						}else{a=N[i]; v|=1<<i;}
						i++;qq=true;
					}
				}
				else{
					if(i==0)break;i--;
					s=1<<i;a=Pa.removeLast();
					if((v&s)==0){v|=s;q=true;qq=false;Ln.removeLast();}
					else v&=~s;
					s=Ps.removeLast();
				}
			}
			if(r)pw.println("NONE");
		}
		pw.close();
	}
}
/*
4 6 4 3 2 2 1 1
5 3 2 1 1
400 12 50 50 50 50 50 50 25 25 25 25 25 25
0 0
*/