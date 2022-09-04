import java.util.*;
public class _10920_Spiral_Tap {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(true){
        int n = leer.nextInt();
        long x = leer.nextLong();
        if(n+x==0)break;
        double t= Math.sqrt(x);
        int h=(int)t;
        if(h<t)h++;
        if(h%2==0)h++;
        int l=h>>1;
        long ls=h*h,li=ls-h,a=(n>>1)+1,b=a;if(li>0)li=li+2;
        int X[]={1,-1,-1,1};
        int Y[]={1,1,-1,-1};
        for (int i = 0; i < 4; i++){
			if(x<=ls&&x>=li){x=ls-x;
			b+=l*Y[i];a+=l*X[i];
				if(i%2==0)a=a-x*X[i];
				else b=b-x*Y[i];
				break;
			}else {ls=li-1;li=ls-h+2;}
		}
        System.out.println("Line = "+a+", column = "+b+".");
        }
	}
}
