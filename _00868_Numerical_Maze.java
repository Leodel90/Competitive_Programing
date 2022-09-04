import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.TreeSet;
public class _00868_Numerical_Maze {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int X[]={-1,0,1,0},Y[]={0,1,0,-1};
		for (int t= Integer.parseInt(br.readLine());t>0; t--){
			br.readLine();
			StringTokenizer tk = new StringTokenizer(br.readLine());
			int n=Integer.parseInt(tk.nextToken()),m=Integer.parseInt(tk.nextToken());
			int M[][]= new  int[n+2][m+2];
			TreeSet<Integer> TM[][]= new TreeSet[n+2][m+2];
			for (int i = 1; i <=n; i++){tk= new StringTokenizer(br.readLine());
				for (int j = 1; j <=m; j++){M[i][j]=Integer.parseInt(tk.nextToken());
				TM[i][j]=new TreeSet<Integer>();   
				}
			}
			int j1=-1,j2=m+1;
			for (int p = 1; p <=m; p++){
				if (M[1][p]==1){
					LinkedList<Integer> Pi= new LinkedList<Integer>(),Px= new LinkedList<Integer>(),
					Py= new LinkedList<Integer>(),Pc= new LinkedList<Integer>(),Pl= new LinkedList<Integer>();
					boolean q=true,qq=true;
					int i=0,l=1,c=1,x=1,y=p;
					while(true){
						if(q){
							if(qq){q=!TM[x][y].contains(l);i=0;
								if(q){TM[x][y].add(l);
									if(c==l){c=0;l++;}c++;
									if(x==n&&y<j2&&c==1)j2=y;
									
								}
							}qq=false;
							while(i<4&&q){
								if(M[x+X[i]][y+Y[i]]==c){
									Pi.add(i);Px.add(x);Py.add(y);Pc.add(c);Pl.add(l);
									qq=true;x+=X[i];y+=Y[i];break;
								}i++;
							}q=qq;
						}else{
							if(Pi.isEmpty())break;
							c=Pc.removeLast();l=Pl.removeLast();
							i=Pi.removeLast()+1;x=Px.removeLast();y=Py.removeLast();
							q=true;qq=false;
						}
					}
					if(j2<m+1){j1=p;break;}
				}
			}
			pw.println(1+" "+j1);
			pw.println(n+" "+j2);
			if(t>1)pw.println();
		}
		pw.close();
		
	}
}



/*
2

10 11
1 6 5 2 1 1 2 3 2 1 4
1 2 6 3 2 1 1 3 4 5 6
1 2 3 2 1 3 2 5 6 4 2
2 3 1 2 2 3 3 4 5 2 1
3 4 2 3 4 5 3 2 1 4 2
4 3 4 4 5 6 4 3 2 5 3
5 4 2 1 2 3 4 4 3 6 4
6 5 3 2 3 4 5 5 4 1 1
1 6 4 3 5 5 6 6 1 2 3
2 1 5 1 6 6 1 2 2 3 4

10 11
1 6 5 2 1 1 2 3 2 1 4
1 2 6 3 2 1 1 3 4 5 6
1 2 3 2 1 3 2 5 6 4 2
2 3 1 2 2 3 3 4 5 2 1
3 4 2 3 4 5 3 2 1 4 2
4 3 4 4 5 6 4 3 2 5 3
5 4 2 1 2 3 4 4 3 6 4
6 5 3 2 3 4 5 5 4 1 1
1 6 4 3 5 5 6 6 1 2 3
2 1 5 1 6 6 1 2 2 3 4


*/