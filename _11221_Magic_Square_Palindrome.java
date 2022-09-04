import java.util.*;
public class _11221_Magic_Square_Palindrome {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		leer.nextLine();
		for (int i = 1; i <=t; i++){
			String cad = leer.nextLine(),y="";
			double c;
			for (int j = 0; j <cad.length(); j++) {
				if(cad.charAt(j)>=65&&cad.charAt(j)<=91||cad.charAt(j)>=97&&cad.charAt(j)<=123)y=y+cad.charAt(j);
			}
            c = Math.sqrt(y.length());
            System.out.println("Case #"+i+":");
            if(c==(int)c){
            	boolean q=true;
            	for (int j = 0; j < y.length()&&q; j++) 
					q=y.charAt(j)==y.charAt(y.length()-j-1);
				if(q)System.out.println((int)c);else System.out.println("No magic :(");
            }else System.out.println("No magic :(");
		}
	}
}
