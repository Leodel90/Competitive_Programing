import java.util.*;
public class Bhtml {
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    while(leer.hasNext()){
    	String cad = leer.nextLine();
    	Stack<Boolean> etiquetas = new Stack<Boolean>();
    	String res ="";boolean q=true;
    	for (int i = 0; i < cad.length(); i++) {
	    char x = cad.charAt(i);
	    if(x!='<'){
	    	if(!etiquetas.isEmpty()){
	    		if(!q && x>=97){
	    			x=(char)(x-32);
	    		}
	    		if(q && x<97){
	    			x=(char)(x+32);
	    		}
	    	}
	    	res=res+x;
	    }
	    else{i++;
	    	if(cad.charAt(i)=='/'){
	    	if(etiquetas.pop())i=i+5;
	    	else i=i+3;
	    	if(!etiquetas.isEmpty())
	    	  q=etiquetas.lastElement();
	    	}else{
	    		etiquetas.push(cad.charAt(i)=='D');
	    		q=etiquetas.lastElement();
	    		if(q)i=i+4;
	    		else i=i+2;
	    	}
	    	
	    }
		}
    	System.out.println(res);
    }
	}
}
/*
Thi<UP>sIs<DOWN>EaSY</DOWN>Pr<UP>O</UP>ble</UP>m 
*/