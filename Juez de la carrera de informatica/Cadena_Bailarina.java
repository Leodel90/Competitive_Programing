import java.util.*;
public class Cadena_Bailarina {
public static void main(String[] args) {
	   Scanner leer = new Scanner (System.in);
	   while (leer.hasNext()){
       String cad = leer.nextLine();
       if(cad.charAt(0)>=65){
    	   String res ="";
           boolean Mm= true;
           for (int i = 0; i < cad.length(); i++) {
			char x = cad.charAt(i);
        	   boolean q = x<97;
			   if(x!=' '){
				   if(q!=Mm){if(q)x=(char)(x+32);else x=(char)(x-32);}
			       Mm=!Mm;
			   }
			   res = res+x;
			   }
           System.out.println(res); 
         }    
       }
    }
}
/*
6
o
aaaabbbbaaaa
Retweeted
Like si resolviste el problema
A
s d ffd aa sds
y DsTrTyUi KjHgFvHj

*/