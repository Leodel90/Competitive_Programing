import java.util.*;
public class _12250_Language_Detection {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int i =1; 
	    while(leer.hasNext()){
	    	String cad = leer.next(),r;
	    	if(!cad.equals("#")){
	    		if(!cad.equals("HELLO")){
	    			if(!cad.equals("HOLA")){
	    				if(!cad.equals("HALLO")){
	    					if(!cad.equals("BONJOUR")){
	    						if(!cad.equals("CIAO")){
	    						    if(!cad.equals("ZDRAVSTVUJTE"))
	    						    	r="UNKNOWN";
	    						    else r="RUSSIAN";
	    						}else r="ITALIAN";
	    					}else r="FRENCH";
	    				}else r="GERMAN";
	    			}else r="SPANISH";
	    		}else r="ENGLISH";
	    		System.out.println("Case "+i+": "+r);i++;
	    	}
	    }	
	}
}
