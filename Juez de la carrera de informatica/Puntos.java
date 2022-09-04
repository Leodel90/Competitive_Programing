import java.util.*;
public class Puntos {
    public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		int h = leer.nextInt();
		TreeMap<String, Double> A = new TreeMap<String, Double>();
		for (int i = 0; i < n; i++) {
			A.put(leer.next(),leer.nextDouble());
		}
		for (int i = 0; i < h; i++) {
		double c =0;
		while(true){
		   String cad=leer.next();
		   if(cad.charAt(0)!='.'){
			   if(A.containsKey(cad))
			   {	   
				   c=c+A.get(cad);}
		   }else break;
		}
		if((int)c==c)
		System.out.println((int)c);
		else System.out.println(c);
		}
	}

}
/*
7 2
administrar 100000
gasto 200000
ejercer 50000
responsabilidad 25000
experiencia 100
habilidad 50
dinero 75000
el titular deberá administrar el gasto de dinero de la leche jardín de infantes
y ejercer la responsabilidad de hacer el cambio que él o ella va a compartir
la responsabilidad de la tarea de administrar el dinero de su auxiliar
cuya habilidad y experiencia deberán garantizar el ejercicio del gasto éxito
.
este individuo debe tener la habilidad para llevar a cabo un trasplante de corazón y experiencia en la ciencia de cohetes
.
*/