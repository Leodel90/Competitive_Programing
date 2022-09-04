import java.util.*;
public class _11547_Automatic_Answer {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t= leer.nextInt();
        for (int i = 0; i < t; i++){
			System.out.println(Math.abs((((leer.nextInt()*63 + 7492)*5 - 498)/10)%10));
		}
	}
}
