import java.util.*;
public class FrankyStein {
//Concurso 143
	static Scanner leer = new Scanner (System.in);
	public static void main(String[] args){
    while(true){
    	int n = leer.nextInt();
    	int g = leer.nextInt();
    	if(n!=0 || g!=0){
    		int z=0,h=0;
    		for (int i = 0; i < n; i++) {
				int a = leer.nextInt();
				if(g>a)z++;else h++;
    		}
    			if(z>h)System.out.println("Zombie");
    			else System.out.println("Humano");
    	}else break;
    	
    }
    
/*
 5 50
 37
 56
 50
 60
 12
 1 79
 32
 */    
    
    }

}
