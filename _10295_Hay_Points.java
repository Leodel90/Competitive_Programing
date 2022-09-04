import java.util.*;
public class _10295_Hay_Points {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int m = leer.nextInt();
        int n = leer.nextInt();
        TreeMap<String, Double> D= new TreeMap<String, Double>();
        for (int i = 0; i < m; i++)
			D.put(leer.next(), leer.nextDouble());
		for (int i = 0; i < n; i++){
			double s=0;
			while(true){
				String w=leer.next();
				if(w.charAt(0)=='.')break;
				if(D.containsKey(w))s+=D.get(w);
			}
			if((long)s==s)System.out.println((long)s);
			else System.out.println(s);
		}
	}
}
/*
7 2
administer 100000
spending 200000
manage 50000
responsibility 25000
expertise 100
skill 50
money 75000
the incumbent will administer the spending of kindergarden milk money
and exercise responsibility for making change he or she will share
responsibility for the task of managing the money with the assistant
whose skill and expertise shall ensure the successful spending exercise
.
this individual must have the skill to perform a heart transplant and
expertise in rocket science
.

*/