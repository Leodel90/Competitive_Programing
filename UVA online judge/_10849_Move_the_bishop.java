import java.util.*;
public class _10849_Move_the_bishop {
	public static void main(String[] args) {
		Scanner leer  = new Scanner(System.in);
		int k = leer.nextInt();
		for (int i = 0; i < k; i++){
			int t = leer.nextInt();
			int n = leer.nextInt();
			for (int j = 0; j < t; j++){
				int a = leer.nextInt();
				int b = leer.nextInt();
				int c = leer.nextInt();
				int d = leer.nextInt();
				if((a+b)%2==(c+d)%2){
					if(a!=c||b!=d){
					if(b-a==d-c|| a+b==c+d)System.out.println(1);
					else System.out.println(2);}else System.out.println(0);
				}else System.out.println("no move");
			}
		}

	}
}
