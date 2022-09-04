import java.util.*;
public class _11044_Searching_for_Nessy {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for (int i = 0; i < t; i++){
		    double n = (leer.nextDouble()-2)/3;
		    double m = (leer.nextDouble()-2)/3;
		    if(n>(int)n)n=(int)n+1;
		    if(m>(int)m)m=(int)m+1;
		    System.out.println((int)(n*m));
		}
	}
}
