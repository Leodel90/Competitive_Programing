import java.util.*;
public class Bar {
static String bebidas[]={"ABSINTH", "BEER", "BRANDY", "CHAMPAGNE", "GIN", "RUM", "SAKE", "TEQUILA", "VODKA", "WHISKEY", "WINE"};
	public static void main(String[] args) {
		Scanner leer= new Scanner (System.in);
		while(leer.hasNext()){
			int n = leer.nextInt();
			if(n!=-1){
			int min=0;
			for (int i = 0; i < n; i++) {
				String cad = leer.next();
				if(cad.charAt(0)>=48 && cad.charAt(0)<=57){if(Integer.parseInt(cad)<18)min++;}
				else{
					for (int j = 0; j < 11; j++) {
						if(cad.equals(bebidas[j])){min++;break;}
					}
				}
			}System.out.println(min);
			}else break;
		}

	}

}
/*
5
18
VODKA
COKE
19
17
3
FANTA
SPRITE
COKE
-1

 
*/


