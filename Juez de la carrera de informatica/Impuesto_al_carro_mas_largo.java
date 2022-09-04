import java.util.*;
public class Impuesto_al_carro_mas_largo {
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		while(leer.hasNext()){
			int n = leer.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.printf("%.3f%n",leer.nextDouble()*leer.nextDouble());
			}
		}
	}
}
/*
2
10 1
4 2
*/
