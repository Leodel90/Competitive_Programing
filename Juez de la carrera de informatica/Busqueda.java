import java.util.*;
public class Busqueda {
	public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
while(leer.hasNext()){
	LinkedList<String> ListaNegra = new LinkedList<String>();
	int n= leer.nextInt();
	leer.nextLine();
	for (int i = 0; i < n; i++) {
		ListaNegra.add(leer.nextLine());
	}
	n = leer.nextInt();
	leer.nextLine();
	for (int i = 0; i < n; i++) {
		if(ListaNegra.contains(leer.nextLine()))System.out.println("SSS");
		else System.out.println("-");
	}
}
	}

}
/*
4
jacob appelbaum
andy muller maguhn
jeremie zimmerman
julian assange
5
julian assange
moot
andy muller maguhn
hiroyuki nishimura
ramesh srinivasan
*/