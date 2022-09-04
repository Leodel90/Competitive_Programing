import java.util.*;
public class _10409_Die_Game {
	public static void main(String[] args) {
		Scanner leer =new Scanner(System.in);
		while(leer.hasNext()){
			int h= leer.nextInt();
			if(h!=0){
			int v[]= {1,2,3};int aux;
			for (int i = 0; i < h; i++){
			    String cad = leer.next();
			    if(cad.charAt(0)=='n'){
			    	aux=v[0];
			    	v[0]=7-v[1];
			    	v[1]=aux;
			    }
			    if(cad.charAt(0)=='s'){
			    	aux=v[0];
			    	v[0]=v[1];
			    	v[1]=7-aux;
			    }
			    if(cad.charAt(0)=='w'){
			    	aux=v[0];
			    	v[0]=7-v[2];
			    	v[2]=aux;
			    }
			    if(cad.charAt(0)=='e'){
			    	aux=v[0];
			    	v[0]=v[2];
			    	v[2]=7-aux;
			    }
			}
			System.out.println(v[0]);
			}else break;
		}
	}
}
