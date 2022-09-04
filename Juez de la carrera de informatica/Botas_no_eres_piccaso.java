import java.util.*;
public class Botas_no_eres_piccaso {
public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   int M[]= new int [100001];
   while(leer.hasNext()){
	 int t = leer.nextInt();
	 for (int xd = 0; xd < t; xd++){
		 Lista C = new Lista();
		 int s = 0,c=0;
		for (int i = 0; i < 10; i++) {
			int f= leer.nextInt();
		    if(f>0){s=s+f;C.add(f);c++;}
		}
		double y=(double)s/(double)c;
		int x=(int)y,z=x,k=s%c;
		if(y!=x)z++;
		if(M[s]==0)M[s]=(int)Math.sqrt(s);
		s=M[s];
		Nodo A = C.ini;
		int p =0;
		while(A!=null){
			if(A.n>x){
			if(k>0){p+=A.n-z;k--;}
			else{p+=A.n-x;}}
			A=A.sig;
		}
		System.out.println(s+" "+p);
	}
   }
}
static class Nodo{
 int n;Nodo sig;
 public Nodo(int x){n=x;
	 sig=null;
 }
}
static class Lista{
	int n; Nodo ini;
	public Lista(){
	   ini=null;
	}
	public void add(int x){
		Nodo A = new Nodo(x);
			A.sig=ini;ini=A;
		/*while(A.sig!=null){
				if(A.n<A.sig.n){int aux = A.n;A.n=A.sig.n;A.sig.n=aux;A=A.sig;}
				else break;	
				
			}*/
	}
	
}
}


/*
20 
1 4 4 2 1 2 1 0 0 1
0 0 4 5 1 6 0 0 0 0
0 3 0 5 1 5 2 0 0 0
1 1 1 1 1 1 1 1 1 0
0 1 1 1 1 0 0 0 0 0
1 0 0 0 0 0 0 0 0 0
1 0 1 0 1 0 1 5 0 0
7 1 9 8 0 0 0 0 0 0
10000 10000 10000 10000 10000 10000 10000 10000 10000 10000
1 1 1 1 1 1 1 1 1 16
1 1 1 1 1 1 1 6 6 6
27 13 15 9 21 7 8 0 0 0
1 2 3 4 5 1 0 0 0 0
*/