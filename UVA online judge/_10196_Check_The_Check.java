import java.util.*;
public class _10196_Check_The_Check {
	static char T[][];
	static boolean V[][];
	public static boolean Chek(boolean t, int i, int j, int v){
		int I[]={-1,-1,-1,0,1,1,1,0};
		int J[]={-1,0,1,1,1,0,-1,-1};
		char E[]={'B','R'};
		int x,y;
		for (int k = 0; k < 8; k++){
			x=i+I[k];y=j+J[k];
			while(x>=0&&y>=0&&x<8&&y<8){
				if(T[x][y]!='.'){
					if(T[x][y]==E[k&1]+v || T[x][y]=='Q'+v)return true;
					break;
				}
				x+=I[k];y+=J[k];
			}
		}
			int r;if(t)r=-1;else r=1;
			if(i+r>=0&&t || i+r<8&&!t){
				if(j>=1&&T[i+r][j-1]=='P'+v ||j<7&&T[i+r][j+1]=='P'+v)return true;
			}
			int X[]={-1,-2,-2,-1,1,2,2,1};
			int Y[]={-2,-1,1,2,2,1,-1,-2};
			for (int k = 0; k < 8; k++) {
				x=i+X[k];y=j+Y[k];
				if(x>=0&&y>=0&&x<8&&y<8 && T[x][y]=='N'+v)return true;
			}
		return false;
	}
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int d =1;
		while(leer.hasNext()){
			T= new char[8][8];
			V= new boolean[8][8];
			int wi=0,wj=0,bi=0,bj=0;
			for (int i = 0; i < 8; i++) {
				String cad = leer.next();
				for (int j = 0; j < 8; j++) {
					T[i][j]=cad.charAt(j);
					if(T[i][j]!='.'){
						if(T[i][j]<97)V[i][j]=true;
						if(T[i][j]=='k'){bi=i;bj=j;}
						if(T[i][j]=='K'){wi=i;wj=j;}
					}
				}
			}
			if(bi!=wi||bj!=wj){
				boolean p=Chek(true, wi, wj, 32);
				boolean q=Chek(false, bi, bj, 0);
				if(p||q){
					if(p)System.out.println("Game #"+d+": white king is in check.");
					else System.out.println("Game #"+d+": black king is in check.");
				}else System.out.println("Game #"+d+": no king is in check.");
			}else break;
		    d++;
		}
	}
}

