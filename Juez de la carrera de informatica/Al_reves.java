import java.util.*;
public class Al_reves {
	static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
		Stack<Integer> Pila = new Stack<Integer>();
		while(leer.hasNext()){
			int n = leer.nextInt();
			for (int i = 0; i < n; i++) {
				int a = leer.nextInt();
			    for (int j = 0; j < a; j++) {
					Pila.push(leer.nextInt());
				}
			    while(!Pila.isEmpty()){
			    	System.out.print(Pila.pop()+" ");
			    }System.out.println();
			}
		}
	}
}
/*
3
5
1 3 2 5 7
1
100
6
8 3 0 1 -4 9
*/
 