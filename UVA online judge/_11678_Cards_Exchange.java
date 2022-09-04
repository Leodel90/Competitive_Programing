import java.util.*;
public class _11678_Cards_Exchange {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			int a = leer.nextInt(), b= leer.nextInt();
			if(a>0||b>0){
				boolean A[]= new boolean[100001];
				boolean B[]= new boolean[100001];
				LinkedList<Integer>CA= new LinkedList<Integer>();
				LinkedList<Integer>CB= new LinkedList<Integer>();
				for (int i = 0; i < a; i++){
					int x = leer.nextInt();
					if(!A[x]){A[x]=true;CA.add(x);}					
				}
				for (int i = 0; i < b; i++){
					int x = leer.nextInt();
					if(!B[x]){B[x]=true;CB.add(x);}
				}
				int ma=0,mb=0;
				while(!CA.isEmpty()){
					if(!B[CA.remove()])mb++;
				}
				while(!CB.isEmpty()){
					if(!A[CB.remove()])ma++;
				}
				System.out.println(Math.min(mb, ma));
			}else break;
		}
	}
}

