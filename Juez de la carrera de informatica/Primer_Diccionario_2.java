import java.io.*;
import java.util.*;
public class Primer_Diccionario_2 {
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> list = new LinkedList<String>();
        TreeSet<String> Dic = new TreeSet<String>();
        StringBuffer sb = new StringBuffer();
		 String m;
		 while((m=br.readLine())!=null)
		 {   m=m+" ";
			 StringBuilder a = new StringBuilder();
			 for (int i = 0; i < m.length(); i++) {
				char x = m.charAt(i);
				if(x>='A' && x<='Z' || x>='a' && x<='z'){
				a.append(x);	
				}else{
					String word=a.toString().toLowerCase();
				   a= new StringBuilder();
				   if(word.equals(""))continue;
				   if(!Dic.contains(word)){
					   list.add(word);
					   Dic.add(word);
				   }
				}
			}
			 
		 }
		 Collections.sort(list);
		 while(!list.isEmpty()){
			sb.append(list.remove()).append("\n");
		 }
		 System.out.print(sb);
	}
}
/*
Don Quijote de la Mancha1 es una novela escrita 
por el español Miguel de Cervantes Saavedra. 
Publicada su primera parte con el titulo de El ingenioso 
hidalgo don Quijote de la 
Mancha a comienzos de 1605, es una de las obras mas destacadas de la 
literatura española y la literatura universal, y una de las más 
traducidas. En 1615 aparecio la segunda parte del 
Quijote de Cervantes con el título de El ingenioso caballero 
don Quijote de la Mancha.

Don Quijote fue la primera obra genuinamente desmitificadora
 de la tradicion caballeresca y cortes, por el tratamiento burlesco 
que le da. Representa la primera obra literaria que se puede clasificar 
como novela moderna y tambien la primera novela polifónica, y como tal, 
ejercio un influjo abrumador en toda la narrativa europea posterior. 
*/
