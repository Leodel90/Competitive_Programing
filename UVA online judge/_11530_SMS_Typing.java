import java.util.*;
public class _11530_SMS_Typing {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		leer.nextLine();
		int T[]= new int [26];
		for (int i = 0,c=1; i < 26; i++) {
		    T[i]=c;
		    c++;
		    if(c>=4&&i!='r'-97)c=1;
		}
		T['z'-97]=4;
		for (int i = 1; i <=t; i++) {
		String cad = leer.nextLine();
		int c = 0;
		for (int j = 0; j < cad.length(); j++) {
		if(cad.charAt(j)!=' ')c+=T[cad.charAt(j)-97];
		else c++;
		}
		System.out.println("Case #"+i+": "+c);
		}
	}

}
