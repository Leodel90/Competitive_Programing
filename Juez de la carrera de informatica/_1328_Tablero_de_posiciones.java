import java.util.*;
import java.util.Map.Entry;
public class _1328_Tablero_de_posiciones {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		TreeMap<Integer, String> M= new TreeMap<Integer, String>(); 
		for (int i = 0; i < n; i++){
			String e = leer.next();
			M.put(leer.nextInt(),e);
		}
        while(!M.isEmpty()){
        	Entry<Integer,String> R= M.pollFirstEntry();
        	System.out.println(R.getValue());
        }
	}
}
