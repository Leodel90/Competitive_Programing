import java.util.*;
public class Redundancia {
	public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    while(leer.hasNext()){
    String cad = leer.nextLine();
    StringTokenizer B = new StringTokenizer(cad);
    Lista A = new Lista();
    while(B.hasMoreTokens()){
    	A.add(Integer.parseInt(B.nextToken()));
    }
    A.muestra();
    }
	}
static class Nodo{
	int n,c;
	Nodo sig;
	public Nodo(int x ){
		n=x;c=1;
		sig=null;
	}
}
	
static class Lista{
     static Nodo ini,fin;
     public Lista(){
    	 ini=null;
    	 fin=null;
     }
     public void add(int x){
    	 Nodo l= ini;
    	 while(l!=null){
    		 if(l.n==x){
    			 l.c++;return;
    		 }l=l.sig;
    	 }
    	 Nodo Aux = new Nodo(x);
    	 if(ini==null)ini=Aux;
    	 else
         fin.sig=Aux;
    	 fin=Aux;
     }
     public void muestra(){
    	 Nodo l = ini;
    	 while(l!=null){
    		System.out.println(l.n+" "+l.c);
    		l=l.sig;
    	 }
     }
}
/*
3 1 2 2 1 3 5 3 3 2
 */
}