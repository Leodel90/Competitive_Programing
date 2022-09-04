import java.util.*;
public class All_reality_show {
	static long a,b,s;
	public static void Recursivo(){
		if((a&1)==1)a++;
		if((b&1)==1)b++;
		if(b!=a){
			s++;b=b/2;a=a/2;Recursivo();}
	    
		
	}
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(leer.hasNext()){
            long r = leer.nextLong();
        	a = leer.nextLong();
        	b = leer.nextLong();
        	if(a>b){
        	s=b;b=a;a=s;	
        	}
        	s=1;
        	Recursivo();
        	System.out.println(s);
        }
	}

}
