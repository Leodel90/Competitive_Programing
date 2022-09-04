import java.util.*;
public class _00700_Date_Bugs {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t=1;
		while(true){
			int n = leer.nextInt();
			if(n==0)break;
			int A[]= new int [n];
			int D[]= new int [n];
			int max=0,d=0;
			for (int i = 0; i < n; i++) {
				A[i]=leer.nextInt();
				D[i]=-leer.nextInt()+leer.nextInt();
				if(A[i]>max){
					max=A[i];
				}
			}
			int a=max;
			while(a<10000){boolean q=true;
			int min=0;
				for (int i = 0; i < n; i++){
					q=q&&a==A[i];
					if(A[i]+D[i]<A[min]+D[min])min=i;
				}
				if(!q){A[min]+=D[min];a=A[min];}else break;
			}
			System.out.println("Case #"+t+":");t++;
			if(a>=10000)System.out.println("Unknown bugs detected.");
			else System.out.println("The actual year is "+a+".");
			System.out.println();
		}
	}
}
/*
2
1941 1900 2000
2005 1904 2040
2
1998 1900 2000
1999 1900 2000
2
1941 1900 2000
1941 1904 2040
2
1905 1900 2000
2005 1904 2040

0

*/
