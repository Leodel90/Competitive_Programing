import java.util.*;
public class _11565_Simple_Equations2 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        for (int i = 0; i < n; i++){
			int A = leer.nextInt(),B= leer.nextInt(),C= leer.nextInt();
			int l = 21;boolean q=false;
			int x=-l,y=0,z=0;
			while(x<=l){
				y=-100;
				while(y<=100){
					z=A-y-x;
					if(x*y*z==B&&x*x+y*y+z*z==C&&x!=y&&y!=z&&z!=x){
						q=true;break;
					}
					y++;
				}if(q)break;
				x++;
			}
			TreeSet<Integer> K= new TreeSet<Integer>();
			K.add(x);K.add(y);K.add(z);
			if(q)System.out.println(K.pollFirst()+" "+K.pollFirst()+" "+K.pollFirst());
			else System.out.println("No solution.");
		}
	}
}
/*

15
1 360 205 
10 630 502 
1 3 11
1 2 3
1 15 35
3 1 3
*/