import java.util.*;
public class _11661_Burger_Time {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			int n = leer.nextInt();
			if(n!=0){
				String cad = leer.next();
				int min=n+1;
				int a=0;
				for (int i = 0; i < n; i++) {
					if(cad.charAt(i)!='.'){
					if(cad.charAt(i)=='Z'){min=0;break;}
					if(cad.charAt(i)!=cad.charAt(a) && i-a<min&&cad.charAt(a)!='.'){min=i-a;i=a;}
					else a=i;
					}
				}
				System.out.println(min);
			}else break;
		}
	}
}
