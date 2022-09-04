import java.util.*;
public class _00732_Anagrams_by_Stack {
	static LinkedList<Character> L,K,R;
	static int n;
	static String C,O;
	public static void P(int i){
		if(L.size()+K.size()==n){
			boolean q=true;int c=0;
			while(!L.isEmpty()&&q){
				q=L.getLast()==O.charAt(K.size());
				if(q){K.add(L.removeLast());c++;R.add('o');}
			}
			if(q){
				for (int j = 1; j <=n<<1; j++){
					char t=R.remove();System.out.print(t);
					if(j!=n<<1)System.out.print(" ");
					R.add(t);	
				}System.out.println();
			}
			for (int j = 0; j < c; j++){
				   L.add(K.removeLast());R.removeLast();
			 }
			return;
		}
		L.add(C.charAt(i));
		int c=0;R.add('i');
		while(true){
			P(i+1);
			L.removeLast();
			R.removeLast();
			boolean q=!L.isEmpty()&&L.getLast()==O.charAt(K.size());
			if(q){
				K.add(L.removeLast());
				R.add('o');
				L.add(C.charAt(i));c++;
				R.add('i');
			}else{
				for (int j = 0; j < c; j++){
					L.add(K.removeLast());R.removeLast();
				}
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        try {
		while(true){
        		C=leer.nextLine();
        		O=leer.nextLine();
        		n=C.length();
        		L=new LinkedList<Character>();
        		K=new LinkedList<Character>();
        		R=new LinkedList<Character>();
        		System.out.println("[");
        		if(C.length()==O.length())
        		P(0);
        		System.out.println("]");
        	}
		}catch(Exception e){}
        
	}
}
/*
trot
tort
madam
adamm
bahama
bahama
long
short
eric
rice


*/