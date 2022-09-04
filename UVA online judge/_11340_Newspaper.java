import java.util.*;
public class _11340_Newspaper {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		for (int xd = 0; xd < n; xd++) {
			int k= leer.nextInt();
			int V[]= new int[256];
			leer.nextLine();
			for (int i = 0; i < k; i++) {
				String C= leer.nextLine();
				int x=C.charAt(0);
				for (int j = 2; j < C.length(); j++) 
					V[x]=V[x]*10+C.charAt(j)-48;
			}
			int m = leer.nextInt();
			leer.nextLine();
			long p=0;
			for (int i = 0; i < m; i++){
				String C= leer.nextLine();
				for (int j = 0; j < C.length(); j++)
					p+=V[C.charAt(j)];
			}
			String r=p/100+".";
			p=p%100;
			if(p<10)r=r+'0';
			r=r+p+'$';
			System.out.println(r);
		}
	}
}
/*
1
7
a 3
W 10
A 100
, 10
k 7
. 3
I 13
7
ACM International Collegiate Programming Contest (abbreviated
as ACM-ICPC or just ICPC) is an annual multi-tiered competition
among the universities of the world. The ICPC challenges students
to set ever higher standards of excellence for themselves
through competition that rewards team work, problem analysis,
and rapid software development.
From Wikipedia.

*/