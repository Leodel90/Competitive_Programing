import java.util.*;
public class _11799_Horror_Dash {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for (int i = 1; i <=t; i++){
			int n = leer.nextInt();
			int max=0;
			for (int j = 0; j < n; j++) 
				max=Math.max(max, leer.nextInt());
			System.out.println("Case "+i+": "+max);
		}
	}
}
