import java.util.*;
public class _00146_ID_Codes{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
        while(true){
        	String h = leer.next();
        	if(h.charAt(0)=='#')break;
        	int n = h.length();
        	char O[]= new char[n];
        	boolean V[]= new boolean[n];
        	int P[]= new int [n];
        	char N[]= new char[n];
        	int D[]= new int [n];
        	for (int i = 0; i < n; i++){
				O[i]=h.charAt(i);
				int r=i;
				P[i]=i;
				D[i]=i;
				N[i]=O[i];
				while(r>0){
					if(O[r]<=O[r-1]){
                        int e=D[r];D[r]=D[r-1];D[r-1]=e;
						char k=O[r];O[r]=O[r-1];O[r-1]=k;
						P[i]--;P[D[r]]++;
						r--;
					}else break;
				}
			}
        	int p=n-1,r=0;
        	boolean q=true;
        	while(true){
        		if(P[p]+r+1<n){r++;
        			if(V[P[p]+r]){
        				P[p]+=r;
        				V[P[p]]=false;
        				N[p]=O[P[p]];
        				r=0;
        				p++;
        				if(p==n)break;
        			}
        		}else{V[P[p]]=true;P[p]=-1;p--;if(p<0){q=false;break;}V[P[p]]=true;r=0;}
        	}
        	if(q){
        	for (int i = 0; i < n; i++) {
				System.out.print(N[i]);
			}System.out.println();
        	}else System.out.println("No Successor"); 
        }
	}
}
/*	
aaaaaaaaaaaab
aaaaaaaaaaaba
aaaaaaaaaabaa
aaaaaaaaabaaa
aaaaaaaabaaaa
aaaaaaabaaaaa
aaaaaabaaaaaa
aaaaabaaaaaaa
aaaabaaaaaaaa
aaabaaaaaaaaa
aabaaaaaaaaaa
abaaaaaaaaaaa
baaaaaaaaaaaa
eeeeeeeeeeddddddddddccccccccccbbbbbbbbbabaaaaaaaaa
eeeeeeeeeeddddddddddccccccccccbbbbbbbbbbaaaaaaaaaa
abaabc
abaacb
ababac
cbbaa
#
*/