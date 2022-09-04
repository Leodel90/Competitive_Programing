import java.util.*;
public class _11496_Musical_Loop {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        	while(true){
        		int n= leer.nextInt();
        		if(n==0)break;
        		boolean q=true,s=true;
        		int a=leer.nextInt(),f=a,c=0,b=leer.nextInt();q=a>b;a=b;
        		for (int i = 2; i < n; i++){
				 int x = leer.nextInt();
        		 if(a>x!=q){q=!q;c++;}a=x;
				}
        		if(a>f!=q){c++;q=!q;}
        		if(f>b!=q)c++;
        		System.out.println(c);
        	}
	}
}
/*
2
1 -3
6
40 0 -41 0 41 42
4
300 450 449 450
0
*/