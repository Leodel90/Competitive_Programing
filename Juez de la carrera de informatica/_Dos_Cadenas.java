import java.util.*;
public class _Dos_Cadenas {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		while(leer.hasNext()){
			String cad= leer.next()+leer.next();
			int letras[]= new int[26];
			for (int i = 0; i < cad.length(); i++){
				letras[(int)cad.charAt(i)-97]++;
			}
			boolean q= true;
			for (int i = 0; i < 26;i++){
				q = q && letras[i]>0;
			}
			if(q)System.out.println("Correcto");
			else System.out.println("Incorrecto");
		}
	}
}
