import java.util.*;
public class _11995_I_Can_Guess_the_Data_Structure {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        try {while(true){
           int n = leer.nextInt();
           LinkedList<Integer> S= new LinkedList<Integer>();
           LinkedList<Integer> Q= new LinkedList<Integer>();
           TreeMap<Integer,Integer> PQ= new TreeMap<Integer, Integer>(); 
           boolean s=true,q=true,pq=true;
           for (int i = 0; i < n; i++){
			int t=leer.nextInt();
			int x=leer.nextInt();
			if(t==2){
				s=s&&!S.isEmpty()&&S.removeLast()==x;
				q=q&&!Q.isEmpty()&&Q.removeFirst()==x;
				pq=pq&&!PQ.isEmpty()&&PQ.lastKey()==x;
				if(pq){int l=PQ.get(x);
					if(l>1)PQ.put(x, l-1);
					else PQ.pollLastEntry();
				}
			}else{S.add(x);Q.add(x);
			if(PQ.containsKey(x))PQ.put(x,PQ.get(x)+1);else PQ.put(x, 1);}
		}
           if(s||q||pq){
        	   int r=0;
        	   if(s)r++;
        	   if(q)r++;
        	   if(pq)r++;
        	   if(r==1){
        		   if(s)System.out.println("stack");
        		   if(q)System.out.println("queue");
        		   if(pq)System.out.println("priority queue");
        	   }else System.out.println("not sure");
           }else System.out.println("impossible"); 
        }
        }catch(Exception e){}
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
