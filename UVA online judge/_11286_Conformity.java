import java.util.*;
import java.util.Map.Entry;
public class _11286_Conformity {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(true){
        	int n = leer.nextInt();
        	if(n==0) break;
        	TreeMap<String, Integer> C= new TreeMap<String, Integer>();
        	for (int i = 0; i < n; i++){
				int P[]= new int[5];
				for (int j = 0; j < 5; j++)
					P[j]=leer.nextInt();
				Arrays.sort(P);
				String c= ""+P[0]+P[1]+P[2]+P[3]+P[4];
				if(C.containsKey(c))C.put(c, C.get(c)+1);
				else C.put(c, 1);
			}
        	int s=0,mp=0;
        	while(!C.isEmpty()){
        		Entry <String,Integer>A= C.pollFirstEntry();
        		if(A.getValue()>=mp){
        			if(A.getValue()>mp){
        				mp=A.getValue();s=0;
        			}
        			s+=mp;
        		}
        	}
        	System.out.println(s);
        }
	}
}
