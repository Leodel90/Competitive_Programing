import java.util.*;
public class Diferent_Digits_6134{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int N[]= new int[5001];
		boolean C[]= new boolean[5001];
		N[0]=1;
		String cad;
		boolean D[];
		for (int i = 1;i<=5000;i++){
			cad=i+"";
			boolean p=true;
			D= new boolean[10];
			for (int j = 0; j < cad.length()&&p; j++){
				if(D[cad.charAt(j)-48])
				p=false;
				else D[cad.charAt(j)-48]=true;
			}
			N[i]=N[i-1];
			if(p){N[i]++;C[i]=true;}
		}
		while(leer.hasNext()){
			int n= leer.nextInt();
			int m = leer.nextInt();
			if(C[n])
			System.out.println(N[m]-N[n]+1);
			else System.out.println(N[m]-N[n]);
		}
	}
}
