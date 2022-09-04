import java.util.*;
public class Mercado_Magico {
static int ls,P[],F[][],li;
static boolean V[];	
public static int Suma(int x){
		if(F[li][x]==0){
	    F[li][x]+=F[x][x]+Suma (x-1);}
	    return F[li][x];
}
public static void main(String[] args){
Scanner leer  = new Scanner(System.in);
while(leer.hasNext()){
	int t = leer.nextInt();
	for (int xd = 0; xd < t; xd++) {
		int n = leer.nextInt();
		int nroa=leer.nextInt();
		P= new int [n+1];
        F= new int [n+1][n+1];
        V = new boolean[n+1];
        for (int i = 1; i <=n; i++){
        	F[i][i]=leer.nextInt();
        }
        for (int i = 0; i < nroa; i++){
			String cad = leer.next();
			int li = leer.nextInt();
			int ls = leer.nextInt();
			if(cad.equals("P")){
			 
			}else{
				F[li][li]=ls;V[li]=true;
			}
		}
	}
}
}
}

/*
1 
4 9 
37 14 23 78 
P 2 2 
A 2 74 
A 1 75 
A 2 52 
P 2 3 
P 1 2 
P 2 2 
A 4 67
A 3 32
 */
