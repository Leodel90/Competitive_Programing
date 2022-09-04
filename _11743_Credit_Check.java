import java.util.*;
public class _11743_Credit_Check {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int i = 0; i < t; i++){
        	int S=0;
			for (int j = 0; j < 4; j++) {
				String g=leer.next();
				for (int k = 0; k < 4; k++){
					int x=g.charAt(k)-48;
					if(k%2==0){
						x=x<<1;
						S+=x%10+(x/10)%10;
					}else S+=x;
				}
			}
			
			if(S%10==0)System.out.println("Valid");
			else System.out.println("Invalid");
		}
	}
}

/*
4
5181 2710 9900 0012
5181 2710 9900 0017
4000 1234 5678 9123
4899 9728 6632 0506
*/