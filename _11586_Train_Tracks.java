import java.util.*;
public class _11586_Train_Tracks {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		leer.nextLine();
		for (int i = 0; i < n; i++){
			StringTokenizer cad = new StringTokenizer(leer.nextLine());
			int m=0,f=0;
			while(cad.hasMoreTokens()){
			    String c= cad.nextToken();
			    if(c.charAt(0)=='M')m++;
			    else f++;
			    if(c.charAt(1)=='M')m++;
			    else f++;
			}
			if(m==f&& m!=1)System.out.println("LOOP");
			else System.out.println("NO LOOP");
		}
	}
}
