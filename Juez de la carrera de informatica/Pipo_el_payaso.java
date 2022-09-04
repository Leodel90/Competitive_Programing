import java.util.*;
public class Pipo_el_payaso {
	public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       while(leer.hasNext()){
    	   int t = leer.nextInt();
    	   for (int u = 0; u < t; u++) {
			int n = leer.nextInt();
            leer.nextLine();
            int gan = 0;int max = 0;
			for (int p = 1; p <=n; p++) {
				char cad []= (leer.nextLine()).toCharArray();
			    int letras []= new int[26];
			    boolean q=true;
				for (int i = 0; i < cad.length; i++) {
					if(q && cad[i]!=' '){
					if(cad[i]>=97 && cad[i]<=123){
						letras [cad[i]-97]++;
						if(letras[cad[i]-97]>max){
							max=letras[cad[i]-97];gan = p;
						}
					    
					}
					if(cad[i]>=65 && cad[i]<=91){
						letras [cad[i]-65]++;
						if(letras[cad[i]-65]>max){
							max=letras[cad[i]-65];gan = p;
						}
						
					}q=false;
					}else{
						q=cad[i]==' ';
					}
				}
			}System.out.println("El ganador es "+gan);
    	  }    	   
       }
       }
}
/*
2
2
tres tristes tigres tragan trigo en un trigal
pedro picapiedra pone piedras
3
pepe puede comer camarones picantes
pablito clavo un clavito sobre la cabeza de un calvito
prometo prometo prometo prometo prometo prometo prometo prometo
*/