import java.util.*;
import java.util.Map.Entry;
public class _01203_Argus{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
        TreeMap<Long, TreeMap<Integer, Integer>> Q= new TreeMap<Long, TreeMap<Integer,Integer>>();
        while(true){
        	if(leer.next().charAt(0)=='#') break;
        	int q=leer.nextInt();
        	int p = leer.nextInt();
        	TreeMap<Integer, Integer> a= new TreeMap<Integer, Integer>();
        	if(Q.containsKey((long)p))a=Q.get((long)p);
        	a.put(q, p);
        	Q.put((long)p, a);
        }
        int k = leer.nextInt();
        while(k>0){
        	Entry <Long, TreeMap<Integer, Integer>> a = Q.pollFirstEntry();
        	while(!a.getValue().isEmpty()&&k>0){k--;
        		Entry <Integer,Integer> aux = a.getValue().pollFirstEntry();
        		System.out.println(aux.getKey());
        		long p = a.getKey()+aux.getValue();
        		TreeMap<Integer, Integer> x= new TreeMap<Integer, Integer>();
        		if(Q.containsKey(p))x=Q.get(p);
        		x.put(aux.getKey(), aux.getValue());
        		Q.put(p, x);
        	}
        }
	}
}
