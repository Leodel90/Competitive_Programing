import java.util.*;
public class Foquitos {
	static boolean Quemados[];
	static int n,q,res;
	static Lista F [];
    public static void Quemar(int i ){
    	Quemados[i]= true;res++;
    	Nodo A = F[i].ini;
    	while(A!=null){
    	    if(!Quemados[A.n])
    	        Quemar(A.n);
    	    A=A.sig;
    	}
    }     
	public static void main(String[] args) {
	   Scanner leer = new Scanner (System.in);
       while(leer.hasNext()){
    	   int t = leer.nextInt();
    	   for (int xd = 0; xd < t; xd++){
			n=leer.nextInt();
			q=leer.nextInt();
			Quemados= new boolean [n+1];
			F= new Lista[n+1];
		     for(int i =1;i <=n;i++)
			   F[i]= new Lista();
		     for (int i = 1; i <n; i++){
		    	 int x = leer.nextInt();
		    	 int y = leer.nextInt();
				F[y].add(x);
			 }res=0;
		     for (int i = 0; i < q; i++) 
		     {	int y = leer.nextInt();
		        if(!Quemados[y])	 
		           Quemar(y);
		     }
			System.out.println(res);
			
		}
       }
	}
static class Nodo {
	int n; Nodo sig;
	public Nodo(int x){
		n=x;
		sig=null;
	}
}
static class Lista{
	Nodo ini;
	public Lista (){
		ini= null;
	}
	public void add(int x){
		Nodo A = new Nodo(x);
		A.sig=ini;
		ini=A;
	}
}
}

/*
20

11 4
1 2
2 9
2 4
2 5
1 3
3 6
3 10
4 8
5 7
6 11
8 5 11 3

2 1
1 2
2

11 5
1 2
2 9
2 4
2 5
1 3
3 6
3 10
4 8
5 7
6 11
10 8 11 7 9

11 2
1 2
2 9
2 4
2 5
1 3
3 6
3 10
4 8
5 7
6 11
11 10
*/
