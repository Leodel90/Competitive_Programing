import java.util.*;
public class Crafting_in_Minecraft {
	public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
	while(leer.hasNext()){
    	int n = leer.nextInt();
    	for (int xd = 0; xd < n; xd++) {
			int x = leer.nextInt();
			int y = leer.nextInt();
			int c=0;
			while(x>=3 && y>=2){
				x=x-3;y=y-2;
			c++;
			}
			x=x+y;
			System.out.println(c+" "+x);
		}
    	
    }
	}

}
