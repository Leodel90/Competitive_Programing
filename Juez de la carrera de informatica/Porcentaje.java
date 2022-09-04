import java.util.*;
public class Porcentaje {
	public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
      while(leer.hasNext()){
    	   String cad = leer.nextLine();
    	   if(!cad.equals("#")){
    		   String res="";
    		   for (int i = 0; i < cad.length(); i++) {
				   String x;
    			   switch (cad.charAt(i)){
    			   case ' ':
    				   x="%20";
    				   break;
    			   case '!':
    				   x="%21";
    				   break;
    			   case '$':
    				   x="%24";
    			      break;
    			   case '%':
    				   x="%25";
    				   break;
    			   case '(':
    				   x="%28";
    				   break;
    			   case ')':
    				   x="%29"; 
    				   break;
    			   case '*':
    				   x="%2a";
    				   break;
    			   default :
    				   x=cad.charAt(i)+"";
    				   break;
    			   }
    			   res=res+x;
			}System.out.println(res);
    	   }
      }

	}
}
/*
Happy Joy Joy!
http://icpc.baylor.edu/icpc/
plain_vanilla
(**)
?
the 7% solution
# 
*/
 