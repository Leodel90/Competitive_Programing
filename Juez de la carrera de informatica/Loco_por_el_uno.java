import java.util.*;
public class Loco_por_el_uno {
	static int V[]= new int[1001],n;
	public static int Minimo(int i){
 	   if(i!=1){
		if(V[i]==0){V[i]=1;
		int y =i%3;
		int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE,c=Integer.MAX_VALUE;
 		  if(y==0)a=Minimo(i/3);
 		 if((i&1)==0)c=Minimo(i/2);
 		  b=Minimo(i-1);
 		  return V[i]+=Math.min(a, Math.min(b, c));
 		  
 	   }
	}
 	   return V[i];
	}
	public static void main(String[] args) {
    Scanner leer = new Scanner (System.in);
    while(leer.hasNext()){
    	int t = leer.nextInt();
    	for (int xd = 0; xd < t; xd++) {
			n = leer.nextInt();
			System.out.println(Minimo(n));
		}
    }
	}
}
/*
20
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20

*/