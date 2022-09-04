import java.util.*;
public class _12468_Zapping {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			int a = leer.nextInt();
			int b = leer.nextInt();
			if(a!=-1){
			System.out.println(Math.min(Math.abs(a-b), 100-Math.abs(a-b)));	
			}
		}
	}
}
