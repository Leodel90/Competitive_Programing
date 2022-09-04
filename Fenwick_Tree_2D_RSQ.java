import java.io.*;
import java.util.StringTokenizer;
public class Fenwick_Tree_2D_RSQ {
	static int FT[][], MF[][],n,m,adj,MI[][],x2,y2;
	public static int rq(int x,int y){
		if(x>0&&y>0){
			if(MF[x][y]==0){
				int lsbx=(x&(~x+1)),lsby=(y&(~y+1));
				MF[x][y]=FT[x][y]+rq(x,y-lsby)+rq(x-lsbx,y)-rq(x-lsbx,y-lsby)+1;
			}
			return MF[x][y]-1;
		}return 0;
	}
	public static void adjust(int x, int y){
		if(x<=n&&y<=m&&MF[x][y]!=-1){
			FT[x][y]=FT[x][y]-MI[x2][y2]+adj;MF[x][y]=-1;
			int lsbx=(x&(~x+1)),lsby=(y&(~y+1));
			adjust(x+lsbx,y);adjust(x,y+lsby);adjust(x+lsbx,y+lsby);
		}
	}
	public static void main(String[] args) throws IOException{
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
			StringTokenizer tk = new StringTokenizer(br.readLine());
			n= Integer.parseInt(tk.nextToken());m= Integer.parseInt(tk.nextToken());
			FT= new int [n+1][m+1];
			MI= new int [n][m];
			MF= new int [n+1][m+1];
			for (int i = 0,lsbi=1; i < n; i++,lsbi=(i+1)&(~(i+1)+1) ){
				tk= new StringTokenizer(br.readLine());
				for (int j = 0,lsbj=1; j < m; j++,lsbj=(j+1)&(~(j+1)+1)){
					MI[i][j]=Integer.parseInt(tk.nextToken());
					MF[i+1][j+1]=MI[i][j]+MF[i+1][j]+MF[i][j+1]-MF[i][j];
					FT[i+1][j+1]=MF[i+1][j+1]-MF[i+1][j+1-lsbj]-MF[i+1-lsbi][j+1]+MF[i+1-lsbi][j+1-lsbj];
					
				}
			}
			for (int i = 1; i <=n; i++) {
				for (int j = 1; j <=m; j++) {
					System.out.print(FT[i][j]+" ");
				}System.out.println();
			}MF= new int [n+1][m+1];
			while(true){
				tk = new StringTokenizer(br.readLine());
				if(tk.countTokens()<=1)break;
				int x1,y1;
				if(tk.nextToken().charAt(0)=='q'){
					x1=Integer.parseInt(tk.nextToken());y1=Integer.parseInt(tk.nextToken());
					x2=Integer.parseInt(tk.nextToken());y2=Integer.parseInt(tk.nextToken());
					System.out.println(rq(x2,y2)-rq(x2,y1-1)-rq(x1-1,y2)+rq(x1-1,y1-1));
				}
				else {x1=Integer.parseInt(tk.nextToken());y1=Integer.parseInt(tk.nextToken());adj=Integer.parseInt(tk.nextToken());
				x2=x1-1;y2=y1-1;
				adjust(x1, y1);
				MF= new int [n+1][m+1];
				MI[x2][y2]=adj;
				for (int i = 1; i <=n; i++) {
					for (int j = 1; j <=m; j++) {
						System.out.print(FT[i][j]+" ");
					}System.out.println();
				}
				}
			}
			pw.close();
	}
}

/*
3 4
1 2 3 4
2 2 3 4
3 3 3 4


*/