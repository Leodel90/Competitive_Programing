import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _00599_The_Forrest_for_the_Trees {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		for (int xd= 0; xd < T; xd++){
		boolean P[]= new boolean[26];
		int e=0;
        while(true){
        	String cad = br.readLine();
        	if(cad.charAt(0)=='*')break;
        	e++;
        	char a=' ';
        	for (int i = 0; i < cad.length();i++){
				char x= cad.charAt(i);
				if(x>=97&&x<=122)x=(char)(x-32);
				if(x>=65&&x<=90){if(a!=x){a=x;P[x-65]=true;}else P[x-65]=false;}
			}
        }
        String cad = br.readLine();
        int v=0,c=0;
        for (int i = 0; i < cad.length(); i++){
			char x = cad.charAt(i);
			if(x>=97&&x<=122)x=(char)(x-32);
			if(x>=65&&x<=90){
				if(!P[x-65])c++;
				v++;
			}
		}int t=v-e-c;
        System.out.println("There are "+t+" tree(s) and "+c+" acorn(s).");
		}
	}
}
/*
1
(A,B)
(B,C)
(B,D)
(D,E)
(E,F )
(B,G)
(G,H)
(G,I)
(J,K)
(K,L)
(K,M)
*
A,B,C,D,E,F,G,H,I,J,K,L,M,N
#
*/