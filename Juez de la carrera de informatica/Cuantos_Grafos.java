import java.util.*;
public class Cuantos_Grafos{
static int min,max,sumas[][],li,ls;
static boolean p[],grafo[][];

public static void primos(){
	int g=2; 
	while(g<2000){
		if(!p[g]){
			for (int j = g+g; j < 2000; j=j+g){
				p[j]= true;
			}
		}g++;
	}
}

static boolean r[];
public static void recorre(int i){
	r[i]=true;	
	for (int j = i+1; j <=ls; j++) {
       if(grafo[i][j] && !r[i]){
    	   r[i]=true;
    	   recorre(j);
       }
	}
}

public static void main(String[] args){
Scanner leer = new Scanner (System.in);
p = new boolean[2000];
p[0]=true;p[1]=true;
primos();
sumas= new int [2000][2000];
grafo= new boolean [2000][2000];
min=Integer.MAX_VALUE;
max=Integer.MIN_VALUE;
while(true){
  li=leer.nextInt();
  ls=leer.nextInt();
   if(li!=0 || ls!=0){
	   int n = max-min+1;
	   int v []= new int [max+1];
	   r= new boolean [ls+1];
	   
   }else break;
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
	Nodo ini;
	Nodo fin;
	int nro;
	public Lista(){
	 ini = null;
	 fin=null;
	 nro=0;
	}
	public void add(int x){
         if(nro==0){ini= new Nodo(x); fin=ini;}
         else{Nodo A = new Nodo(x);
         fin.sig=A;fin=A;
         }
         nro++;
	}
	public int recorrer(){
		int x = ini.n;
		Nodo A = new Nodo(x);
		fin.sig=A;
		fin=A;
		ini=ini.sig;
		return x;
	}
}

}
/*
14 19
10 19
1 19
0 0
*/