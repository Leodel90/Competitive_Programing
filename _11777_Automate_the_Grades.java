import java.util.*;
public class _11777_Automate_the_Grades {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int xd = 1; xd <=t; xd++) {
			double P= leer.nextInt()+leer.nextInt()+leer.nextInt()+leer.nextInt();
		    double t1=leer.nextDouble();
		    double t2=leer.nextDouble();
		    double t3=leer.nextDouble();
		    P=P+(Math.max(Math.min(t1, t2),t3)+Math.max(t1, t2))/2;
		    char r;
		    if(P<90){
		    	if(P<80){
		    		if(P<70){
		    			if(P<60)
		    				r='F';
		    			else r='D';
		    		}else r='C';
		    	}else r='B';	
		    }else r='A';
		    System.out.println("Case "+xd+": "+r);
		}
	}
}
/*
3
15 18 25 8 15 17 12
20 20 30 10 20 20 20
20 20 30 10 18 0 0

*/