import java.io.Console;
import java.util.*;
   public class Primer_Diccionario {
     public static void main(String[] args) {
        try{
    	 Scanner leer = new Scanner (System.in);
        TreeSet<String> Dic = new TreeSet<String>();
        Console Co = System.console();
        Co.readLine();
        	String cad = "";//leer.nextLine();
        	if(cad.length()>0){
        		cad=cad+" ";
        		String res="";
        		char C[]=cad.toCharArray();
        	    for (int i = 0; i < cad.length(); i++) {
					if(C[i]>='A'&&C[i]<='Z' || C[i]>='a'&&C[i]<='z' || C[i]=='�' || C[i]=='�'||C[i]=='�' || C[i]=='�'|| C[i]=='�' || C[i]=='�' || C[i]=='�' || C[i]=='�' || C[i]=='�' || C[i]=='�' || C[i]=='�' || C[i]=='�' || C[i]=='�' || C[i]=='�'){
						if(C[i]>='A'&&C[i]<='Z' || C[i]=='�' || C[i]=='�' || C[i]=='�' || C[i]=='�' || C[i]=='�' || C[i]=='�')C[i]+=32;
						res=res+C[i];
					}else{
						if(res.length()>0){
							Dic.add(res);
							res="";
						}
					}
				}
        	}else{
        		while(!Dic.isEmpty()){
        			System.out.println(Dic.pollFirst());
        		}
        	}
        
     }catch(Exception e){}
        }
     
}

/* 
Don Quijote de la Mancha1 es una novela escrita 
por el espa�ol Miguel de Cervantes Saavedra. 
Publicada su primera parte con el titulo de El ingenioso 
hidalgo don Quijote de la 
Mancha a comienzos de 1605, es una de las obras mas destacadas de la 
literatura espa�ola y la literatura universal, y una de las m�s 
traducidas. En 1615 aparecio la segunda parte del 
Quijote de Cervantes con el t�tulo de El ingenioso caballero 
don Quijote de la Mancha.
Don Quijote fue la primera obra genuinamente desmitificadora
de la tradicion caballeresca y cortes, por el tratamiento burlesco 
que le da. Representa la primera obra literaria que se puede clasificar 
como novela moderna y tambien la primera novela polif�nica, y como tal, 
ejercio un influjo abrumador en toda la narrativa europea posterior.
*/
 