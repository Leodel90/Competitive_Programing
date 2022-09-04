import java.util.*;
public class _12342_Tax_Calculator {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        long V[]={180000,300000,400000,300000};
        double P[]={0,0.1,0.15,0.20,0.25};
        for (int i = 1; i <=t; i++){
			long h = leer.nextLong();
			double tax=0;
			for (int j = 0; j<5; j++){
				double y;
				if(j<4&&h>=V[j]){ 
					y=(double)(V[j]*P[j]);h-=V[j];
				}else {y=h;y=y*P[j];j=6;}
			    tax+=y;
			}
			if((long)tax<tax)tax=(long)(tax+1);
			if(tax!=0)tax=Math.max(tax, 2000);
			System.out.println("Case "+i+": "+(long)tax);
		}
	}
}
