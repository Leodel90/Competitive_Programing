import java.util.*;
public class Ciencias_de_la_computacion {
   static int li,ls,e, V[],n;
	public static int Busqueda(){
		int s = (li+ls)/2;
	if(s>li){
		if(V[s]>=e){ls=s;
		}else{li=s;}
		return Busqueda();
	}return li;
	}
	public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    V= new int[40001];
    for (int i = 1; i < 40001; i++) 
	   V[i]=V[i-1]+i;
     while(leer.hasNext()){
    	 int t = leer.nextInt();
    	 for (int xd = 0; xd < t; xd++) {
			n=leer.nextInt();e=leer.nextInt();
			ls=n;
			li=1;
			if(V[n]<e)System.out.println(n);
			else {if(e==1)System.out.println(0);else System.out.println(Busqueda());}			
		}
     }
   }
}
/*

20
10 10
10 11
6 7
6 6
6 5
6 4
6 3
6 2
6 1
9 22
9 28
9 29
9 15
9 14
9 16
9 45
9 44
9 46
9 1000000000
40000 1000000000
*/
