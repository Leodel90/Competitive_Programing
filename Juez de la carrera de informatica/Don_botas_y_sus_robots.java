import java.util.*;
public class Don_botas_y_sus_robots {
	public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         while(leer.hasNext()){
        	int t = leer.nextInt();
        	for (int xd = 0; xd < t; xd++) {
			   int n = leer.nextInt();
			   String cad= leer.next();
			   boolean q = true;
			   Lista P = new Lista();
			   if((n&1)==0){
				char C[]= cad.toCharArray();
				for (int i = 0; i < n&&q; i++) {
				  	if(C[i]==']' || C[i]=='}'){
				  		if(P.ini!=null){
				  			boolean p=P.eli(),r=C[i]==']';
				  			q=p&&r||!p&&!r;
				  		}else q=false; 
				  	}
				  	else
				  		P.add(C[i]=='[');
				}
			   }else q=false;
			   if(q && P.ini==null)System.out.println("V");else System.out.println("NV");
			}
         }
	}
	static class Nodo{
		boolean q;
		Nodo sig;
		public Nodo(boolean p){
			q=p;sig=null;
		}
	}
	static class Lista{
		Nodo ini;
		public Lista(){
			ini=null;
		}
		public void add(boolean p){
			if(ini==null){
				ini= new Nodo(p);ini.sig=null;
			}else{
				Nodo A = new Nodo(p);
				A.sig=ini;ini=A;
			} 
		}
		public boolean eli(){
			boolean q = ini.q;
			ini=ini.sig;
			return q;
		}
	}
}
/*
4 
6 
{[{}]} 
5 
[[{}] 
8 
[{}][]{} 
4 
{[}] 

*/
