import java.util.*;
public class Adivine_la_Esctructura {
	public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    while(leer.hasNext()){
    	int n = leer.nextInt();
    	Stack<Integer> Pila = new Stack<Integer>();
    	LinkedList<Integer> Cola = new LinkedList<Integer>();
    	PriorityQueue<Integer> ColaP = new PriorityQueue<Integer>();
    	boolean P = true,CP=true,C=true;
    	for (int i = 0; i < n; i++) {
			int t = leer.nextInt();
			int x = leer.nextInt();
			if(t==2){
				if(!Pila.isEmpty() &&P){
					P=Pila.pop()==x;
				}else P=false;
			    if(!Cola.isEmpty() &&C){
			    	C=Cola.remove()==x;
			    }else C = false;
			    if(!ColaP.isEmpty() &&CP){
			    	CP=100==ColaP.remove()+x;
			    }else CP=false;
			}
			else {
				Pila.push(x);
				Cola.add(x);
				ColaP.add(100-x);
			}
		}
    	if(P || C || CP){
        	if(P&&!C&&!CP || !P&&C&&!CP || !P&&!C&&CP){
        		if(P)System.out.println("stack");
        		if(C)System.out.println("queue");
        		if(CP)System.out.println("priority queue");
        	}else System.out.println("not sure");
        }else System.out.println("impossible");
    }
	}
}
/*
6
1 1
1 2
1 3
2 1
2 2
2 3
6
1 1
1 2
1 3
2 3
2 2
2 1
2
1 1
2 2
4
1 2
1 1
2 1
2 2
7
1 2
1 5
1 1
1 3
2 5
1 4
2 4

*/