import java.util.*;
public class Teclado_Defectuoso {
	public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
     while(leer.hasNext()){
    	String cad = leer.nextLine()+']',beiju="",text="";
    	char t = ']';
    	 for (int i = 0; i < cad.length(); i++) {
			char x=cad.charAt(i);
		    if(x=='[' || x==']'){t=x;beiju=text+beiju;text="";}
		    else {
		    	if(t==']')beiju=beiju+x;
		    	else text=text+x;
		    }
    	 }System.out.println(beiju);
     }
	}

}
/*
This_is_a_[Beiju]_text
[[]][][]Happy_Birthday_to_Tsinghua_University
*/