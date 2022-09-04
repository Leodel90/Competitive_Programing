import java.text.DecimalFormat;
import java.util.*;
public class Habilidad_Mental{
	static int n,p; 
	static double li,ls,mitad;
	static Color C[];
    public static double puntos(int u){
    	double min=100000;
    	for (int i = u+1; i < C[p].c; i++) {
    		if(C[p].x[u]>=li && C[p].x[u]<=ls){
    		if(C[p].x[i]>=li && C[p].x[i]<=ls){
    			 double dist=Distancia(C[p].x[u],C[p].x[i],C[p].y[u],C[p].y[i]);
    			 min = Math.min(Math.min(dist,min),puntos(i));
    		}
		}else u=i;
    	}
    	return min;
    }
    public static double puntos2(){
    	double min = 100000;
    	for (int j = 0; j < C[p].c; j++){
    		if(C[p].x[j]<=mitad && C[p].x[j]>=li){
    			double a=100000;
    		for (int i = 0; i < C[p].c; i++){
			if(C[p].x[i]>=mitad && C[p].x[i]<=ls && i!=j)
			  a = Math.min(Distancia(C[p].x[j],C[p].x[i],C[p].y[j],C[p].y[i]),a);	
    		}	
		    min=Math.min(a,min);
    	}
    }return min;
    }
    
    public static double Distancia(int x1,int x2,int y1, int y2){
        	return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
    }
	public static void main(String[] args){
	Scanner leer = new Scanner (System.in);
	while(leer.hasNext()){
		 n = leer.nextInt();
		 C = new Color [n];
		 int k=0;
		 for (int i = 0; i < n; i++) {
			int x = leer.nextInt();
			int y = leer.nextInt();
	        String cad = leer.next();
	        C[k]=new Color(cad,n-i);
	        C[k].setpunto(x, y);
	        int r=k;
	        while(r>0){
                int valor = cad.compareTo(C[r-1].color);
                 if(valor<0 || C[r-1].c==-1){Color aux=C[r]; C[r]=C[r-1];C[r-1]=aux; r--;}
                 else{if(valor==0){C[r-1].setpunto(x,y); C[r].c=-1;}break;}
	       }
	        
		 k++;
		 }
		 double minimo;
		 DecimalFormat P = new DecimalFormat("0.00");
		 for (int i = 0; i < n; i++) {
			 if(C[i].c>1){
			 p=i;mitad=C[i].max/2;
			 li=0;ls=mitad;
			 double ma = puntos(0);
			 li=mitad;ls=C[i].max;
	 	     double mb = puntos(0);
	 	     minimo = Math.min(ma, mb);
	 	     ls=mitad+minimo;li=mitad-minimo;
	 	     minimo=Math.min(minimo, puntos2());
	 	    System.out.println(C[i].color+" "+P.format(minimo));
			 }
		 }
	}
	}
	static class Color{
		public String color;
		public int c;
		public int limit;
		public int x[];
		public int y[];
		public int max;
		public Color(String cad, int n){
		color=cad;	
	    c=0;limit=n;
		x = new int[n];
		y = new int[n];
		max=-1;
		}
		public void setpunto(int a,int b){
			x[c]=a;
			y[c]=b;
			
			if(x[c]>max)max=x[c];
			c++;
		}
	}
	
}
/*
9
2 2 Verde
2 6 Rojo
4 1 Azul
4 4 Verde
6 2 Verde
6 6 Rojo
6 9 Rojo
8 4 Azul
8 6 Azul
*/
 