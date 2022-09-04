import java.util.*;
public class Operadores_Relacionales {
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
while(leer.hasNext()){
    int t = leer.nextInt();
    for (int i = 0; i < t; i++) {
		int x=leer.nextInt();int y=leer.nextInt();
		if(x!=y){if(x>y)System.out.println(">");else System.out.println("<");}else System.out.println("=");
	}
	
}
	}

}
