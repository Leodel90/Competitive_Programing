import java.util.*;
public class _12195_Jingle_Composing {
	public static void main(String[] args) {
		Scanner leer=  new Scanner(System.in);
		while(true){
			String cad = leer.next();
			if(cad.charAt(0)!='*'){
				int c=0;
				double d=0;
				for (int i = 1; i < cad.length(); i++){
					if(cad.charAt(i)!='/'){
					if(cad.charAt(i)=='W')d+=1;
					if(cad.charAt(i)=='H')d+=0.5;
					if(cad.charAt(i)=='Q')d+=0.25;
					if(cad.charAt(i)=='E')d+=0.125;
					if(cad.charAt(i)=='S')d+=0.0625;
					if(cad.charAt(i)=='T')d+=0.03125;
					if(cad.charAt(i)=='X')d+=0.015625;
					}else{
						if(d==1)c++;
						d=0;
					}
				}
				System.out.println(c);
			}else break;
		}
	}
}
