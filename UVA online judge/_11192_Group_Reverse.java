import java.util.*;
public class _11192_Group_Reverse {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(true){
		    int n = leer.nextInt();
		    if(n==0)break;
		    String cad= leer.next();
		    int h = cad.length()/n;
		    int p = h;
		    for (int i = 0; i < n; i++){
				for (int j = p-1; j >=p-h; j--)
					System.out.print(cad.charAt(j));				
				p=p+h;
			}
		    System.out.println();
		}
	}
}