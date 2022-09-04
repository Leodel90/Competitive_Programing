import java.util.*;
public class _12577_Hajj_e_Akbar {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int i =1;
		while(leer.hasNext()){
			String cad = leer.next();
			if(cad.charAt(0)!='*'){
				if(cad.length()==4)System.out.println("Case "+i+": Hajj-e-Akbar");
				else System.out.println("Case "+i+": Hajj-e-Asghar");
				i++;
			}
		}
	}
}
