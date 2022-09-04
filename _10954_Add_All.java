import java.util.*;
import java.util.Map.Entry;
public class _10954_Add_All {
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
        while(true){
        	int n = leer.nextInt();
        	if(n==0) break;
            TreeMap<Long, Integer> Q= new TreeMap<Long, Integer>();
            for (int i = 0; i < n; i++){
            	long x = leer.nextInt();
                if(Q.containsKey(x))Q.put(x, Q.get(x)+1);else Q.put(x, 1);
            }
            long c=0;
            while(true){
            	Entry<Long,Integer> A= Q.pollFirstEntry();
            	int v=A.getValue(),r=0;
            	long x=A.getKey(),h=x*2;
            	while(v>=2){r++;
            		v=v-2;
            		c=c+h;
            	}
            	if(r>0){if(Q.containsKey(h))Q.put(h, Q.get(h)+r);else Q.put(h,r);}
        		if(v==1){if(Q.isEmpty())break;
                     A=Q.pollFirstEntry();
                     v=A.getValue()-1;h=A.getKey();
                     x=x+h;c=c+x;
                     if(Q.containsKey(x))Q.put(x, Q.get(x)+1);else Q.put(x,1);
                     if(v>0)Q.put(h,v);
                }
            }
        System.out.println(c);
	    }
    }
}

/*
7
1 1 1 2 2 2 2
3
1 2 3
4
1 2 3 4
*/