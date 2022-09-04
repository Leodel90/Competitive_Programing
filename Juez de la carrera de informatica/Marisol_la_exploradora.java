import java.util.*;
public class Marisol_la_exploradora {
static int n,m,c,ori;
static boolean Ciudad[],Recorrido[],q,Volviendo[];
static Lista C[];
public static boolean Verifica(int x){
	boolean p=false;
	Recorrido[x]=true;
	if(c<n){
		if(C[x]!=null){
	    	for (int i = C[x].t; i < C[x].n && q; i++){
				int a = C[x].Set();
				if(!Ciudad[a]){c++;Ciudad[a]=true;
				}
				if(!Recorrido[a] || c==n)p=Verifica(a);
	    	}
			}else q=false;
    }else{
    	if(x!=ori){
    		Volviendo[x]=true;
    		if(C[x]!=null){
    		for (int i = 0; i < C[x].n && q; i++) {
    		    int h =C[x].Set();
    			if (!Volviendo[h])
    		    p=Verifica(h);
    		}}else q=false;
    		Volviendo[x]=false;
    	}
    	else {p=true;q=false;}
    }
	Recorrido[x]=false;
	return p;
}
	public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
         while(leer.hasNext()){             
        	 n = leer.nextInt();
        	 m = leer.nextInt();
        	 if(n!=0 || m!=0){
             C= new Lista[n+1];
        	 for (int i = 0; i < m; i++) {
        		 int x = leer.nextInt();
        		 if(C[x]==null)C[x]=new Lista();
				C[x].Add(leer.nextInt()); 
        	 }c=0;ori=1;
        	 Recorrido=new boolean[n+1];
        	 Ciudad= new boolean[n+1];
        	 Volviendo= new boolean[n+1];
        	 q=true;
        	 if(Verifica(1) || n==1)System.out.println("SI");
        	 else System.out.println("NO");
        	}
	}
}
	static class Nodo{
		public int v;
        public Nodo sig;
        public Nodo(int d,Nodo x){
        	v=d;sig=x;
        }
	}
	static class Lista{
		public Nodo raiz=null;
		public Nodo ulti=null;
		public int n=0,t=0;
		
		public boolean esVacio(){
			if(n==0)return true;
			else return false;
		}
	    public void Add(int y){
	    	Nodo A = new Nodo(y, null);
	        if(esVacio()){
	        	raiz=A;ulti=A;
	        }else {ulti.sig=A;ulti=A;}
	        n++;
	    }
	    public int Set(){
	    	if(esVacio())return -1;
	    	int x=raiz.v;
	    	Nodo aux = new Nodo(x, null);
	    	ulti.sig=aux;
	    	ulti=aux;
	    	raiz=raiz.sig;
	    	t=(t+1)%n;
	    	return x;
	    }
	}
}

/* 
3  1
1  2

3  3
1  2
2  3
3  1

2  1
1  2

5 8
1 2
2 1
3 1
1 3
4 1
1 4
4 2
2 3

5 8
1 2
2 1
1 3
3 1
1 4
4 1
1 5
5 1

5 8
1 2
4 1
3 1
1 5
2 1
1 4
1 3
5 1

5 8
1 2
4 1
3 1
1 5
2 1
1 4
1 3
5 3

5 8
1 2
4 1
3 1
1 5
2 1
1 4
1 3
4 2

4 4
1 2
2 3
3 4
4 2

4 4
1 2
2 3
3 4
4 1

5 6
1 2
2 1
2 3
3 4
4 5
5 2

5 6
1 2
2 1
2 3
3 4
4 5
5 3
0  0
*/
