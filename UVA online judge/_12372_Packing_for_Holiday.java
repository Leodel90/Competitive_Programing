import java.util.*;
public class _12372_Packing_for_Holiday {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for (int i = 1; i <=t; i++) {
			int l= leer.nextInt();
			int h= leer.nextInt();
			int w = leer.nextInt();
			if(l<=20&&h<=20&&w<=20)System.out.println("Case "+i+": good");
			else System.out.println("Case "+i+": bad");
		}
	}
}
