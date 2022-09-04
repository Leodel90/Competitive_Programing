import java.util.*;
public class _12289_One_Two_Three {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for (int i = 0; i < t; i++) {
			String cad = leer.next();
			if(cad.length()==3){
				if(cad.charAt(0)=='o'&&cad.charAt(1)=='n' || cad.charAt(0)=='o'&&cad.charAt(2)=='e' || cad.charAt(1)=='n'&&cad.charAt(2)=='e')System.out.println(1);
				else System.out.println(2);
			}else System.out.println(3);
		}
	}
}
