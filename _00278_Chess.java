import java.util.*;
public class _00278_Chess {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int  n = leer.nextInt();
        for (int i = 0; i < n; i++) {
			String cad = leer.next();
			int f = leer.nextInt();
			int c = leer.nextInt();
			if(cad.charAt(0)=='r' || cad.charAt(0)=='Q')System.out.println(Math.min(f, c)); 
			if(cad.charAt(0)=='k')System.out.println((f*c +(f*c)%2)/2);
			if(cad.charAt(0)=='K')System.out.println(((f+f%2)/2)*((c+c%2)/2));
		}
	}
}
