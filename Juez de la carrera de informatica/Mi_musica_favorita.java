import java.util.*;
public class Mi_musica_favorita {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			int tc = leer.nextInt();
			for (int u = 0; u < tc; u++) {
				int n = leer.nextInt();
				int t = leer.nextInt();
			    int c[]=new int [t];
                int res=0,k=0,l=0;
				for (int i = 0; i < t; i++) {
					c[i]=leer.nextInt();
				}
				int cad[]= new int [t],m[]=new int[t];
			    for (int i = (1<<t)-1; i>0; i--){
			    	int s=0;
			    	k=0;
			    	for (int j = 0; j < t; j++){
					int f=1<<j;
				    	if((i&f)==f){
				    	 m[k]=c[j];
				    	 s=s+c[j];k++;
				    	}
				    }
			    if(s>res && s<=n){
				    for (int j = 0; j < k ;j++) 
				    	cad[j]=m[j];
				    res=s; l=k;if(s==n)break;
				   }
				}
			    for (int i = 0; i < l; i++) {
			      if(i<l-1)System.out.print(cad[i]+" ");	
				  else System.out.println(cad[i]);
			    }
				
			}
		}
		

	}

}
/*
6
5 3 1 3 4
10 4 9 8 4 2
20 4 10 5 7 4
90 8 10 23 1 2 3 4 5 7
45 8 4 10 44 43 12 9 8 2 
150 20 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

*/
//en el juez hay mejores resultados en cuanto a memoria.. hicimos el mejor en tiempo!!