import java.util.*;
public class _00227_Puzzle {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int d =1;
		while(leer.hasNext()){
			String cad = leer.nextLine();
			if(!cad.equals("Z")){
			char T[][]= new char[5][5];
			int x=0,y=0;
			for (int i = 0; i < 5; i++){
				if(cad.length()==4)cad=cad+' ';
				for (int j = 0; j < 5; j++){
					T[i][j]=cad.charAt(j);
					if(T[i][j]==' '){x=i;y=j;}
				}cad=leer.nextLine();
			}
			boolean p=true;
			while(true){
				for (int i = 0; i < cad.length()&&p; i++) {
					if(cad.charAt(i)!='0'){
						if(cad.charAt(i)=='A'){
							if(x>0){
								T[x][y]=T[x-1][y];T[x-1][y]=' ';x--;
							}else p=false;
						}
						if(cad.charAt(i)=='B'){
							if(x<4){
								T[x][y]=T[x+1][y];T[x+1][y]=' ';x++;
							}else p=false;
						}
						if(cad.charAt(i)=='R'){
							if(y<4){
								T[x][y]=T[x][y+1];T[x][y+1]=' ';y++;
							}else p=false;
						}
						if(cad.charAt(i)=='L'){
							if(y>0){
								T[x][y]=T[x][y-1];T[x][y-1]=' ';y--;
							}else p=false;
						}
					}else break;
				}
				
			if(cad.charAt(cad.length()-1)!='0')cad=leer.nextLine();
			else break;
			}
			if(d>1)System.out.println();
			System.out.println("Puzzle #"+d+":");
			if(p){
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						System.out.print(T[i][j]);
						if(j<4)System.out.print(' ');
					} 
					System.out.println();
				}
			}else System.out.println("This puzzle has no final configuration.");
			d++;
			}else break;
		}
	}
}
