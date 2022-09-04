import java.util.*;
public class _12592_Slogan_Learning_of_Princess {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		TreeMap<String, String> S = new TreeMap<String, String>();
		leer.nextLine();
		for (int i = 0; i < n; i++) 
			S.put(leer.nextLine(), leer.nextLine());
		int q=leer.nextInt();
		leer.nextLine();
		for (int i = 0; i < q; i++) 
				System.out.println(S.get(leer.nextLine()));
	}
}
