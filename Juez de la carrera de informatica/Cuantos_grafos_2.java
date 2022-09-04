import java.util.*;
public class Cuantos_grafos_2 {
static int min,max,grafo[][];
static boolean p[],visitados[];
public static void primos(){
	for (int i = 2; i <2001; i++) {
		if(!p[i]){
			for (int j = i+i; j <2001; j+=i) 
				p[j]=true;
		}
	}
}

public static void recorrer(int i){
	visitados[i]=true;
	for (int j = min; j<=max; j++){
         if(grafo[i][j]==0 ){
			if(!p[i+j]){grafo[i][j]=1;grafo[j][i]=1;}else {grafo[i][j]=-1;grafo[j][i]=-1;}
		}
		if(grafo[i][j]==1 && !visitados[j])recorrer(j);
	}
}

	public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    p= new boolean [2001];
    p[0]=true;
    p[1]=true;
	primos();
	grafo = new int [2001][2001];
	while(true){
		min= leer.nextInt();
		max= leer.nextInt();
		if(max!=0||min!=0){
	    	visitados = new boolean [max+1];
	        int n=0,i=min;
	    	while(i<=max){
	        	if(!visitados[i]){
	        		recorrer(i);
	        	    n++;	
	        	}
	        	i++;
	        }System.out.println(n);
		}else break;
	}
	}
}

/*
14 19
10 19
1 19
0 0
*/