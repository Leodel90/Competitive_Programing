import java.util.*;
public class _11172_Relational_Operator {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for (int i = 0; i < t; i++) {
			long a = leer.nextLong();
			long b = leer.nextLong();
			if(a!=b){
				if(a>b)System.out.println(">");
				else System.out.println("<");
			}else System.out.println("=");
		}
	}
}
