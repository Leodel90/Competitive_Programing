import java.util.*;
public class _00591_Box_of_Bricks {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t=1;
        while(true){
        	int n= leer.nextInt();
        	if(n!=0){LinkedList<Integer> L= new LinkedList<Integer>();
        	    int s =0;
        		for (int i = 0; i < n; i++){
					int h=leer.nextInt();
					s+=h;
					L.add(h);
				}s=s/n;
				int c =0;
        		while(!L.isEmpty()){
        			int h=L.remove();
        			if(h>s)c+=h-s;
        		}
        		System.out.println("Set #"+t);
        		System.out.println("The minimum number of moves is "+c+".");
        		System.out.println();
        		t++;
        	}else break;
        }
	}
}
