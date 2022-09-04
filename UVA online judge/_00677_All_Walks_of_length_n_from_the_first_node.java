import java.util.*;
import java.io.*;
public class _00677_All_Walks_of_length_n_from_the_first_node{
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer tk;boolean xd=false;
		try{
			while(true){
				tk= new StringTokenizer(br.readLine());
				int m= Integer.parseInt(tk.nextToken()),n=Integer.parseInt(tk.nextToken());
				boolean A[][]= new boolean[m][m];
				for (int i = 0;i<m;i++){tk= new StringTokenizer(br.readLine());
					for (int j = 0; j < m; j++)A[i][j]=tk.nextToken().charAt(0)=='1';
				}
				LinkedList<Integer>Pp= new LinkedList<Integer>(),Pi= new LinkedList<Integer>();
				int p=0,i=0,c=0,v=0;
				boolean q= true,qq=true,y=true;
				if(xd)pw.println();else xd=true;
				while(true){
					if(q){
						if(qq){v=v|(1<<p);
							if(c==n){
								Iterator<Integer> it= Pp.iterator();pw.print("(");
								while(it.hasNext())pw.print(it.next()+",");
								pw.println(p+1+")");
								y=false;i=m;
							}
						}qq=false;
						while(i<m){
							if((v&(1<<i))==0&&A[p][i]){Pi.add(i);c++;Pp.add(p+1);p=i;qq=true;i=0;break;}i++;
						}
						q=qq;if(!q)v=v&~(1<<p);
					}else{if(c==0)break;
						p=Pp.removeLast()-1;i=Pi.removeLast()+1;c--;q=true;qq=false;
					}
				}if(y)pw.println("no walk of length "+n);
				br.readLine();
			}
		}catch(Exception e){}
		pw.close();
	}
}
/*
5 2
0 1 0 1 0
1 0 1 0 0
0 1 0 1 1
1 0 1 0 1
0 0 1 1 0
-9999
5 3
0 1 0 1 0
1 0 1 0 0
0 1 0 1 1
1 0 1 0 1
0 0 1 1 0


*/
