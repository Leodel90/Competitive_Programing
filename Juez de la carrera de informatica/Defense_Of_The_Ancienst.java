import java.util.*;
public class Defense_Of_The_Ancienst{
	static int n,max;
	static int res[][];
	static boolean a[],b[];
	public static void parejas(int i,int g,int k,int s){
		if(i==n){
			if(s>max)max=s;if(max==n)n=-1;}
		else{
		for (int j = 0; j < n; j++) {
			if(g==1)
			{if(!a[j]){
				a[j]=true; 
				parejas(i+1,0,k,s+res[j][k]);
				a[j]=false;
			}
			}else{
				if(!b[j]){
					b[j]=true;
					parejas(i,1,j,s);
				    b[j]=false;
				}
			}
		}
		
	}
	}
	public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
while(leer.hasNext()){
	int t = leer.nextInt();
	for (int xd = 0; xd < t; xd++) {
		n= leer.nextInt();
		int M[][]=new int[n][26];
		for (int i = 0; i < n; i++) {
			String cad = leer.next();
			M[i][cad.charAt(0)-65]=1;
			M[i][cad.charAt(1)-65]=1;
			M[i][cad.charAt(2)-65]=1;
			M[i][cad.charAt(3)-65]=1;
		}
		a= new boolean[n];
		b= new boolean[n];
		res= new int[n][n];
		max=-1;
		for (int i = 0; i < n; i++) {
			String sec= leer.next();
			for (int j = 0; j < n; j++) {
				if(M[j][sec.charAt(0)-65]==1 ||M[j][sec.charAt(1)-65]==1 ||M[j][sec.charAt(2)-65]==1 ||M[j][sec.charAt(3)-65]==1)
			    res[i][j]=1;			
			}
		}
		parejas(0,0,0,0);
		System.out.println(max);
	}
}
	}
}
/*
1
3
ABCD XYTS ABCW
BACD OPCW POIU
1
2
ABCD ABCD
ANCD OPER
1
2
ABCD TXYZ
XTYZ DCBA
1
6
ABCD XYTW PORE LHJK QWER JGHF
XYWT KJHL POQW APOI JAVC MZXF
1
6
ABCD XYTW PORE LHJK QWER JGHF
XYWT KJHL POQW APOI JAVC ZSUD
*/