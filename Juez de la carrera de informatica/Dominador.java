import java.util.*;
public class Dominador {
static int n;
static Lista M [];
static boolean Re1[];
static boolean Re2[];
static boolean Res[][];
public static void Verifica(int x){
	//System.out.println("Actual:_ "+x);
	//System.out.print("Lo dominan: ");
for(int i = 0; i < n; i++){
	   Res[i][x]=(Res[i][x]||!Re2[x])&&Re1[i];
	   //if(Res[i][x])System.out.print(i+" ");

}
//System.out.println();
Re2[x]=true;
	for(int i = 0; i < M[x].n; i++) {
		int a = M[x].Recorrer();
		if(!Re1[a]){
		Re1[a]=true;	
			Verifica(a);
		Re1[a]=false;
		}
	}
}
public static void main(String[] args) {
Scanner leer = new Scanner (System.in);
while(leer.hasNext()){
	int t = leer.nextInt();
	for (int xd = 1; xd <=t; xd++) {
		n = leer.nextInt();
		M = new Lista [n];
		for (int i = 0; i < n; i++) {
			M[i]= new Lista();
			for (int j = 0; j < n; j++) {
				if(leer.nextInt()==1)
				M[i].add(j);
			}
			}
		
		Re1= new boolean[n];
		Re2= new boolean [n];
		Res= new boolean [n][n];
	    Re1[0]=true;
	    Verifica(0);
	    System.out.println("Case "+xd+":");
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j < n; j++) {
				if(Res[i][j])System.out.print("|Y");
				else System.out.print("|N");
		    }System.out.println("|");
	    }
	}
  }
}
static class Lista {
	Nodo ini;
	Nodo fin;
	int n;
	public Lista (){
		ini = null;
		fin = null;
		n=0;
	}
	public boolean esVacio(){
		if(n==0)return true;
		return false;
	}
	public void add (int x){
		if(esVacio()){
			ini = new Nodo(x);
			fin=ini;
		}else{
			Nodo A = new Nodo(x);
		   
		    fin.sig=A;
		    fin=A;
		}
	   n++;
	}
	public int Recorrer(){
		int x=ini.n;
		if(n==1)
			return x;
		ini=ini.sig;
		Nodo A = new Nodo (x);
		fin.sig=A;
		fin=A;
		return x; 
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
}
/*
5

5
0 1 1 0 0
0 0 0 1 0
0 0 0 1 0
0 0 0 0 1
0 0 0 0 0

1
1

4
0 1 0 0
0 0 1 0
0 0 0 1
1 0 0 0

5
0 1 0 0 0
0 0 1 0 0
1 0 0 1 1
1 0 0 0 1
1 0 0 1 0

5
0 1 0 0 0
0 0 1 0 0
1 0 0 0 0
1 0 0 0 1
1 0 0 1 0

*/
 