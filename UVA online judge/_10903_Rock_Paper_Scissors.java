import java.util.*;
import java.text.DecimalFormat;
public class _10903_Rock_Paper_Scissors {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		boolean q=false;
		while(leer.hasNext()){
			int n = leer.nextInt();
			if(n>0){
			int k = leer.nextInt()*(n*(n-1))/2;
			double CT[]= new double [n+1];
			double CW[]= new double [n+1];
			leer.nextLine();
			for (int i = 0; i < k; i++) {
				int p1= leer.nextInt();
				char m1= leer.next().charAt(0);
				int p2= leer.nextInt();
				char m2=leer.next().charAt(0);
				if(m1!=m2){
					CT[p1]++;CT[p2]++;
					if(m1=='p'&&m2=='r')CW[p1]++;
					if(m1=='r'&&m2=='s')CW[p1]++;
					if(m1=='s'&&m2=='p')CW[p1]++;
					if(m1=='p'&&m2=='s')CW[p2]++;
					if(m1=='r'&&m2=='p')CW[p2]++;
					if(m1=='s'&&m2=='r')CW[p2]++;
				}
			}DecimalFormat A = new DecimalFormat("0.000");
			if(q)System.out.println();else q=true;
			for (int i = 1; i <=n; i++){
				if(CT[i]>0){
				String H=A.format(CW[i]/CT[i]);
				System.out.println(H.charAt(0)+"."+H.substring(2,H.length())) ;}
				else System.out.println("-");
			}
			}else break;
		}
	}
}
