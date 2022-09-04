import java.util.*;
public class Facil_de_decir {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(true){
        	String cad = leer.next();
        	if(!cad.equals("end")){
        		int a=0;	
        		int v=0,c=0,r;char ant='A';
        		boolean z=false,x=true,y=true,w;
        		for (int i = 0; i < cad.length()&&x&&y; i++) {
					char l=cad.charAt(i);
					w=l=='a'||l=='e'||l=='i'||l=='o'||l=='u';
					z=z||w;
					if(w){v++;c=0;}else{c++; v=0;}
				    x=v<3&&c<3;
				    y= ant!=l||l=='e'||l=='o';
        		ant=l;
        		}
        		if(z&&y&&x)System.out.println("<"+cad+"> is acceptable.");else System.out.println("<"+cad+"> is not acceptable.");
        	}else break;
        }
	}

}
/*
a
tv
ptoui
bontres
zoggax
wiinq
eep
houctuh
end
*/