import java.util.*;
public class _11364_Parking {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for (int i = 0; i < t; i++){
			int n = leer.nextInt();
			int min =100,max=-1;
			for (int j = 0; j <n; j++) {
				int x= leer.nextInt();
				if(x>max)max=x;
				if(x<min)min=x;
			}
			System.out.println((max-min)<<1);
		}
	}
}
