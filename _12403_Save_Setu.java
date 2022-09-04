import java.util.*;
public class _12403_Save_Setu {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		long c=0;
		for (int i = 0; i < t; i++) {
			if(leer.next().charAt(0)=='d')c=c+leer.nextInt();
			else System.out.println(c);
		}
	}
}
