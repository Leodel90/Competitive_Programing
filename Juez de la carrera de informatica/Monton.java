import java.util.*;
public class Monton {

	public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       while(leer.hasNext()){
    	   String cad = leer.next();
    	   LinkedList<Integer> A = new LinkedList<Integer>();
    	   for (int i = 0; i < cad.length(); i++) {
			int x = cad.charAt(i);
			if((char)x=='*')
				{x=A.pop()*A.pop();A.push(x);}
			else {if((char)x=='+')
				{x=A.pop()+A.pop();A.push(x);}
			else A.push(x-48);
			
			}
			
		}
    	   System.out.println(A.pop());
       }

	}

}
