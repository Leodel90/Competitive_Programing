import java.util.*;
public class _11350_Stern_Brocot_Tree {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int N= leer.nextInt();
        leer.nextLine();
        for (int i = 0; i < N; i++){
			String cad=leer.nextLine();
			long n1=0,n2=1,n=1,d=1,d1=1,d2=0;
			for (int j = 0; j < cad.length(); j++){
				if(cad.charAt(j)=='R'){n1=n;d1=d;n+=n2;d+=d2;}
				else{n2=n;d2=d;n+=n1;d+=d1;}
			}System.out.println(n+"/"+d);
		}
	}
}
