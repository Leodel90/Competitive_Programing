import java.util.*;
public class Parada_de_Buses {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
try {
while(true){
	int t = leer.nextInt();
	for (int xd = 0; xd < t; xd++) {
		int n = leer.nextInt();
		int m = leer.nextInt();
		int buses=1;
		int y=m;
		for (int i = 0; i < n; i++) {
			int x=leer.nextInt();
			if(y>=x){
				y=y-x;
			}else{y=m-x;buses++;}
		}System.out.println(buses);
	}
}
}catch (Exception e) {
	
}
	}
}
/*
2
3 4
1 2 1
4 3
2 3 2 1
*/
