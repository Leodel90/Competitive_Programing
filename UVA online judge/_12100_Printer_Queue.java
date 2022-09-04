import java.util.*;
public class _12100_Printer_Queue {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int xd = 0; xd < t; xd++){
			int n = leer.nextInt();
			int p =leer.nextInt();
			LinkedList<Integer> L= new LinkedList<Integer>();
			LinkedList<Integer> I= new LinkedList<Integer>();
			int V[]= new int [10];
			for (int i = 0; i < n; i++){
				L.add(leer.nextInt());
				V[L.getLast()]++;
				I.add(i);
			}
			LinkedList<Integer> K= new LinkedList<Integer>();
			LinkedList<Integer> P= new LinkedList<Integer>();
			for (int i = 9; i >0; i--){
				if(V[i]>0){K.add(i);P.add(V[i]);}
			}int r=0;
			while(true){
				if(L.getFirst()==K.getFirst()){
					if(P.getFirst()==1){P.remove();K.remove();}
					else P.addFirst(P.remove()-1);
					r++;
					if(I.remove()==p)break;
					L.remove();
				}else {L.add(L.remove());I.add(I.remove());}
			}
			System.out.println(r);
		}
	}
}
