import java.util.*;
public class _00220_Othello{
	static char M[][];
	public static boolean verifica(int x, int y , char p){
		int I[]={-1,-1,-1,0,0,1,1,1};
		int J[]={-1,0,1,-1,1,-1,0,1},c=0;
		boolean q=false;
		if(M[x][y]!='-')return false;
		for (int i = 0; i < 8; i++){
			int a=x+I[i],b=y+J[i];q=false;c=0;
			while(a>=1&&a<=8&&b>=1&&b<=8&&M[a][b]!='-'&&!q){
				if(M[a][b]!=p){c++;
				a+=I[i];b+=J[i];
				}
				else q=true;
			}
			if(q&&c>0)return true;
		}return false;
	}
	public static void Llena(int x, int y , char p){
		int I[]={-1,-1,-1,0,0,1,1,1};
		int J[]={-1,0,1,-1,1,-1,0,1};
		M[x][y]=p;
		for (int k = 0; k < 8; k++){
			int a= x+I[k],b=y+J[k];
			LinkedList<Integer>X= new LinkedList<Integer>();
			LinkedList<Integer>Y= new LinkedList<Integer>();
			while(a>=1&&a<=8&&b>=1&&b<=8&&M[a][b]!='-'){
				if(M[a][b]==p){
					while(!X.isEmpty())
						M[X.remove()][Y.remove()]=p;
					break;
				}else {
					X.add(a);Y.add(b);
				}
				a+=I[k];b+=J[k];
			}
		}
	}
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		for (int xd = 0; xd < n; xd++){
			M= new char[9][9];
			for (int i = 1; i <=8; i++) {
				String cad = leer.next();
				for (int j = 1; j <=8; j++) {
					M[i][j]=cad.charAt(j-1);
				}
			}
			char P=leer.next().charAt(0);
			if(xd!=0)System.out.println();
			while(true){
				String cad = leer.next();
				if(cad.charAt(0)=='L'){boolean p=false,q;
					for (int i = 1; i <=8; i++){
						for (int j = 1; j <=8; j++){
							q=verifica(i,j,P);
							if(q){if(p)System.out.print(" ("+i+","+j+")");else System.out.print("("+i+","+j+")");}
							p=p||q;
							
						}
					}
					if(!p)System.out.print("No legal move.");
					System.out.println();
				}
				if(cad.charAt(0)=='M'){int x=cad.charAt(1)-48,y=cad.charAt(2)-48;
				boolean p=false,q;
				for (int i = 1; i <=8&&!p; i++){
					for (int j = 1; j <=8&&!p; j++){
						q=verifica(i,j,P);
						p=p||q;
					}
				}
				if(!p){if(P=='W')P='B';else P='W';}
             
					Llena(x,y,P);
					int b=0,w=0;
					for (int i = 1; i <=8; i++){
						for (int j = 1; j <=8; j++){
							if(M[i][j]!='-'){
								if(M[i][j]=='B')b++;else w++;
							}
						}
					}
					if(b>=10)System.out.print("Black - "+b);
					else System.out.print("Black -  "+b);
					if(w>=10)System.out.print(" White - "+w);
					else System.out.print(" White -  "+w);
					System.out.println();
					if(P=='W')P='B';else P='W';
				}
				if(cad.charAt(0)=='Q')break;
			}
			
			for (int i = 1; i <=8; i++){
				for (int j = 1; j <=8; j++){
					System.out.print(M[i][j]);
				}System.out.println();
			}
		}
	}
}
