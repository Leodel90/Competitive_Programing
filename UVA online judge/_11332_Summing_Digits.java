import java.util.*;
public class _11332_Summing_Digits {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			long  n = leer.nextLong();
			if(n>0){long c=0;
				while(c!=n){
					long s=0;
					c=n;
					while(n>0){
					   s+=n%10;
					   n=n/10;
					}
					n=s;
				}
                System.out.println(n);
			}
		}
	}
}
