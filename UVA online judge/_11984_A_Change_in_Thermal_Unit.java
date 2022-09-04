import java.text.DecimalFormat;
import java.util.*;
public class _11984_A_Change_in_Thermal_Unit {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int i = 1; i <=t; i++){
			double c=leer.nextDouble();
			double d=leer.nextDouble();
        	c+=(d*5)/9;
        	DecimalFormat A = new DecimalFormat("0.00");
        	String R=A.format(c);
        	System.out.println("Case "+i+": "+R.substring(0,R.length()-3)+"."+R.substring(R.length()-2,R.length()));
		}
	}
}
