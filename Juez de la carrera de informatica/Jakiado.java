import java.util.*;
public class Jakiado {
	public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     while(leer.hasNext()){
    	 int t = leer.nextInt();
    	 leer.nextLine();
         for (int i = 0; i < t; i++) {
			String cad = leer.nextLine();
			boolean p=false,q=false,r=false,s=false;
			for (int j = 0; j < cad.length()&&(!p||!q||!r||!s); j++){
				char l= cad.charAt(j);
				p=p||l>='A'&&l<='Z';
				q=q||l>=48&&l<=57;
				r=r||l=='@'||l=='.'||l=='_'||l=='>'||l=='<'||l=='-';
				s=s||l>='a'&&l<='z';
			}if(p&&q&&r&&s)System.out.println("Dale no te jackiaran esta vez.");
			else System.out.println("No va dar Botas.");
			}
     }

	}
}
/*
5
Botas123
75803727
B0t45_Rul35
31-07-1996
D0R4_l4_Expl0r4D0r4_I_<3_U
*/
 