import java.util.*;
public class _1498_Decodificando_el_mensaje {

	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		String cad= leer.next();
		StringBuilder r= new StringBuilder();
		for (int i = 0, c; i < cad.length(); i=i+8){
			c=0;
			for (int j = 0; j <8; j++){
				if(cad.charAt(i+j)=='1')
					c=c+(int)Math.pow(2,7-j);
			}
			r.append((char)c);
		}
		System.out.println(r);
	}
}
