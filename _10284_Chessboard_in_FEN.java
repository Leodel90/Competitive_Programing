import java.util.*;
public class _10284_Chessboard_in_FEN {
	static char M[][];
	static boolean V[][];
	static int r;
	public static void R(int x, int y){
		V[x][y]=true;
	    int X[]= {-1,0,1,0};
		int Y[]= {0,1,0,-1};
		for (int i = 0; i < 4; i++){
			int a=x+X[i],b=y+Y[i];
			while(a>=0&&a<8&&b>=0&&b<8){
				if(M[a][b]=='.'){
					if(!V[a][b]){r--;
					V[a][b]=true;}
				}else break;
				a+=X[i];b+=Y[i];
			}
		}
	}
	public static void B(int x,int y){
		V[x][y]=true;
	    int X[]= {-1,-1,1,1};
		int Y[]= {-1,1,1,-1};
		for (int i = 0; i < 4; i++) {
			int a=x+X[i],b=y+Y[i];
			while(a>=0&&a<8&&b>=0&&b<8){
				if(M[a][b]=='.'){
					if(!V[a][b]){r--;
					V[a][b]=true;}
				}else break;
				a+=X[i];b+=Y[i];
			}
		}
	}
	public static void K(int x, int y){
		V[x][y]=true;
		int X[]={-1,-2,-2,-1,1,2,2,1};
		int Y[]={-2,-1,1,2,2,1,-1,-2};
		for (int i = 0,a,b; i < 8; i++){
			a=x+X[i];b=y+Y[i];
			if(a>=0&&b>=0&&a<8&&b<8&& M[a][b]=='.'&&!V[a][b]){
				r--;V[a][b]=true;
			}
		}
		
	}
	public static void KING(int x, int y){
		for (int i = -1; i<2; i++) {
			for (int j = -1; j < 2; j++) {
				if(x+i>=0&&x+i<8&&y+j>=0&&y+j<8&&M[x+i][y+j]=='.'&&!V[x+i][y+j]){
					r--;V[x+i][y+j]=true;
				}
			}
		}
	}
	public static void QUEEN(int x,int y){
	    	B(x,y);R(x,y);
	}
	public static void P(int x,int y){
		boolean q;int i;
		if(M[x][y]=='P'){q=x>0;i=-1;}else {q=x<7;i=1;}
		if(q&&y>0&&!V[x+i][y-1]&&M[x+i][y-1]=='.'){r--;V[x+i][y-1]=true;}
		if(q&&y<7&&!V[x+i][y+1]&&M[x+i][y+1]=='.'){r--;V[x+i][y+1]=true;}
	}
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
	    while(leer.hasNext()){
	    	StringTokenizer cad = new StringTokenizer(leer.next(),"/");
	    	M= new char[8][8];
	    	V= new boolean [8][8];int i=0;
	    	LinkedList<Integer> I= new LinkedList<Integer>();
	    	LinkedList<Integer> J= new LinkedList<Integer>();
	    	r=64;
	    	while(cad.hasMoreTokens()){
	    		String f = cad.nextToken();
	    		int p=0;
	    		for (int j=0,k=0;j < 8;j++){
	    			if(j==p){
					if(f.charAt(k)>57){r--;
						M[i][j]=f.charAt(k);
						I.add(i);J.add(j);p++;
					}else {p+=f.charAt(k)-48;M[i][j]='.';}
					k++;
					}else M[i][j]='.';
				}
	    		i++;
	    	}
	    	int x,y;
	    	while(!I.isEmpty()&&r>0){
	    		x=I.remove();
	    		y=J.remove();
	    		if(M[x][y]=='N'||M[x][y]=='n')K(x,y);
	    		if(M[x][y]=='K'||M[x][y]=='k')KING(x,y);
	    		if(M[x][y]=='Q'||M[x][y]=='q')QUEEN(x, y);
	    		if(M[x][y]=='R'||M[x][y]=='r')R(x,y);
	    		if(M[x][y]=='B'||M[x][y]=='b')B(x,y);
	    		if(M[x][y]=='P'||M[x][y]=='p')P(x,y);	
	    	}
	    	System.out.println(r);
	    }
	}
}
