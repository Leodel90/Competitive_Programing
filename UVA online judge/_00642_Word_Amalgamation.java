import java.util.*;
public class _00642_Word_Amalgamation {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		LinkedList<String> d= new LinkedList<String>();
		int  p;
		while(true){
			String cad = leer.next();
			if(cad.charAt(0)!='X')d.add(cad);
			else break;
		}p=d.size();
		String  D []= new String[p];
		for (int i = 0; i < p; i++)D[i]=d.remove();
		Arrays.sort(D);
		while(true){
			String cad = leer.next();
			if(cad.charAt(0)!='X'){
				boolean r=false;
				for (int i = 0; i < p; i++){boolean q = true;
					if(D[i].length()==cad.length()){
						int V[]= new int[26];
						for (int j = 0; j < cad.length(); j++)
							V[cad.charAt(j)-97]++;
						for (int j = 0; j < cad.length()&&q; j++){V[D[i].charAt(j)-97]--;
						  q=V[D[i].charAt(j)-97]>=0;
						}
						if(q)System.out.println(D[i]);
					r=r||q;
					}
				}
				if(!r)System.out.println("NOT A VALID WORD");
				System.out.println("******");
			}else break;
		}
	}
}
/*
tarp
given
score
refund
only
trap
work
earn
course
pepper
part
XXXXXX
resco
nfudre
aptr
sett
oresuc
XXXXXX
*/