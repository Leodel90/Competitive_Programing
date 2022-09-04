import java.util.*;
import java.util.Map.Entry;
public class _11239_Open_Source {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(true){
            String T[]= new String[100];
            TreeMap<String, Integer> S = new TreeMap<String, Integer>();
            boolean a=true,b=true;
            String x ="";
            int c=0;
        	while(true){
        		String cad = leer.nextLine();
        		a=cad.charAt(0)=='1';
        		b=cad.charAt(0)=='0';
        		if(a||b)break;
        		if(cad.charAt(0)>=97){
        			if(S.containsKey(cad)){
        				if(S.get(cad)!=c-1)S.put(cad, -1);
        			}else S.put(cad, c-1);
        		}else {T[c]=cad;c++;}
        	}
        	if(a){
        	    int C[]= new int[c];
        	    while(!S.isEmpty()){
        	    	Entry<String, Integer> A = S.pollFirstEntry();
        	    	if(A.getValue()!=-1)
        	    		C[A.getValue()]++;
        	    }
        	    TreeMap<Integer, TreeSet<String>>R= new TreeMap<Integer, TreeSet<String>>();
        	    for (int i = 0; i < c; i++){
        	    	TreeSet<String> aux= new TreeSet<String>();
					if(R.containsKey(C[i]))aux=R.get(C[i]);
					aux.add(T[i]);
					R.put(C[i], aux);
				}
        	    while(!R.isEmpty()){
        	    	Entry <Integer, TreeSet<String>> A = R.pollLastEntry();
        	    	while(!A.getValue().isEmpty())
        	    		System.out.println(A.getValue().pollFirst()+" "+A.getKey());
        	    }
        	}else break;
        }
	}
}
