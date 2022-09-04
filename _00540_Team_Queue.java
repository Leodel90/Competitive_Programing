import java.util.*;
public class _00540_Team_Queue {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int y=1;
        while(true){
        	int t = leer.nextInt();
        	if(t==0)break;
        	int D[]= new int [1000000];
        	LinkedList<Integer> Q[]= new LinkedList[t];
        	for (int i = 0; i <t; i++){
				int h = leer.nextInt();Q[i]= new LinkedList<Integer>();
				for (int j = 0; j < h; j++) 
					D[leer.nextInt()]=i;
			}
        	LinkedList<Integer> O= new LinkedList<Integer>();
        	System.out.println("Scenario #"+y);y++;
        	while(true){
        		String cad = leer.next();
        		if(cad.charAt(0)=='S')break;
        		if(cad.charAt(0)=='D'){
        			System.out.println(Q[O.getFirst()].remove());
        			if(Q[O.getFirst()].isEmpty())O.remove();
        		}else {int h = leer.nextInt();
        			if(Q[D[h]].isEmpty())O.add(D[h]);
        			Q[D[h]].add(h);
        		}        		
        	}
        	System.out.println();
        }
	}
}
/*
2
3 101 102 103
3 201 202 203
ENQUEUE 101
ENQUEUE 201
ENQUEUE 102
ENQUEUE 202
ENQUEUE 103
ENQUEUE 203
DEQUEUE
DEQUEUE
DEQUEUE
DEQUEUE
DEQUEUE
DEQUEUE
STOP
2
5 259001 259002 259003 259004 259005
6 260001 260002 260003 260004 260005 260006
ENQUEUE 259001
ENQUEUE 260001
ENQUEUE 259002
ENQUEUE 259003
ENQUEUE 259004
ENQUEUE 259005
DEQUEUE
DEQUEUE
ENQUEUE 260002
ENQUEUE 260003
DEQUEUE
DEQUEUE
DEQUEUE
DEQUEUE
STOP
0


*/