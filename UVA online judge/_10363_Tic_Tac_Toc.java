import java.util.*;
public class _10363_Tic_Tac_Toc {
  public static void main(String[] args){
	  Scanner leer = new Scanner(System.in);
	  int n = leer.nextInt();
	  char T[][]= new char[3][3];
	  for (int xd = 0; xd < n; xd++){
		  int c=0;
		for (int i = 0; i < 3; i++) {
			String cad = leer.next();
			for (int j = 0; j < 3; j++) {
				T[i][j]=cad.charAt(j);
				if(T[i][j]!='.'){
					if(T[i][j]=='X')c++;else c--;
				}
			}
		}
		boolean r=c==0||c==1,p=false,q=false;
		if(r){
			int x[]= {-1,-1,-1,0,0,1,1,1};
			int y[]= {-1,0,1,-1,1,-1,0,1};
		boolean B[][]= new boolean[3][3];
		for (int i = 0; i < 3&&r; i++){
			for (int j = 0; j < 3&&r; j++){
				if(!B[i][j]&&T[i][j]!='.'){B[i][j]=true;
					for (int k = 0; k < 8; k++){
						int a=i,b=j;boolean t=true;
						for (int l = 0; l < 2&&t; l++){a=a+x[k];b=b+y[k];
							t=a>=0&&b>=0&&a<3&&b<3&&T[a][b]==T[i][j];
							if(t)B[a][b]=true;
						}
						if(t){if(T[i][j]=='X')p=true;else q=true;r=T[i][j]=='X'&&c==1||T[i][j]=='O'&&c==0;}
					}
					
				}r=r&&!(p&&q);
			}
		}
		}
		if(r)System.out.println("yes");else System.out.println("no");
	}
  }
}
