import java.util.*;
public class _10978_Lets_Play_Magic {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(true){
		int n =  leer.nextInt();
		if(n>0){
			String C[]= new  String[n];
			int p=0;
			for (int i = 0; i < n; i++){
				String c= leer.next();
				String N= leer.next();
			    int j = N.length();
				while(true){
					if(C[p]==null)j--;
					if(j==0)break;
					p++;if(p==n)p=0;
				}
				C[p]=c;
			}
			for (int i = 0; i < n; i++) {
				if(i!=0)System.out.print(" ");
				System.out.print(C[i]);
			}
			System.out.println();
		}else break;
		}
	}
}


/*
13
AS ACE
2S TWO
3S THREE
4C FOUR
5C FIVE
6C SIX
7D SEVEN
8D EIGHT
9D NINE
TH TEN
JH JACK
QH QUEEN
KH KING
0

*/