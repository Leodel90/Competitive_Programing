import java.util.*;
public class _11764_Jumping_Mario {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for (int i = 1; i <=t; i++){
			int n = leer.nextInt();
			int hj=0;
			int lj=0;
			if(n>=1){
				int a = leer.nextInt();
				for (int j = 1; j < n; j++){
					int c = leer.nextInt();
					if(c!=a){
						if(c>a)hj++;
						else lj++;
						a=c;
					}
				}
			}System.out.println("Case "+i+": "+hj+" "+lj);
		}
	}
}
