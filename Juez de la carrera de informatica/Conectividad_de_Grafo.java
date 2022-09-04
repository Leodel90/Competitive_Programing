import java.util.*;
public class Conectividad_de_Grafo {
	static Lista Nodos[];
	static int n;
	static boolean N [];
	public static void Recorrer(int i){
		N[i]=true;
		for (int j = 0; j < Nodos[i].n; j++) {
			int x = Nodos[i].recorrer();
			if(!N[x])
				Recorrer(x);
		}
	}
public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     while(leer.hasNext()){
    	 int t = leer.nextInt(); 
    	 for (int i = 0; i < t; i++){
    		 String cad = leer.next();
    		 n=cad.charAt(0)-64; 
    		 Nodos= new Lista[n];
    		 for (int j = 0; j < n; j++)
    			 Nodos[j]= new Lista();
    		 N= new boolean[n];
    		 int sub=0;
    		 leer.nextLine();
    		 while(true){
             cad=leer.nextLine();
             StringTokenizer A = new StringTokenizer(cad);
             if(A.countTokens()==1){
            	 String c = A.nextToken();
             int x = c.charAt(0)-65;
             int y = c.charAt(1)-65;
             Nodos[x].add(y);
    		 Nodos[y].add(x);}
             else break;
    		 }
    		 for (int j = 0; j < n; j++) {
    			 if(!N[j]){
					Recorrer(j);
				    sub++;
				}
			}
    		 System.out.println(sub);
    		 System.out.println();
    	 }
     }
	}
static class Nodo {
	int n=0;
	Nodo sig;
	public Nodo (int x){
		n=x;
		sig=null;
	}	
}
static class Lista{
	int n;
	Nodo ini,fin;
	public Lista(){
		n=0;
		ini= null;
		fin=null;
	}
	public void add(int x){
		Nodo A = new Nodo(x);
		if(n==0){ini=A;fin=A;System.out.println("Hola");}
		else{System.out.println("Mundo");
			fin.sig=A;fin=A;
		}
	    n++;
	}
	public int recorrer(){
		Nodo A = new Nodo(ini.n);
		if(n>0){
			fin.sig=A;
			fin=A;
			ini=ini.sig;
		}
		return A.n;
	}
}
}
/*
 * 
3

E
AB
CE
DB
EC

E

E
AB
BC
AE
CD
DE

*/
