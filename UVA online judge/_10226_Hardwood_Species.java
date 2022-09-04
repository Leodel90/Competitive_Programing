import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;
public class _10226_Hardwood_Species {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        leer.nextLine();
        leer.nextLine();
        DecimalFormat F = new DecimalFormat("0.0000");
        for (int xd = 0; xd < t; xd++) {
			TreeMap<String, Integer> A = new TreeMap<String, Integer>();
			int c=0;
			try{
				while(true){
					String arbol = leer.nextLine();
					if(arbol.length()==0) break;
					c++;
					if (A.containsKey(arbol))A.put(arbol,A.get(arbol)+1);
					else A.put(arbol, 1);
				}
			}catch(Exception e) {}
			if(xd>0)System.out.println();
			while(!A.isEmpty()){
				Entry<String, Integer> D= A.pollFirstEntry();
				String p=F.format((double)D.getValue()/c*100);
				p=p.substring(0,p.length()-5)+"."+p.substring(p.length()-4,p.length());
				System.out.println(D.getKey()+" "+p);
			}
		}
	}
}

/*
1

Red Alder
Ash
Aspen
Basswood
Ash
Beech
Yellow Birch
Ash
Cherry
Cottonwood
Ash
Cypress
Red Elm
Gum
Hackberry
White Oak
Hickory
Pecan
Hard Maple
White Oak
Soft Maple
Red Oak
Red Oak
White Oak
Poplan
Sassafras
Sycamore
Black Walnut
Willow
*/