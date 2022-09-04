import java.util.*;
public class _12015_Google_is_Feeling_Lucky{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int t= leer.nextInt();
		for (int i = 1; i <= t; i++){
			int max=-1;
			String R[]= new String[10];
			int k=0;
			for (int j = 0; j<10;j++){
				String cad = leer.next();
				int v= leer.nextInt();
				if(v>=max){
					if(v>max){
						R= new String[10];
						k=0;max=v;
					}
					R[k]=cad;k++;
				}
			}
			for (int j = 0; j < k; j++) {
				if(R[j].length()>0){
				for (int l = j+1; l < k; l++) {
				    if(R[j].equals(R[l]))R[l]="";	
				}
				}
			}
			System.out.println("Case #"+i+":");
			for (int j = 0; j < k; j++) {
				if(R[j].length()>0)System.out.println(R[j]);
			}
		}
	}
}
