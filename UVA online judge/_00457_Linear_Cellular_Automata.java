import java.util.*;
public class _00457_Linear_Cellular_Automata {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t= leer.nextInt();
		for (int xd = 0; xd < t; xd++) {
        int DNA[]= new int [10];
        for (int i = 0; i < 10; i++) {
			DNA[i]=leer.nextInt();
		}
        int D[]= new int [42];
        D[20]=1;
        if(xd>0)System.out.println();
        for (int i = 0; i < 50; i++){
        	int a=0;
			for (int j = 1; j <=40; j++){
				if(D[j]==0)System.out.print(" ");
				if(D[j]==1)System.out.print(".");
				if(D[j]==2)System.out.print("x");
				if(D[j]==3)System.out.print("W");
				int b=D[j];
				D[j]=DNA[a+D[j]+D[j+1]];
				a=b;
			}System.out.println();
		}
		}
	}
}
