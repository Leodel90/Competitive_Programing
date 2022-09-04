import java.util.*;
public class _12554_A_Special_Happy_Birthday_Song {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n= leer.nextInt();
		String nom[]= new String[n];
		for (int i = 0; i < n; i++) 
			nom[i]= leer.next();
		String S[]= {"Happy","birthday","to","you","Happy","birthday","to","you","Happy","birthday","to","Rujia","Happy","birthday","to","you"};
		int j=0;int c=0;
		while(c<n){
			for (int i = 0; i < 16; i++){
				System.out.println(nom[j]+": "+S[i]);
				j++;j=j%n;
				c++;
			}			
		}
	}
}
