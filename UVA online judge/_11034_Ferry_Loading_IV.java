import java.util.*;
public class _11034_Ferry_Loading_IV {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int c = leer.nextInt();
		for (int xd = 0; xd < c; xd++){
			int l = leer.nextInt()*100;
			int m = leer.nextInt();
			LinkedList<Integer> L= new LinkedList<Integer>();
			LinkedList<Integer> R= new LinkedList<Integer>();
			for (int i = 0; i < m; i++){
				int h = leer.nextInt();
				if(leer.next().charAt(0)=='l')L.add(h);else R.add(h);
			}
			boolean a = L.isEmpty(),b=R.isEmpty();
			int C=0;
			boolean q=true;
			while(!L.isEmpty()||!R.isEmpty()){int d =l;
					if(q){
						while(true){
							if(!L.isEmpty()&&d>=L.getFirst())d-=L.remove();
							else break;
						}
					}else{
						while(true){
							if(!R.isEmpty()&&d>=R.getFirst())d-=R.remove();
							else break;
						}
					}
				C++;q=!q;
			}System.out.println(C);
		}
	}
}
/*
4
20 4
380 left
720 left
1340 right
1040 left
15 4
380 left
720 left
1340 right
1040 left
15 4
380 left
720 left
1340 left
1040 left
15 4
380 right
720 right
1340 right
1040 right

*/
