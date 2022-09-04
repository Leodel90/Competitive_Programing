import java.util.*;
public class _00538_Balancing_Bank_Accounts {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int c=1;
		while(true){
			int n = leer.nextInt();
			int t = leer.nextInt();
			if(n+t>0){
			String N[]= new String [n];
			int M[]= new int [n];
			for (int i = 0; i < n; i++) {
				N[i]= leer.next();
			}
			for (int i = 0; i < t; i++){
				String n1=leer.next();
				String n2=leer.next();
				int m=leer.nextInt();
				int a=0,b=0;
				while(a<n){
					if(N[a].equals(n1)){M[a]=M[a]-m;break;}else a++;
				}
				while(b<n){
					if(N[b].equals(n2)){M[b]=M[b]+m;break;}else b++;
				}
			}
			System.out.println("Case #"+c);c++;
			for (int i = 0; i < n; i++){
				for (int j = 0; j < n&&M[i]>0; j++){
						if(M[j]<0){int m;
							if(-M[j]>=M[i]){m=M[i];M[i]=0;M[j]+=m;}
							else {m=-M[j];M[j]=0;M[i]-=m;}
							System.out.println(N[i]+" "+N[j]+" "+m);
						}
				}
			}System.out.println();
			}else break;
		}
	}
}

/*
2 1
Donald
Dagobert
Donald Dagobert 15
4 4 
Jhon
Mary
Cindy
Arnold
Jhon Mary 100
Jhon Cindy 200
Cindy Mary 40
Cindy Arnold 150
0 0
*/