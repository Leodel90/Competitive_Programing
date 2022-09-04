import java.util.*;
public class _10507_Waking_up_brain {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        try{
        	while(true){
        		int n= leer.nextInt();
        		int m = leer.nextInt();
        		String cad = leer.next();
        		LinkedList<Integer> T= new LinkedList<Integer>();
        		int C[]= new int [26];
        		T.add(cad.charAt(0)-65);
        		T.add(cad.charAt(1)-65);
        		T.add(cad.charAt(2)-65);
        		C[cad.charAt(0)-65]=-1;
        		C[cad.charAt(1)-65]=-1;
        		C[cad.charAt(2)-65]=-1;
        		LinkedList<Integer> L[]= new LinkedList[26];
        		for (int i = 0; i < 26; i++) L[i]= new LinkedList<Integer>();
        		for (int i = 0; i < m; i++){
					cad = leer.next();
					int a=cad.charAt(0)-65;
					int b=cad.charAt(1)-65;
					L[a].add(b);
					L[b].add(a);
				}
        		n=n-3;
        		int c=0;
        		while(n>0&&!T.isEmpty()){int t=T.size();
        			for (int i = 0; i < t; i++){
						int h = T.remove();
						while(!L[h].isEmpty()){
							int x = L[h].remove();
							if(C[x]>=0){
								C[x]++;if(C[x]==3){T.add(x);C[x]=-1;n--;}
							}
						}
					}
        			c++;
        		}
        		if(n==0)System.out.println("WAKE UP IN, "+c+", YEARS");
        		else System.out.println("THIS BRAIN NEVER WAKES UP");
        	}
       }catch(Exception e){}
	}
}

