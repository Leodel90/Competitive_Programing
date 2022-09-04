import java.util.*;
public class Generacion_de_secuencias_e_parentesis{
	static int n;
	static char cad [];
	public static void Generador(int x , int y){
		if(y<=x){
			if(x+y==2*n){
				for (int i = 0; i < 2*n; i++) {
					System.out.print(cad[i]);
				}System.out.println();
			}
			else {
				if(x<n){cad[x+y]='(';
					Generador(x+1, y);}
				cad[x+y]=')';
				Generador(x,y+1);
			}
		}
	}
	public static void main(String[] args) {
	Scanner leer= new Scanner(System.in);
	while(leer.hasNext()){
	   n = leer.nextInt();
	   cad=new char[2*n];
	   Generador(0,0);
	}
	}

}
