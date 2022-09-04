import java.util.*;
public class _11687_Digits {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
		    String cad = leer.next();
		    if(cad.charAt(0)!='E'){
		    	int i;
		    	if(!cad.equals("1")){
            	   if(cad.length()>1){
            		 if(cad.length()>9)i=4;
            		 else i=3;
            	   }else i=2;
               }else i=1;
		    	System.out.println(i);
		    }else break;
		}
	}
}
