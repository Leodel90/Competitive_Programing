import java.util.*;
public class Problem_A_Eating_Chips {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		try{while(true){
			int n = leer.nextInt();
			 int b = leer.nextInt();
			 int t = leer.nextInt();
			 int cb=0;
			 int ct=0;
			 int tb=0,tt=0;
			 while(n>0||tb>0||tt>0){
				 if(tb>0||tt>0){
					 if(tb==0||tt==0){
						 if(tb==0){tb=Math.min(n, b);n=n-tb;tt--;ct++;
						 }else{tt=Math.min(n, t);n=n-tt;tb--;cb++;
						 }
					 }else{int m=Math.min(tb,tt);tb=tb-m;cb=cb+m;ct=ct+m;
					 tt=tt-m;
					 }
				 }else{tb=Math.min(n, b);n=n-tb;tt=Math.min(n, t);n=n-tt;}
			 }
			 System.out.println(cb+" "+ct);
		}
		}catch(Exception e){}
	}
}
