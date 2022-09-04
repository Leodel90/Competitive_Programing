import java.util.*;
public class Binario_Inverso {
	public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     while(leer.hasNext()){
    	int n = leer.nextInt();
    	String x ="0";
    	while(n!=0){int h=n%2;
    		x=x+h;
    		n=n/2;
    	}
    	System.out.println(Integer.parseInt(x,2));
      }
	}
}
