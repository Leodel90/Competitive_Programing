import java.util.*;
public class Colorville {
	public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
while(leer.hasNext()){
	int n = leer.nextInt();
	int t= leer.nextInt();
	int c = leer.nextInt();
	if(n>0){
		char tab[]= leer.next().toCharArray();
		int p []= new int[n];
		int ganador=0,nro=0;
		boolean q = true;
		for (int i = 0; i <c; i++) {
			String carta= leer.next();
			int j=i%n;
			int k=0;
			while(p[j]<t&&q){
				if(tab[p[j]]==carta.charAt(k)){
				k++;if(k==carta.length()&&p[j]!=t-1)break;
				}
			 p[j]++;
			}
			if(p[j]==t&&q){
				ganador = j+1;
				nro=i+1;
				q=false;
			}else p[j]++;
		}
		if(!q)
		System.out.println("Player "+ganador+" won after "+nro+" cards.");		
		else System.out.println("No player won after "+c+" cards.");
		
		
	}
}
	}
}
/*

2 13 8
RYGPBRYGBRPOP
R
B
GG
Y
P
B
P
RR
2 6 5
RYGRYB
R
YY
G
G
B
3 9 6
QQQQQQQQQ
Q
QQ
Q
Q
QQ
Q
0 6 0
3 13 8
RYGPBRYGBRPOP
R
B
GG
Y
P
B
P
RR
4 13 8
RYGPBRYGBRPOP
R
B
GG
Y
P
B
P
RR

*/