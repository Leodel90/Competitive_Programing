import java.util.*;
public class _10928_My_Dear_Neighbours {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        for (int xd = 0; xd < n; xd++){
			int p = leer.nextInt();
			leer.nextLine();
			LinkedList<Integer> P= new LinkedList<Integer>();
			int min=p;
			for (int i = 1; i <=p; i++) {
				String N= leer.nextLine()+" ";
				int c =0;
				for (int j = 0; j < N.length(); j++){
					char x = N.charAt(j);
					if(x==' ')c++;
				}
				if(c<=min){
					if(c<min)P= new LinkedList<Integer>();
					P.add(i);min=c;
				}
			}
			System.out.print(P.remove());
			while(!P.isEmpty())System.out.print(" "+P.remove());
			System.out.println();
		}
	}
}
