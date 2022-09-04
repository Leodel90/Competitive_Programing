import java.util.*;
public class _12279_Emoogle_Balance {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int k =1;
		while(leer.hasNext()){
			int n = leer.nextInt();
			if(n!=0){
			int x=0;
			int y=0;
			for (int i = 0; i < n; i++) {
				if(leer.nextInt()==0)y--;
				else x++;
			}
			System.out.println("Case "+k+": "+(int)(x+y));
			k++;
			}
		}
	}
}
