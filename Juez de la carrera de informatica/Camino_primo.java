import java.util.*;
public class Camino_primo {
	static int comp[][],primos[],p[];
	static Lista P[], pri;
	static Scanner leer = new Scanner(System.in);
	public static void Criba(){
		for (int i = 2; i < 10000; i++){
			if(primos[i]==0){
				if(i>=1000){
				primos[i]=pri.n;
				pri.add(i);}
				for (int j = i+i; j <10000; j=j+i) 
					primos[j]=1;
			}
		}
		p=new int[pri.n];
		for (int i = 0; i < pri.n; i++) {
			p[i]=pri.ini.n;
			pri.ini.n=i;pri.recorrer();
		}
		P=new Lista[pri.n];		
		for (int i = 0; i < pri.n; i++){
			P[i]=new Lista();
			for (int j = 0; j < pri.n; j++) 
			{   int y = pri.ini.n;
			if(comp[i][y]==0){
				 int z=p[i], x=p[y],k=1;
				while(z>0&&x>0&&k<3){
					if(z%10!=x%10)k++;
					z=z/10;x=x/10;
				}comp[i][y]=k;comp[y][i]=k;
			}
			 if(comp[i][y]==2)
				 P[i].add(y);
			 
			pri.recorrer();
			}
		}
	}
	public static void main(String[] args){
    primos= new int[10000];
    pri= new Lista();
    comp= new int[1061][1061];
    Criba();
    while(leer.hasNext()){
    int t = leer.nextInt();
    for (int xd = 0; xd < t; xd++){
		int a=leer.nextInt();
		int b=leer.nextInt();
		a=primos[a];
		b=primos[b];
	    boolean Visitados[]=new boolean[1061];
        pri = new Lista();
        pri.add(a);int c=-1;
        boolean v=true;
     	Visitados[a]=true;
        while(pri.n>0&&v){
        	c++;
        	Lista N = new Lista();
        	while(pri.ini!=null){
        	a = pri.eliminar();
          	if(a!=b){
        	  for (int i = 0; i < P[a].n; i++) {
				if(!Visitados[P[a].ini.n]){N.add(P[a].ini.n);Visitados[P[a].ini.n]=true;}
        	  P[a].recorrer();
        	  }
        	  }else{v=false;break;}
        	}pri=N;
        }
		if(v)System.out.println("Imposible");
		else System.out.println(c);
    }
    }
	}
static class Nodo{
	int n;
	Nodo sig;

	public Nodo(int x){
		n=x;
		sig=null;
	}
}
static class Lista{
	 Nodo ini,fin;
	 int n;
	public Lista(){
		ini=null;
		fin=null;n=0;
	}
	public void add(int x){
		if(ini==null){
			ini= new Nodo(x);
			ini.sig=ini;
			fin=ini;
		}
		else{
			Nodo A = new Nodo(x);
			A.sig=ini;
			fin.sig=A;
			fin=A;
		}
		n++;
	}
	public void recorrer(){
		Nodo A = new Nodo(ini.n);
		if(n>1){
		ini=ini.sig;
		A.sig=ini;
		fin.sig=A;fin=A;}
		
	}
	public int eliminar(){
		int x = ini.n;
		if(n>1){ini=ini.sig;fin.sig=ini;
		}else{ini=null;fin=null;}n--;
		return x;
	} 
}
}
/*
3
1033 8179
1373 8017
1033 1033

*/
