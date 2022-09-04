import java.util.*;
public class _12207_That_is_Your_Queue {
	static long p,c;
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int g=1;
        while(true){
        	p = leer.nextLong();
        	c = leer.nextInt();
        	if(c+p==0)break;
        	Lista Q = new Lista();
        	long h =Math.min(c,p);
        	for (int i = 1; i <=h; i++)Q.add((long)i);
        	System.out.println("Case "+g+":");g++;
        	for (int i = 0; i < c; i++){
				String C = leer.next();
				if(C.charAt(0)=='E')Q.E(leer.nextLong());
				else System.out.println(Q.del());
			}
        }
	}
	public static class Nodo{
		 long p;
		 Nodo sig;
		public Nodo(long x){
			p=x;sig=null;
		}
	}
	public static class Lista{
		static Nodo ini, fin;
		public Lista (){
			ini = null; fin = null;
		}
		public static void E(long x){
			Nodo aux = ini,ant=null;
			while(aux!=null){
				if(aux.p==x)break;
				ant=aux;aux=aux.sig;
			}
			if(aux!=null){
				if(ant!=null){ant.sig=aux.sig;
				if(ant.sig==null)fin=ant;
				}else return;
			}
			aux = new Nodo(x);
			aux.sig=ini;ini=aux;
		}
		public static void add(long x){
			Nodo aux = new Nodo(x);
			if(fin==null)ini=aux;
			else fin.sig=aux;
			fin=aux;
		}
		public static long del(){
		  long r=ini.p;
		  ini=ini.sig;
		  Nodo aux = new Nodo(r);
		  if(p<=c){fin.sig=aux;fin=aux;}
		  return r;
		}
	}
}
/*
3 6
N
N
E 1
N
N
N
10 2
N
N
0 0

100 15
E 99
E 98
E 97
N
E 96
E 97
E 94
N
N
N
N
N
N
N
E 96

100 15
E 9999999
E 98 
E 97
N
E 96
E 97
E 94
N
N
N
E 96
N
N
N
N



*/