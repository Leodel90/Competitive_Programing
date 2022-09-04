import java.util.*;
public class _10646_What_is_the_Card {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		for (int xd = 1; xd <=n; xd++){
			String P[]= new String [53];
			for (int i = 1; i <=52; i++){P[i] = leer.next();
			}
			int y=0;int p=27,c=0;
			for (int i = 0,k; i < 3; i++){
				if(P[p].charAt(0)<=57)k=P[p].charAt(0)-48;
				else k=10;
				y+=k;
				c+=1+10-k;
				p=p-(10-k)-1;
			}
			if(y>p)System.out.println("Case "+xd+": "+P[y+c]);
			else System.out.println("Case "+xd+": "+P[y]);
		}
	}
}
