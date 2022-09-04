import java.util.*;
public class Marisol_la_exploradora_ {
static boolean Visitados[],Verifica[],b,a;
static Lista C [];
static int s,n;
public static void Recorre(int i){
	Visitados[i]= true;
	s++;
	Nodo A = C[i].ini;
	while(A!=null&&!Verifica[i]){
	Verifica[i]=Verifica[i]||Verifica[A.n];
	A=A.sig;
	}
	A= C[i].ini;
	while(A!=null&&b){
		if(!Visitados[A.n])Recorre(A.n);
		Verifica[i]=Verifica[i]||Verifica[A.n];	
		A=A.sig;
	}
	b=Verifica[i]&&s<n;
	
}
public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
         while(leer.hasNext()){
			 n = leer.nextInt();
			 int m = leer.nextInt();
			 if(n!=0 || m!=0){
			 C = new Lista[n+1];
        	 for (int i = 1; i <=n; i++) 
			    C[i]= new Lista();
        	 for (int i = 0; i < m; i++) {
				C[leer.nextInt()].add(leer.nextInt());
			 }
             Verifica= new boolean[n+1];
        	 Visitados= new boolean [n+1];
        	 Verifica[1]=true;
        	 b=true;s=0;
        	 if(m>=n)
        	 Recorre(1);
        	 a=true;
        	 for (int i = 1; i <=n&&a; i++) {
				a=Verifica[i];
			}
        	 if(a)System.out.println("SI");
        	 else System.out.println("NO");
         }else break;
        	 }
		}

static class Nodo{
	int n;
	Nodo sig;
	public Nodo (int x){
		n=x;sig=null;
	}
	
}
static class Lista {
	Nodo ini;
	public Lista(){
		ini=null; 
	}
	public void add(int x){
          Nodo A = new Nodo(x);
          A.sig=ini;
          ini=A;
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

6 7
3 5
3 1
1 2
2 4
4 6
6 3
5 3

6 7
3 5
3 1
1 2
2 4
4 6
6 1
5 3

6 7
3 5
3 2
4 1
1 4
4 6
6 1
5 3

6 7
3 1
3 2
2 5
5 4
4 6
6 3
1 3

6 10
3 5
4 5
2 5
1 5
5 3 
5 4
5 1
5 2
6 1
1 6

6 9
3 5
4 5
2 5
1 5
5 3 
5 4
5 1
5 2
6 1

6 9
3 5
4 5
2 5
1 5
5 3 
5 4
5 1
6 1
1 6

6 10
1 5
3 5
5 2
6 1
4 5
2 5
5 3 
5 4
5 1
1 6

5 8
2 5
3 5
4 5
1 5
5 3 
5 2
5 4
5 1

5 8
2 5
3 5
4 5
1 5
5 3 
5 2
5 4
5 1

1 0

0  0
*/

