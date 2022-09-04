import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
public class _10582__ASCII_Labyrinth {
	static int L[][],D[][],n,m;
	static long s;
	public static void C(int x, int y,int cx,int cy){
		LinkedList<Integer> Pcx= new LinkedList<Integer>(),Pcy= new LinkedList<Integer>();
		boolean q=true,qq=true;long v=0;int c=0,aux;
		int P1[]= {2,1,4,3},P2[]= {4,3,2,1};
		while(true){
			if(q){
				if(qq){q=L[x][y]!=0&&D[x][y]==0;
					if(x==n&&y==m){s++;q=false;}
				}qq=false;
				if(q){Pcx.add(cx);Pcy.add(cy);qq=true;
					if(L[x][y]==2){
						if((v&((long)(1)<<c))==0 && D[x+cx][y+cy]!=P1[D[x-cx][y-cy]-1]){
							D[x][y]=P1[D[x-cx][y-cy]-1];aux=cx;cx=-cy;cy=-aux;
						}
						if((v&((long)(1)<<c))!=0 && D[x+cx][y+cy]!=P2[D[x-cx][y-cy]-1]){
							D[x][y]=P2[D[x-cx][y-cy]-1];aux=cx;cx=cy;cy=aux;
						}
					}else D[x][y]=D[x-cx][y-cy];
					c++;x+=cx;y+=cy;
				}q=qq;
			}else{
				if(c==0)break;c--;
				x-=cx;y-=cy;D[x][y]=0;
				cx=Pcx.removeLast();cy=Pcy.removeLast();
				if(L[x][y]==2&&(v&((long)(1)<<c))==0){
					v|=(long)(1)<<c;q=true;qq=false;
				}else v&=~((long)(1)<<c);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		for (int xd = Integer.parseInt(br.readLine()); xd >0; xd--){
			StringTokenizer tk = new StringTokenizer(br.readLine()),tk1,tk2;
			n=Integer.parseInt(tk.nextToken());m=Integer.parseInt(tk.nextToken());
			L= new int [n+2][m+2];D= new int [n+2][m+2];
			for (int i = 1; i <=n; i++){
				br.readLine();tk=new StringTokenizer(br.readLine(),"|");
				tk1=new StringTokenizer(br.readLine(),"|");
				tk2=new StringTokenizer(br.readLine(),"|");
				for (int j = 1; j <=m; j++){String t=tk1.nextToken();
				if(t.charAt(1)!=' '){	
					if(t.equals("***") || tk.nextToken().charAt(1)=='*'&&tk2.nextToken().charAt(1)=='*')L[i][j]=1;
						else L[i][j]=2;
					}
				}
			}br.readLine();
			for (int i = 1; i <=n; i++){D[i][0]=1;D[i][m+1]=1;}
			for (int i = 1; i <=m; i++){D[0][i]=4;D[n+1][i]=4;}s=0;
			D[1][1]=2;C(1, 2, 0, 1);
			D[1][1]=3;C(2, 1, 1, 0);
			pw.println("Number of solutions: "+s);
		}
		pw.close();
	}
}

/*
2
4 6
+---+---+---+---+---+---+
|   |   |   |   |   |   |
|***|***|** |** |** |***|
|   |   | * | * | * |   |
+---+---+---+---+---+---+
|   |   |   |   |   |   |
|   |** |** |***|** |** |
|   | * | * |   | * | * |
+---+---+---+---+---+---+
|   |   |   |   |   |   |
|***|** |***|***|***|** |
|   | * |   |   |   | * |
+---+---+---+---+---+---+
|   |   |   |   |   |   |
|** |   |***|   |** |** |
| * |   |   |   | * | * |
+---+---+---+---+---+---+
8 8
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
|** |** |** |** |** |** |** |** |
| * | * | * | * | * | * | * | * |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
|** |** |** |** |** |** |** |** |
| * | * | * | * | * | * | * | * |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
|** |** |** |** |** |** |** |** |
| * | * | * | * | * | * | * | * |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
|** |** |** |** |** |** |** |** |
| * | * | * | * | * | * | * | * |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
|** |** |** |** |** |** |** |** |
| * | * | * | * | * | * | * | * |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
|** |** |** |** |** |** |** |** |
| * | * | * | * | * | * | * | * |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
|** |** |** |** |** |** |** |** |
| * | * | * | * | * | * | * | * |
+---+---+---+---+---+---+---+---+
|   |   |   |   |   |   |   |   |
|** |** |** |** |** |** |** |** |
| * | * | * | * | * | * | * | * |
+---+---+---+---+---+---+---+---+

*/