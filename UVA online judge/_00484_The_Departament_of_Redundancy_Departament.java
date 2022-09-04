import java.util.*;
public class _00484_The_Departament_of_Redundancy_Departament {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        LinkedList<Long> L= new LinkedList<Long>();
        TreeMap<Long, Integer>  M= new TreeMap<Long, Integer>(); 
        try{
        	while(true){
        		long x = leer.nextLong();
        		if(!M.containsKey(x)){
        			L.add(x);
        			M.put(x,1);
        		}
        		else M.put(x, M.get(x)+1);
        	}
        }catch(Exception e){}
        while(!L.isEmpty()) System.out.println(L.getFirst()+" "+M.get(L.remove()));
	}
}
