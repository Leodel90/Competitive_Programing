import java.util.*;
public class _11917_Do_Your_Own_Homework {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int xd = 1; xd <=t; xd++){
			int n = leer.nextInt();
			TreeMap<String, Integer> S= new TreeMap<String, Integer>();
			for (int i = 0; i < n; i++) 
				S.put(leer.next(), leer.nextInt());
			int d = leer.nextInt();
			String s = leer.next(),r="";
			if(S.containsKey(s)&&S.get(s)<=d+5){
				if(S.get(s)>d)r="Late";
				else r="Yesss";
			}else r="Do your own homework!";
			System.out.println("Case "+xd+": "+r);
		}
	}
}
