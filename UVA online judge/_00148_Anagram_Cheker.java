import java.util.*;
public class _00148_Anagram_Cheker{
	static int V[],c,p,r,t,P[];
	static String DR[],Y;
	public static void Back(int i){
		if(r==c){boolean q= true;int C[]= V.clone();
			for (int j = 0; j < t&&q; j++){
				for (int k = 0; k < DR[P[j]].length()&&q;k++){
					C[DR[P[j]].charAt(k)-65]--;q=C[DR[P[j]].charAt(k)-65]>=0;
				}
			}
			if(q){System.out.print(Y+" =");
			 for (int j = 0; j < t; j++) 
				System.out.print(" "+DR[P[j]]);
		       System.out.println();
			}
			return;
		}
		for (int j = i; j < p; j++){
			if(r+DR[j].length()<=c){
				r+=DR[j].length();
				P[t]=j;t++;
				Back(j+1);
				r-=DR[j].length();
				t--;
			}
		}
	}
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
	    LinkedList<String> K= new LinkedList<String>();
	    while(true){
	    	String cad = leer.next();
	    	if(cad.charAt(0)!='#')
	    	K.add(cad);else break;
	    }
	    String D[]= new String[K.size()];
	    for (int i = 0; i < D.length; i++)D[i]=K.remove();
	    leer.nextLine();
	    while(true){
	    	Y = leer.nextLine();
	    	if(Y.charAt(0)!='#'){
	    		StringTokenizer k= new StringTokenizer(Y);
	    		V= new int [26];c=0;TreeSet<String> R= new TreeSet<String>();
	    		while(k.hasMoreElements()){
	    			String cad=k.nextToken();
	    			R.add(cad);c+=cad.length();
	    		for (int i = 0; i < cad.length(); i++)
					V[cad.charAt(i)-65]++;
	    		}
	    		DR= new String[1048576];
	    		P= new int [1048576];p=0;t=0;
				for (int i = 0; i < D.length; i++){
					if(D[i].length()<=c&&!R.contains(D[i])){int C[]=V.clone();
					boolean q=true;
					for (int j = 0; j < D[i].length()&&q; j++){
					    	C[D[i].charAt(j)-65]--;
					    	q=C[D[i].charAt(j)-65]>=0;
					}
					if(q){DR[p]=D[i];p++;}
					}
				}
				Back(0);
				
	    	}else break;
	    }
	}
}

/*
ABC
AND
DEF
DXZ
K
KX
LJSRT
LT
PT
PTYYWQ
Y
YWJRSQ
ZD
ZZXY
#
ZZXY ABC DEF
SXZYTWQP KLJ YRTD
ZZXY YWJSRQ PTYYWQ ZZXY
#
*/