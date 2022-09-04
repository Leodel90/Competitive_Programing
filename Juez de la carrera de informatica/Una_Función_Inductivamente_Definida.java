import java.util.*;
public class Una_Función_Inductivamente_Definida {
	static int F[];
	public static int F(int n) {
		if (F[n] == 0) {
			if (n > 1) {
				if ((n & 1) == 1) {
					int x = (n - 1) >> 1;
					F[n] = F(x) + F(x + 1);
				} else
					F[n] = n>>1;
			} else F[n]=1; 
		}
		return F[n];
	}
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		F = new int[10000000];boolean q=true;
		try{
		while (true){if(q)q=false;else System.out.println();
			int n = leer.nextInt();
			if (n > 0) {
             System.out.println("f("+n+") = "+F(n));
			}
		}
	}catch (Exception e) {
	}
	}
}
