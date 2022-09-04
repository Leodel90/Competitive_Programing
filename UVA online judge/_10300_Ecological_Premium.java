import java.util.*;
public class _10300_Ecological_Premium {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t= leer.nextInt();
		for (int i = 0; i < t; i++) {
			int n = leer.nextInt();
			long res=0;
			for (int j = 0; j < n; j++) {
				int a = leer.nextInt();leer.nextInt();
				int b = leer.nextInt();
				res+=a*b;
			}
			System.out.println(res);
		}
	}
}
