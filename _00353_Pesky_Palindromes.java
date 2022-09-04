import java.util.*;
public class _00353_Pesky_Palindromes {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			String cad = leer.nextLine();
			if(cad.length()>0){
				int c = cad.length()*(cad.length()+1)/2,r=0,t=0;
			   	String C[]= new String[c];
			   	for (int i = 1; i <=cad.length(); i++){
			   		int k=0;
					while(k+i<=cad.length()){
						boolean q= true;
						String y="";
						for (int j = k; j < k+i; j++)
							y+=cad.charAt(j);
						for (int j = 0; j < i>>1&&q; j++) 
							q=y.charAt(j)==y.charAt(i-j-1);
						if(q){
							for (int j = 0; j < t&&q; j++)
								q=!y.equals(C[j]);
							if(q){r++;C[t]=y;t++;}
						}
						k++;
					}
				}
			   	System.out.println("The string '"+cad+"' contains "+r+" palindromes.");
			}else break;
		}
	}
}
/*
boy
adam
madam
tot
*/