import java.util.*;
public class _00482_Permutation_Arrays {
    public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);int t=leer.nextInt();
		leer.nextLine();
		leer.nextLine();
		for (int xd = 0; xd < t; xd++){
		String cad = leer.nextLine()+" ";
		LinkedList<Integer> L= new LinkedList<Integer>();
		int r=0,n=0;
		for (int i = 0; i < cad.length(); i++){
			if(cad.charAt(i)==' '){
				if(r!=0){
				L.add(r);r=0;n++;	
				}
			}else r=r*10+cad.charAt(i)-48;
		}
		String F[]= new String[n];
		for (int i = 0; i < n; i++) {F[L.remove()-1]=leer.next();}
		if(xd>0)System.out.println();
		for (int i = 0; i < n; i++) System.out.println(F[i]);
		if(xd<t-1){leer.nextLine();leer.nextLine();}
		
		}
	}
}
/*
2

3 1 2
32.0 54.7 -2

3 1 2
32.0 54.7 -2


1

3 1 2
32.0 54.7 -2


*/