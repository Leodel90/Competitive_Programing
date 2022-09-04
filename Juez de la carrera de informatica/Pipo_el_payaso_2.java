import java.util.*;
public class Pipo_el_payaso_2 {
	public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        while(leer.hasNext()){
        	int t= leer.nextInt();
        	for (int u = 0; u < t; u++) {
				int n = leer.nextInt();
			    String basura=leer.nextLine();
        	   int res=0,p=0;
			    for (int i = 0; i < n; i++) {
					String cad = leer.nextLine();
					 int l []=new int[27];
					int j=0;
				    boolean q=true;
				    while(j<cad.length()){
				    	if(cad.charAt(j)!=' ' && q)
				    	{q=false;l[cad.charAt(j)-97]++;}
				    	else {if(cad.charAt(j)==' ')q=true;}
				    j++;
				    }j=0;
				    for (int k = 0; k < 27; k++) {
						if(l[k]>l[j])j=k;
					}
				    if(l[j]>res){res=l[j];p=i+1;}
				}System.out.println("El ganador es "+p);
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