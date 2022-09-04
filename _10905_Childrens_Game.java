import java.util.*;
public class _10905_Childrens_Game {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(true){
        	int n = leer.nextInt();
        	if(n==0)break;
        	String N[]= new String[n];
        	for (int i = 0; i < N.length; i++){
				N[i]= leer.next();
				int h=i;
				while(h>0){
					boolean q=false;
					int j= 0;String t1=N[h]+N[h-1],t2=N[h-1]+N[h];
					while(true){
						if(j<t1.length()){
							if(t1.charAt(j)!=t2.charAt(j)){
								q=t1.charAt(j)>t2.charAt(j);break;
							}else j++;
						}else break;
					}
					if(q){String aux=N[h];N[h]=N[h-1];N[h-1]=aux;h--;}else break;
				}
        	}
        	for (int i = 0; i < N.length; i++) 
				System.out.print(N[i]);
        	System.out.println();
        }
	}
}
