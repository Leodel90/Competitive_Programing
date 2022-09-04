import java.util.*;
public class _00156_Ananagram {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		TreeSet<String> D = new TreeSet<String>();
		while(true){
			String cad = leer.next();
			if(cad.charAt(0)!='#')D.add(cad);
			else break;
		}
		while(!D.isEmpty()){
			String c= D.pollFirst();
			TreeSet<String> C= new TreeSet<String>();
			boolean k=false;
			while(!D.isEmpty()){
				String a= D.pollFirst();
				if(a.length()==c.length()){
					int V[]= new int [26];
					boolean q=true;
					for (int i = 0; i < a.length(); i++) {
						if(a.charAt(i)>=97)
							V[a.charAt(i)-97]++;
						else V[a.charAt(i)-65]++;
					}
					for (int i = 0; i < c.length()&&q; i++) {
						if(c.charAt(i)>=97){V[c.charAt(i)-97]--;q=V[c.charAt(i)-97]>=0;}
						else {V[c.charAt(i)-65]--;q=V[c.charAt(i)-65]>=0;}
					}
					if(!q)C.add(a);
					k=k||q;	
				}else C.add(a);
			}
			D=(TreeSet<String>) C.clone();
			if(!k)System.out.println(c);
		}

	}
}



/*
ladder came tape soon leader acme RIDE  lone Dreis  peat
ScAlE   orb  eye  Rides dealer  NotE derail  LaCeS drIed
noel dire Disk  mace  Rob dries
#

*/