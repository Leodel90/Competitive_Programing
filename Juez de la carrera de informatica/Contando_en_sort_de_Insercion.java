import java.util.*;
public class Contando_en_sort_de_Insercion {
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
     while(leer.hasNext()){
           String cad = leer.nextLine();
           StringTokenizer A = new StringTokenizer(cad);
           int v[]=new int [51];
           int i =0,c=0;
           while(A.hasMoreTokens()){
        	   v[i]=Integer.parseInt(A.nextToken());
        	   int r =i;while(r>0){
        		   if(v[r]<v[r-1]){int aux=v[r];v[r]=v[r-1];v[r-1]=aux;r--;c++;}
        		   else break;
        	   }i++;
           }System.out.println(c);
     }
	}
}
/*
20 40 30 10
-1 1 0
-1000 0 1000
*/
 