import java.util.*;
public class _10324_Zeros_and_Ones {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int s =1;
	    while(leer.hasNext()){
	    	String cad = leer.next();
	    	int G[]= new int[cad.length()];
	    	int k=0,j=0;
	    	for (int i = 1; i < cad.length(); i++,j++){
	    		G[j]=k;
	    		if(cad.charAt(j)!=cad.charAt(i))
				k++;	
			}
	    	if(j!=0&&cad.charAt(j-1)!=cad.charAt(cad.length()-1))k++;
	    	G[cad.length()-1]=k;
	    	int n = leer.nextInt();
	    	System.out.println("Case "+s+":");
	    	while(n>0){
	    		if(G[leer.nextInt()]==G[leer.nextInt()])System.out.println("Yes");
	    		else System.out.println("No");
	    		n--;
	    	}
	    	s++;
	    }
	}
}
