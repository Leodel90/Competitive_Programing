import java.util.*;
public class Lowest_Common_Ancestor {
	public static void Ancestro(int v, int w){
		if(v!=w){int x,y;
			if(v>w){x=v;y=w;}
			else {x=w;y=v;}
			if(x%2==1)x=(x-1)/2;
			else x=x/2;
			Ancestro(x,y);
		}else System.out.println(v);
	}
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		while(leer.hasNext()){
			int v = leer.nextInt();
			int w = leer.nextInt();
		     Ancestro(v,w);
		}
	}
}
