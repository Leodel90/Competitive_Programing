import java.util.*;
public class _00195_Anagram{
	static char T[],K[];
	static boolean V[];
    static LinkedList<String> R;
	static int n,r;
	static TreeSet<String>M;
	public static void Permuta(){
		if(r==n){
			String k = "";for (int i = 0; i < r; i++)k+=K[i];
			M.add(k);
		return;
		}
		boolean P[]= new boolean[52];
		for (int i = 0; i < n; i++){
			if(!V[i]){
				V[i]=true;
				int p;
				if(T[i]>=97)
				p=T[i]-71;
				else p=T[i]-65;
				if(!P[p]){
					P[p]=true;
					K[r]=T[i];
					r++;
					Permuta();r--;
				}
				V[i]=false;
				}
			}
	}
	public static void main(String[] args) {	
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for (int i = 0; i < t; i++){
			String c = leer.next();
			n= c.length();
			T= new char[n];
			V= new boolean[n];
			for (int j = 0; j < n; j++)
				T[j]=c.charAt(j);
			R= new LinkedList<String>();
			Comparator<String> U= new Comparator<String>(){
				public int compare(String o1, String o2){
					for (int j = 0; j < n; j++) {
						if(o1.charAt(j)!=o2.charAt(j)){
							char x,y;
							if(o1.charAt(j)>=97)x=(char)(o1.charAt(j)-32);
							else x=o1.charAt(j);
							if(o2.charAt(j)>=97)y=(char)(o2.charAt(j)-32);
							else y=o2.charAt(j);
							if(x==y){x=o1.charAt(j);y=o2.charAt(j);}
							if(x<y)return -1;
							else return 1;
						}
					}return 0;
				}
			};
			K= new char[n];r=0;M= new TreeSet<String>(U);
			Permuta();
			while(!M.isEmpty())System.out.println(M.pollFirst());
		}
	}
}
