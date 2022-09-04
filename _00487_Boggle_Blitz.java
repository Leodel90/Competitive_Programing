import java.io.*;
import java.util.*;
public class _00487_Boggle_Blitz{
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int SX[]={-1,-1,-1,0,0,1,1,1},SY[]={-1,0,1,-1,1,-1,0,1};
		int t=Integer.parseInt(br.readLine());
		for (int xd = 0; xd < t; xd++){br.readLine();
				int n = Integer.parseInt(br.readLine());
				LinkedList<Integer> X[]= new LinkedList[256];
				LinkedList<Integer> Y[]= new LinkedList[256];
				TreeSet<String> T[]= new TreeSet[256];
				for (int i = 0; i < 256; i++){X[i]= new LinkedList<Integer>();Y[i]= new LinkedList<Integer>();T[i]= new TreeSet<String>();}
				char M[][]= new char[n][n];
				for (int i = 0; i < n; i++) {M[i]=br.readLine().toCharArray();
					for (int j = 0; j < n; j++){X[M[i][j]].add(i);Y[M[i][j]].add(j);}
				}
				boolean Q[][]= new boolean[n][n];
				StringBuilder sb,asb;
				for (int i = 0,x,y,nx,ny,p,c; i < 256; i++){
					while(!X[i].isEmpty()){x=X[i].removeFirst();y=Y[i].removeFirst();
						if (!Q[x][y]){
							LinkedList<Integer>Px= new LinkedList<Integer>(),Py= new LinkedList<Integer>(),Pp= new LinkedList<Integer>();
							boolean q= true,qq=true;c=0;p=0;
							while(true){
								if(q){
									if(qq){Q[x][y]=true;
									if(c>=2){
									Iterator<Integer> itx= Px.iterator(),ity=Py.iterator();asb=new StringBuilder(""+M[x][y]);
									sb=new StringBuilder(""+M[itx.next()][ity.next()]);sb.append(asb);c++;
										for (int j = 3; j<=c;j++){asb=new StringBuilder(""+M[itx.next()][ity.next()]);
											asb.append(sb);sb=asb;T[j].add(sb.toString());
										}c--;
									}
									}qq=false;
									while(p<8){nx=x+SX[p];ny=y+SY[p];
										if(nx>=0&&nx<n &&ny>=0&&ny<n&&M[nx][ny]>M[x][y]){qq=true;c++;
											Pp.addFirst(p);p=0;Px.addFirst(x);Py.addFirst(y);x=nx;y=ny;break;
										}p++;
									}
									q=qq;
								}else{if(c==0)break;c--;
									x=Px.removeFirst();y=Py.removeFirst();p=Pp.removeFirst()+1;qq=false;q=true;
								}
							}
						}
					}
				}
				if(xd>0)pw.println();
				for (int i = 3; i < 256; i++){
					Iterator it=T[i].iterator();
					while(it.hasNext())pw.println(it.next());
				}
		}
		pw.close();
	}
}

/*
3

3
one
top
dog

4
abcd
bcda
cdab
dabc

4
bile
tglp
aest
here
*/
