import java.util.*;
public class _00489_Hangman_Judge {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			int nc= leer.nextInt();
			if(nc!=-1){
			String res= leer.next();
			String cad = leer.next();
			int C[]= new int[26];
			int f=0,c=7;
			for (int i = 0; i < res.length(); i++){ 
				if(C[res.charAt(i)-97]!=1){f++;
				C[res.charAt(i)-97]=1;}	
			}
			for (int i = 0; i < cad.length()&&c>0&&f>0; i++){
				if(C[cad.charAt(i)-97]!=1){
				  if(C[cad.charAt(i)-97]==0)c--;
				}else f--; 
				C[cad.charAt(i)-97]=-1;
			} 	
			System.out.println("Round "+nc);
			if(c==0||f==0){
				if(c==0)System.out.println("You lose.");
				else System.out.println("You win.");
			}else System.out.println("You chickened out.");
			
			}
		}
	}
}
