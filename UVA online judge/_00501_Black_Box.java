import java.util.*;
import java.util.Map.Entry;
public class _00501_Black_Box{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int y= leer.nextInt();
		for (int xd = 0; xd < y; xd++){
		int m = leer.nextInt();
		int n = leer.nextInt();
		LinkedList<Long> A= new LinkedList<Long>();
		for (int i = 0; i < m; i++)A.add(leer.nextLong());
		long k=Long.MIN_VALUE;
		TreeMap<Long, Integer> AC = new TreeMap<Long, Integer>();
		TreeMap<Long, Integer> DC = new TreeMap<Long, Integer>();
	    int g =leer.nextInt(),t=0;
	    if(xd>0)System.out.println();
	        while(true){
	        	if(t<g){t++;
	        		long h = A.remove();
	        		if(h<k){if(AC.containsKey(h))AC.put(h, AC.get(h)+1);else AC.put(h, 1);
	        		if(DC.containsKey(k))DC.put(k, DC.get(k)+1);else DC.put(k, 1);
	        		Entry <Long, Integer> P= AC.pollLastEntry();
	        		k=P.getKey();int c =P.getValue()-1;
	        		if(c>0)AC.put(k,c);
	        		}else{if(DC.containsKey(h))DC.put(h, DC.get(h)+1);else DC.put(h, 1);
	        		}
	        	}else{if(AC.containsKey(k))AC.put(k, AC.get(k)+1);else AC.put(k,1);
	        		Entry <Long, Integer> P= DC.pollFirstEntry();
	        		k=P.getKey();int c =P.getValue()-1;
	        		if(c>0)DC.put(k, c);
	        		System.out.println(k);
	        		n--;if(n==0)break;
                    g=leer.nextInt();
	        	}
	      }
		}
	}
}

/*
7 4 
3 1 -4 2 8 -1000 2
1 2 6 6 


*/