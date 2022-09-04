import java.util.*;
public class _11498_Division_of_Nlogonia {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			int k = leer.nextInt();
			if(k!=0){int X=leer.nextInt();
			int Y = leer.nextInt();
			for (int i = 0; i < k; i++) {
				int x = leer.nextInt();
				int y = leer.nextInt();
				if(X!=x&&Y!=y){
					if(x>X&&y>Y)System.out.println("NE");
					if(x<X&&y>Y)System.out.println("NO");
					if(x<X&&y<Y)System.out.println("SO");
					if(x>X&&y<Y)System.out.println("SE");
				}else System.out.println("divisa");
			}
			}
		}
	}
}
