import java.util.*;
public class _00630_Anagrams_II{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int t= leer.nextInt();
		for (int xd = 0; xd < t; xd++) {
		 int n = leer.nextInt();
	    String D[]= new String[n]; 
	    for (int i = 0; i < n; i++)
		   D[i]= leer.next();
	    while(true){
	    	String cad = leer.next();
	    	if(cad.charAt(0)!='E'){System.out.println("Anagrams for: "+cad);
	    	int c=1;
	    		for (int i = 0; i < n; i++){
					if(D[i].length()==cad.length()){
						boolean p=true;
						int V[]= new int [26];
						for (int j = 0; j < cad.length(); j++)V[cad.charAt(j)-97]++;
						for (int j = 0; j < cad.length()&&p; j++){V[D[i].charAt(j)-97]--;
						 p=V[D[i].charAt(j)-97]>=0;}
						if(p){
							System.out.println("  "+c+") "+D[i]);c++;
						}
					}
				}
	    		if(c==1)System.out.println("No anagrams for: "+cad);
	    	}else break;
	    }
	    if(xd!=t-1)System.out.println();
		}
	}
}

/*
8
atol
lato
microphotographics
rata
rola
tara
tola
pies
tola
kola
aatr
photomicrographics
END

*/