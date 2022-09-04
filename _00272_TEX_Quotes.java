import java.util.*;
public class _00272_TEX_Quotes {
public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		boolean q = true;
		while(leer.hasNext()){
			String cad = leer.nextLine();			
			if(cad.length()>0){
			StringBuilder r= new StringBuilder();
			for (int i = 0; i < cad.length(); i++){
			 if(cad.charAt(i)==34){
				 if(q)r.append("``"); else r.append("''");
					 q=!q;
			 }else r.append(cad.charAt(i));
			}System.out.println(r);
		    }		
		}
	}
}
