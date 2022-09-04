import java.util.*;
public class Viajero_del_mundo_plano {
	public static void main(String[] args) {
	Scanner leer = new Scanner (System.in);
	int n = leer.nextInt()+1;
	int m = leer.nextInt()+1;
	boolean M[][]= new boolean[m][n];
	char V[] ={'N','E','S','W'};
	while(leer.hasNext()){
		int x = leer.nextInt();
		int y= m -leer.nextInt()-1;
	    String g = leer.next();
		int ori = g.charAt(0);
	    switch (ori) {
		case 'N':
			ori=0;
			break;
		case 'E':
		ori=1;
		break;
		case 'S':
		ori=2;
		break;
		case 'W':
		ori=3;
			break;
		default:
			break;
		}
	    String cad = leer.next();
	    int a =x; int b=y;
	    boolean q = true;
	    for (int i = 0; i < cad.length()&&q; i++) {
			int c=cad.charAt(i);
			if(c=='F'){
				switch (ori) {
				case 0:
				q=y-1>=0;if(q)y--;
				break;
				case 1:
				q=x+1<n;if(q)x++;
				break;
				case 2:
				q=y+1<m; if(q)y++;
				break;
				case 3:
				q=x-1>=0;if(q)x--;
					break;
				default:
					break;
				}
				
			if(!q&&!M[y][x]){b=m-b-1;System.out.println(a+" "+b+" "+V[ori]+" LOST");M[y][x]=true;}
			else q=true;	
			a=x;b=y;
			
			}else {if(c=='R')ori=(ori+1)%4; else ori=(ori+3)%4;}
	    }
	    if(q){b=m-b-1;System.out.println(a+" "+b+" "+V[ori]);}
	    
	}
	}
}
/*
5 3
1 1 E
RFRFRFRF
3 2 N
FRRFLLFFRRFLL
0 3 W
LLFFFLFLFL 
*/
