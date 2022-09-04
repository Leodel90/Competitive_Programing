import java.util.*;
public class Botas_no_eres_picasso {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(true){
			int t = leer.nextInt();
			for (int xd = 0; xd < t; xd++) {
			int c=0;
			LinkedList<Integer> C = new LinkedList<Integer>();
			double s=0;
			double h=0;
			for (int i = 1; i <=10; i++) {
				c= leer.nextInt();
				s=s+c;
				if(c>0){h++;C.add(c);}
			}
			int n = (int)Math.sqrt(s);
			double min=s/h;
			int max=(int)min;
			if(min>max)max++;
			min=(int)min;
			int x=0;
			int y=0;
			while(!C.isEmpty()){
				int m = C.remove();
				if(m>=max)
					x+=m-max;
			    if(m<=min)
			    	y+=min-m;
			}
			System.out.println(Math.max(x, y));
			}
		}

	}
}
