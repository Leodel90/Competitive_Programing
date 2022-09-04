import java.util.*;
public class Marisol_la_exploradora_2 {
static int n,m,M[][],c,ori;
static boolean Recorrido[],Ciudad[],p,q,Volviendo[];
public static void caminos(int i){
if(c<n){Recorrido[i]=true;
	if(M[i][0]>0){
	for (int j = 1; j <=M[i][0] && q; j++) {
		if(!Ciudad[M[i][j]]){c++;Ciudad[M[i][j]]=true;}
		if(!Recorrido[M[i][j]] || c==n)caminos(M[i][j]);
	}
	}else q=false;
	Recorrido[i]=false;
}else{
	if(i!=ori){
		Volviendo[i]=true;
		if(M[i][0]>0){	
		for (int j = 1; j <=M[i][0] && q; j++) {
			if(!Volviendo[M[i][j]])caminos(M[i][j]);
		}
		}else q=false;
		Volviendo[i]=false;
	}else{p=true;q=false;}
	
}

}
public static void main(String[] args){
   Scanner leer = new Scanner (System.in);
   while(leer.hasNext()){
	    n = leer.nextInt();
	    m = leer.nextInt();
	    if(n!=0 || m!=0){
        M=new int [n+1][n+1];
        for (int i = 0; i < m; i++) {
			int x = leer.nextInt();
			int y = leer.nextInt();
			M[x][0]++;
			M[x][M[x][0]]=y;
		}c=0;ori=1;p=false;q=true;
		Recorrido= new boolean[n+1];
		Ciudad= new boolean[n+1];
		Volviendo= new boolean[n+1];
		caminos(1);
		if(p || n==1)System.out.println("SI");
		else System.out.println("NO");
	    }
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
0  0
*/
