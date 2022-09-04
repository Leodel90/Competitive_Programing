import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.TreeSet;
public class _12348_Fun_Coloring{
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter (new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int k = Integer.parseInt(br.readLine()); k>0; k--){
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(tk.nextToken()),m=Integer.parseInt(tk.nextToken());
			int S[][]= new int[m][4];
			for (int s = 0,c; s < m; s++){
				tk=new StringTokenizer(br.readLine());c=0;
				while(tk.hasMoreTokens()){S[s][c]=Integer.parseInt(tk.nextToken());c++;}
				S[s][3]=c;
			}
			if(k>1)br.readLine();
			LinkedList<Integer>Po=new LinkedList<Integer>(),Lr= new LinkedList<Integer>(),
					Lb= new LinkedList<Integer>(),Pg= new LinkedList<Integer>();
			LinkedList<LinkedList<Integer>>PLR= new LinkedList<LinkedList<Integer>>(),PLB= new LinkedList<LinkedList<Integer>>();
			LinkedList<Boolean> Pb= new LinkedList<Boolean>();
			boolean q=true,qq=true,Br=true,Bb=true,B=true,q1=true,qq1=true;
			int c=1,o=0,p=0,pp=0,cc=0,lg=2;
			String r="N";
			TreeSet T[]= new TreeSet[2];
			T[0]= new TreeSet<Integer>();T[1]= new TreeSet<Integer>();
			while(true){
				if(q){
					if(qq){
						if(p<m){
							Bb=false;Br=false;
							for (int j = 0; j < S[p][3]; j++){
								Br=T[0].contains(S[p][j])||Br;Bb=T[1].contains(S[p][j])||Bb;
							}
							lg=2;
							if(S[p][3]>1){B=!Br||!Bb;lg=S[p][3];}
							else B=!Br&&!Bb;
							c=1;cc=0;pp=0;q1=true;qq1=true;
							Lr=new LinkedList<Integer>();Lb= new LinkedList<Integer>();
							if(!Br)o=0;else o=1;
						}else{r="Y";break;}}
						qq=false;
						if(B){
							while(c<lg&&q){
								while(true){
									if(q1){
										if(qq1){
											if(cc==c){
												Iterator<Integer> it= Lr.iterator();
												while(it.hasNext())T[o].add(S[p][it.next()]);
												for (int j = 0; j < S[p][3]; j++){
													if(!T[0].contains(S[p][j])&&!T[1].contains(S[p][j])){T[1-o].add(S[p][j]);Lb.add(j);}
												}
												PLR.add(Lr);PLB.add(Lb);Pg.add(lg);
												Pb.add(true);q=false;Po.add(o);p++;qq=true;break;
											}
										}
										qq1=false;
										while(pp<S[p][3]&&q1){
											if(!T[1-o].contains(S[p][pp])){cc++;
												Lr.add(pp);qq1=true;q1=false;
											}pp++;
										}
										q1=qq1;
									}
									else{
										if(Lr.isEmpty())break;
										pp=Lr.removeLast()+1;
										q1=true;qq1=false;cc--;
									}
								}c++;
							}
						}else{
							Pb.add(false);p++;qq=true;
						}
						q=qq;
				}else{
					if(p==0)break;
					B=Pb.removeLast();p--;
					if(B){
						Lr=PLR.removeLast();Lb=PLB.removeLast();o=Po.removeLast();
						Iterator<Integer> it=Lr.iterator();
						while(it.hasNext()){T[o].remove(S[p][it.next()]);}
						it=Lb.iterator();
						while(it.hasNext()){T[1-o].remove(S[p][it.next()]);}
						q1=false;cc=Lr.size();c=cc;lg=Pg.removeLast();
						qq=false;q=true;
					}
				}
			}
			pw.print(r);
		}
		pw.close();
	}
}
/*
5
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

22 10
1
2
3
4
5
6
7
8
9
10

3 2
1 2 3
1 3 

9 8
2
5
6 2
5 1 8
7
9 8
9 2 7
2 3
*/


