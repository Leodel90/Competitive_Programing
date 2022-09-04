import java.text.DecimalFormat;
import java.util.*;
public class _11945_Financial_Management {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);	
         int t= leer.nextInt();
         for (int i = 1; i <=t; i++) {
			double S= 0;
			for (int j = 0; j < 12; j++)
			S+=Double.parseDouble(leer.next());
			S=S/12;
			DecimalFormat A = new DecimalFormat("0.00"); 
			String s=A.format(S),R="."+s.charAt(s.length()-2)+s.charAt(s.length()-1);
			int j=s.length()-4;
			int c=0;
			while(j>=0){
				if(c==3){R=','+R;c=0;}
				R=s.charAt(j)+R;
				j--;c++;
			}
			System.out.println(i+" $"+R);
       }
	}
}

/*

2

100.00
489.12
12454.12
1234.10
823.05
109.20
5.27
1542.25
839.18
83.99
1295.01
1.75

500
500
500
500
500
500
500
500
500
500
500
500
*/