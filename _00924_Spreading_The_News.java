import java.util.*;
public class _00924_Spreading_The_News {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int e = leer.nextInt();
		Lista A[]= new Lista[e];
		for (int i = 0; i < e; i++) {
			A[i]= new Lista();
		}
		for (int i = 0; i < e; i++){
		    int n = leer.nextInt();
		    for (int j = 0; j < n; j++)
		    	A[i].add(leer.nextInt());
		}
		int t = leer.nextInt();
		for (int i = 0; i < t; i++){
			int g = leer.nextInt();
			int d = 0,cd=0;
			int m=0,k;
			LinkedList<Integer> E = new LinkedList<Integer>();
			E.add(g);
			boolean V []= new boolean[e];
			V[g]=true;
			while(!E.isEmpty()){k=0;cd++;
			int l = E.size();
			for (int j = 0; j < l; j++) {
				int c = E.remove();
				Nodo aux=A[c].ini;
			    while(aux!=null){
			    	if(!V[aux.n]){
			    		E.add(aux.n);V[aux.n]=true;k++;
			    	}
			    	aux=aux.sig;
			    }
			}
			if(k>m){m=k;d=cd;}
			
		}
			if(m>0)System.out.println(m+" "+d);
			else System.out.println(0);
		}
	}
	public static class Nodo{
		int n;
		Nodo sig;
		public Nodo(int x){
			n=x;sig=null;
		}
	}
	public static class Lista{
		Nodo ini;
		public Lista(){
			ini=null;
		}
		public void add(int x){
			Nodo aux = new Nodo(x);
			 aux.sig=ini;
			 ini=aux;
		}
	}
}

