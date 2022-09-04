import java.util.*; 
public class SeleccionNatural {
//Concurso 143
static Scanner leer = new Scanner(System.in);	
public static void main(String[] args) {
while(leer.hasNext()){
	int n = leer.nextInt();
	float p = leer.nextFloat();
	if(p!=0 || n!=0){
		float e []= new float [n];
		for (int i = 0; i < n; i++) {
		 e[i]=leer.nextFloat();
		 int a = i;
		while(a>0){
		if(e[a]>e[a-1]){float aux = e[a];e[a]=e[a-1];e[a-1]=aux;a--;}else break;	
		}
		}
		float x=0;
		int i=0;
		while(i<n){
			x=x+e[i];
			i++;
			if(x<p*i)
		    {i--;break;}
		}
	    System.out.println(i);
	}else break;
}		
//-------------------------
	}

}
