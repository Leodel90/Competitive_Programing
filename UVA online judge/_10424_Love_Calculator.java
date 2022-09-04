import java.text.DecimalFormat;
import java.util.*;
public class _10424_Love_Calculator {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			String a =leer.nextLine();
			String b = leer.nextLine();
			int A=0,B=0;
			for (int i = 0; i < a.length(); i++){
				if(a.charAt(i)>=65&& a.charAt(i)<=91 || a.charAt(i)>=97&&a.charAt(i)<=123){
				        if(a.charAt(i)>=65&& a.charAt(i)<=91)A+=a.charAt(i)-64; else A+=a.charAt(i)-96;}
		    }
			for (int i = 0; i < b.length(); i++){
				if(b.charAt(i)>=65&& b.charAt(i)<=91 || b.charAt(i)>=97&&b.charAt(i)<=123){
				        if(b.charAt(i)>=65&& b.charAt(i)<=91)B+=b.charAt(i)-64; else B+=b.charAt(i)-96;}
		    }
			int c =0,s;
			while(c!=A){c=A;s=0;
				while(A!=0){
					s=s+A%10;
					A=A/10;
				}
				A=s;
			}
			c=0;
			while(c!=B){c=B;s=0;
				while(B!=0){
					s=s+B%10;
					B=B/10;
				}
				B=s;
			}
			DecimalFormat R= new DecimalFormat("0.00");
			String r=R.format(((double)(Math.min(A,B))/Math.max(A,B))*100);
			r=r.substring(0,r.length()-3)+'.'+r.substring(r.length()-2, r.length())+" %";
			System.out.println(r);
		}
	}
}
