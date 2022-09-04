import java.util.*;
public class _00454_Anagrams {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
	    int t = leer.nextInt();
	    leer.nextLine();
	    leer.nextLine();
	    for (int xd = 0; xd < t; xd++){
			LinkedList<String> D= new LinkedList<String>();
	    	try{
			while(true){
	    		String cad = leer.nextLine();
	    		if(cad.length()>0)
	    		D.add(cad);else break;
	    	}
			}catch(Exception e){}
	    	String C[]= new String[D.size()];
	    	int p = 0;
	    	while(!D.isEmpty()){C[p]=D.remove();p++;}
	    	Arrays.sort(C);
	    	if(xd!=0)System.out.println();
	    	for (int i = 0; i < p; i++){
	    		int V[]= new int [256],c=0;
				for (int k = 0; k < C[i].length(); k++){ 
					if(C[i].charAt(k)!=' '){V[C[i].charAt(k)]++;c++;}
					}
				for (int j = i+1; j < p; j++) {
					int T[]= V.clone(),r=0;boolean q=true;
					for (int k = 0; k < C[j].length()&&q; k++){
						if(C[j].charAt(k)!=' '){T[C[j].charAt(k)]--;r++;}
						q=T[C[j].charAt(k)]>=0;
					}
					if(q&&r==c)System.out.println(C[i]+" = "+C[j]);
				}
		     }
	    	
		}
	}
}

/*
2

carthorse
horse
horse cart
i do not know u
ok i now donut
orchestra

carthorse
horse
horse cart
i do not know u
ok i now donut
orchestra


1

AaA
Aa a9
aAA
aA9a
AB
AB
AB

6

carthorse.!@#$%^&*
horse
horse cart*&^%$#@!.
orchestra
i do not know u
ok i now donut

zaaaahari is here
si hari ere h aaaaz
i like tunes
tunes i like

carthorse
horse
horse cart
i do not know u
ok i now donut
orchestra

carthorse
horse
horse cart
i do not know u
ok i now donut
orchestra

abc
def

cba
abc

*/