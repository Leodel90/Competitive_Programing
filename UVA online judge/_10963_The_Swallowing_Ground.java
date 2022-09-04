import java.util.*;
public class _10963_The_Swallowing_Ground {
	public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int t = leer.nextInt();
       for (int i = 0; i < t; i++){
		int w = leer.nextInt();
		boolean q = true;
		if(w>0){
		int a=Math.abs(leer.nextInt()-leer.nextInt());
		for (int j = 1; j < w; j++){
			int y= Math.abs(leer.nextInt()-leer.nextInt());
			q=q&&a==y;
		}
		}
		if(q)System.out.println("yes");
		else System.out.println("no");
		if(i!=t-1)System.out.println();
	   }
	}
}
