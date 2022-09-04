import java.util.*;
public class _10935_Throwing_cards_away_I {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(true){
        	int n = leer.nextInt();
        	if(n==0)break;
        	LinkedList<Integer>D= new LinkedList<Integer>();
        	while(n>0){
        		D.add(n);n--;
        	}
        	int r;
        	String res="";
        	while(true){
        		r=D.removeLast();
        		if(D.isEmpty())break;
        		D.addFirst(D.removeLast());
        		if(res.length()>0)res+=",";
        		res+=" "+r;
        	}
        	System.out.println("Discarded cards:"+res);
        	System.out.println("Remaining card: "+r);
        }
	}
}
/*
7
19
10
6
0


*/