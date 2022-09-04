import java.util.*;
public class _11727_Cost_Cutting {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		int s[]= new int[3];
		for (int i = 1; i <=t; i++) {
			s[0]= leer.nextInt();
			s[1]= leer.nextInt();
			s[2]= leer.nextInt();
			Arrays.sort(s);
			System.out.println("Case "+i+": "+s[1]);
		}
	}
}
