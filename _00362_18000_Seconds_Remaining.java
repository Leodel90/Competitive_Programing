import java.util.*;
public class _00362_18000_Seconds_Remaining {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		double s=0,p=0;
		int c=0,n=1,S;
		boolean q=true;
		while(true){
			S= leer.nextInt();
			if(q){
				if(S==0)break;
				System.out.println("Output for data set "+n+", "+S+" bytes:");
				s=S;c=0;p=0;
				q=false;
				n++;
			}else {s=s-S;c++;
				 p=p+S;
				 if(c%5==0){
					 if(p>0){p=(s*5)/p;
					if((int)p<p)p++;
					System.out.println("   Time remaining: "+(int)p+" seconds");
					p=0;
					}
					else System.out.println("   Time remaining: stalled");
				 }
			     if(s==0){System.out.println("Total time: "+c+" seconds");q=true;System.out.println();} 
			}
		}
	}
}
