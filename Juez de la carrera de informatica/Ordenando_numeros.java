import java.util.*;
public class Ordenando_numeros {
public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
while(leer.hasNext()){
	int n = leer.nextInt();
	for (int xd = 0; xd < n; xd++) {
		int a =leer.nextInt();
		int v[]=new int[a];
		for (int i = 0; i < a; i++) {
			v[i]= leer.nextInt();
			int f=i;
			while(f>0){
				if(v[f]<v[f-1]){int aux=v[f];v[f]=v[f-1];v[f-1]=aux;f--;}
				else break;
			}
		}
		for (int i = 0; i < a; i++) {
			System.out.print(v[i]+" ");
		}System.out.println();
	}
}

	}

}
/*
3
10
1 9 4 8 7 6 3 2 5 0
5
5 4 3 2 1
2
100 1

*/