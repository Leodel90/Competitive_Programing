import java.util.*;
public class _10812_Beat_the_Spread {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		for (int i = 0; i < n; i++){
			int d = leer.nextInt();
			int s = leer.nextInt();
			if(d>=s&&(d+s)%2==0&&(d-s)%2==0){
				System.out.println(((d+s)>>1)+" "+((d-s)>>1));
			}else System.out.println("impossible");
		}
	}
}
