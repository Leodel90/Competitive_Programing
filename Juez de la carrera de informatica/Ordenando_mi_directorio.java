import java.util.*;
public class Ordenando_mi_directorio {

	public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            while(leer.hasNext()){
            	int t = leer.nextInt();
            	for (int u = 1; u <=t; u++) {
					int n = leer.nextInt();
					String archivos[]=new String[n];
					for (int i = 0; i < n; i++) {
						archivos[i]=leer.next(); 
					}
					int  c=1;
            		while((!archivos[n-1].equals(".") || !archivos[n-2].equals("..")) && (!archivos[n-1].equals("..") || !archivos[n-2].equals("."))){
            			int p=0;
            			for(int i = 0;i<n;i++){
            				if(archivos[i].equals(".") || archivos[i].equals("..")){p=i;break;}
            			}
            			String cad = archivos[p];
            			archivos[p]=archivos[n-c];
            			archivos[n-c]=cad;
            			c++;
            		}
            		System.out.println("Caso "+u+":");
            		for (int i = 0; i < n; i++) {
						System.out.println(archivos[i]);
					}
            		System.out.println();
					
				}
            }

	}

}
/*
2
6
ContestApplet.jnlp
.
Image.jpg
Book.pdf
Movie.avi
..
8
No
..
Zaphod
.
Just
Very
very...
Improbable


 
*/
