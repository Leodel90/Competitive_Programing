import java.io.*;
import java.util.StringTokenizer;
public class _00183_Bit_Maps {
	static char V[][],VC[];
	static int p;
	static PrintWriter pw;
	public static int B(int xi,int yi,int xs, int ys){
		if(xi<=xs && yi<=ys){
			if(xi<xs||yi<ys){
				int c1=B((xi+xs)/2+1,(yi+ys)/2+1,xs,ys);
				c1+=B((xi+xs)/2+1,yi,xs,(yi+ys)/2);
				c1+=B(xi,(yi+ys)/2+1,(xi+xs)/2,ys);
				c1+=B(xi,yi,(xi+xs)/2,(yi+ys)/2);
				if(c1==4&&VC[p-1]!='D'&&VC[p-1]==VC[p-2]&&VC[p-1]==VC[p-3]&&VC[p-1]==VC[p-4]||
						c1==2&&VC[p-1]!='D'&&VC[p-1]==VC[p-2])p=p-c1;else VC[p]='D';
			}else
				VC[p]=V[xi][yi];
			p++;
			return 1;
		} return 0;
	}
	public static void D(int xi,int yi,int xs, int ys){
		if(xi<=xs && yi<=ys){
			p++;
			if(VC[p]=='D'){
				D(xi,yi,(xi+xs)/2,(yi+ys)/2);
				D(xi,(yi+ys)/2+1,(xi+xs)/2,ys);
				D((xi+xs)/2+1,yi,xs,(yi+ys)/2);
				D((xi+xs)/2+1,(yi+ys)/2+1,xs,ys);
			}else{
				for (int i = xi; i <=xs ; i++){
					for (int j = yi; j <=ys; j++)V[i][j]=VC[p];
				}	
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		String g = br.readLine();
		StringTokenizer tk = new StringTokenizer(g);
		while(true){
			if(g.charAt(0)=='#')break;
			char T= tk.nextToken().charAt(0);int r=Integer.parseInt(tk.nextToken()),c=Integer.parseInt(tk.nextToken());
			StringBuilder sb = new StringBuilder();
			while(true){
				g= br.readLine();tk= new StringTokenizer(g);
				if(g.charAt(0)=='#'||tk.countTokens()>1)break;
				sb.append(tk.nextToken());p=0;
			}
			if(T=='B')pw.print('D');else pw.print('B'); 
			if(r<10)pw.print(" ");if(r<100)pw.print(" ");pw.print(" "+r);
			if(c<10)pw.print(" ");if(c<100)pw.print(" ");pw.println(" "+c);
			V= new char[r+1][c+1];
			int cl=0;
			if(T=='B'){p=0;VC= new char[(r*c)<<1];
				for (int i = 0,cc=0; i <r; i++){
					for (int j = 0; j <c; j++){V[i+1][j+1]=sb.charAt(cc);cc++;}
				}
				B(1,1,r,c);
				for (int i = p-1; i >=0; i--){pw.print(VC[i]);cl++;if(cl==50){pw.println();cl=0;}}
			}else{VC= new char[sb.length()];p=-1;
				for (int i = 0; i < sb.length(); i++)VC[i]= sb.charAt(i);
				D(1,1,r,c);
				sb=new StringBuilder();
				for (int i = 1; i <=r ; i++){
					for (int j = 1; j <=c; j++){pw.print(V[i][j]);cl++;if(cl==50){pw.println();cl=0;}
					}
				}
			}
			if(cl!=0)pw.println();
		}
		pw.close();
	}
}
/*

B 3   4
001000011011
D  2   3
DD10111
#

0010
0001
1011


*/
