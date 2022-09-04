import java.util.*;
public class Estacion_de_tren {
static int a,c,p;
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		try{
		while(true){
			int n = leer.nextInt();
			Lista A = new Lista();
			for (int i = 1; i <= n; i++) {
				p=i;a=leer.nextInt();c= leer.nextInt();
				A.add();
			}
			Nodo aux = A.ini;
			String res = "";
			while(aux.sig!=null){
				res=" "+aux.p+res;
				aux=aux.sig;
			}res=aux.p+res;
			System.out.println(res);
		}}catch (Exception e){}

	}
static class Nodo{
	int p,a;
	Nodo sig;
	public Nodo(int x,int v){
		p=x;
		a=v;
		sig=null;
		
	}
}
	static class Lista{
		Nodo ini;
		public Lista(){
			ini= null;
		}
		public void add(){
		    if(ini!=null){
		    	Nodo aux= new Nodo(p,a);
				aux.sig=ini;
				ini=aux;
				aux=ini;
				Nodo ant = null;
				while(c>0 && aux.sig!=null){
					Nodo o = aux.sig;
					if(aux.a>o.a){
	                    aux.sig=o.sig;
	                    o.sig=aux;
	                    if(ant!=null)
	                    	ant.sig=o;
	                    else ini=o;
	                    ant=o;
						c--;
					}else return;
				}
			}else 
				ini=new Nodo(p,a);
		        
		}
	}
}

/*
2
1 0
2 1
3
1 3
2 3
3 3
5
2 3
1 4
4 3
3 1
5 2 
 
10
1 1
2 2
3 3
4 4
5 5
6 6
7 7
8 8
9 9
10 10
 */
 
