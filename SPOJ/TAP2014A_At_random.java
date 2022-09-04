import java.util.*;
public class TAP2014A_At_random {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int xd = 0; xd < t; xd++) {
			int n = leer.nextInt();
			int x= leer.nextInt();
			String y= leer.next();
			boolean q= true;
			for (int i = 1; i<n; i++) {
				int a = leer.nextInt();
				String b = leer.next();
				q=q&&a!=x&&!b.equals(y);
			    x=a;
			    y=b;
			}
			if(q)System.out.println("B");else System.out.println("M");
		}
	}
	}
