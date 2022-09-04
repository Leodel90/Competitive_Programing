import java.util.*;
public class _11459_Snakes_and_Ladders {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		int t = leer.nextInt();
		for (int i = 0; i < t; i++){
			int n= leer.nextInt();
			int b = leer.nextInt();
			int c= leer.nextInt();
			int T[]= new int [101];
			for (int j = 0; j < b; j++){
				int x = leer.nextInt(),y= leer.nextInt();
				T[x]=y;
			}
			int P[]= new int [n];
			for (int j = 0; j < n; j++)P[j]=1;
			boolean end=true;
			for (int j = 0; j < c; j++){
				int v= leer.nextInt();
				if(end){
				int k=P[j%n]+v;
				if(k<=100){
					if(T[k]!=0)k=T[k];
				}else k=100;
				end=k!=100;
				P[j%n]=k;
				}
			}
			for (int j = 1; j <=n; j++){
				System.out.println("Position of player "+j+" is "+P[j-1]+".");
			}
		}
	}
}
