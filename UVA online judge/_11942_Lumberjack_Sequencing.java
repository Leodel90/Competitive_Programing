import java.util.*;
public class _11942_Lumberjack_Sequencing{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		System.out.println("Lumberjacks:");
		for (int i = 0; i < n; i++) {
			int a= leer.nextInt();
			int s=0;
			boolean q=true;
			for (int j = 0; j < 9&&q; j++){
				int c = leer.nextInt();
				if(c!=a){
					if(s==0){
					   if(a<c)s=1;
					   else s=-1;
					}
					else{
						if(s==1&&c<a || s==-1&&a<c){
							leer.nextLine();q=false;
						}
					}
				}
				a=c;
			}
			if(q)System.out.println("Ordered");
			else System.out.println("Unordered");
		}
	}
}
