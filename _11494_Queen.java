import java.util.*;
public class _11494_Queen {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			int x1= leer.nextInt();
			int y1= leer.nextInt();
			int x2= leer.nextInt();
			int y2= leer.nextInt();
			if(x1+y1+x2+y2>0){
				if(x1!=x2 || y1!=y2){
					if(x1==x2 || y1==y2 || y1-x1==y2-x2 || y1+x1==y2+x2)System.out.println(1);
					else System.out.println(2);
				}else System.out.println(0);
			}else break;
		}
	}
}
