import java.util.*;
public class _1497_Codificando_el_mensaje {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String cad= leer.nextLine();
		StringBuilder respuesta= new StringBuilder();	
		for (int i = 0; i < cad.length(); i++){
			int ascii = cad.charAt(i);
			for (int j = 7; j >=0; j--){
				if(( ascii & ((int)Math.pow(2,j)) ) == 0)
				respuesta.append('0');
				else respuesta.append('1');
			}
			
		}
		System.out.println(respuesta);
		
	}
}
