import java.util.*;
public class _10530_Guessing_Game {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int max=11,min=0;
		while(leer.hasNext()){
			int n = leer.nextInt();
			if(n!=0){
				String cad = leer.next();
				if(cad.charAt(0)=='t'){
					cad= leer.next();
					if(cad.charAt(0)=='h'){
						if(n<max)max=n;
					}else{
						if(n>min)min=n;
					}
				}else{leer.next();
					if(n>min&&n<max)System.out.println("Stan may be honest");
					else System.out.println("Stan is dishonest");
					max=11;min=0;
				}
			}else break;
		}
	}
}
