import java.util.*;
public class _12157_Tariff_Plan {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t= leer.nextInt();
        for (int i = 1; i <=t; i++) {
        	long M=0;
    		long J=0;
    		int n = leer.nextInt();
    		for (int k = 0; k < n; k++){
				int c = leer.nextInt();
				M+=(c/30+1)*10;
				J+=(c/60+1)*15;
			}
    	    long min=Math.min(M, J);
    		System.out.print("Case "+i+": ");
    		if(M==min)System.out.print("Mile ");
    		if(J==min)System.out.print("Juice ");
    		System.out.println(min);
		}
	}
}
