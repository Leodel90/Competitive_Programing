import java.util.*;
public class _11309_Counting_Chaos{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
	    int t = leer.nextInt();
	    for (int i = 0; i < t; i++) {
			String cad = leer.next();
			int m=Integer.parseInt(""+cad.charAt(3)+cad.charAt(4));
			int h=Integer.parseInt(""+cad.charAt(0)+cad.charAt(1));
			boolean q=false;
			while(!q){
				m++;
				if(m==60){m=0;h++;if(h==24)h=0;}
				if(h==0){if(m!=0){cad=m+"";}else cad="0000";}
				else {cad=h+"";if(m<10)cad=cad+"0";cad=cad+m;}
				q=true;
				for (int j = 0; j < cad.length()>>1&&q; j++)
					q=cad.charAt(j)==cad.charAt(cad.length()-j-1);
			}
			String f="";
			if(cad.length()==1)f="000";
			if(cad.length()==2)f="00";
			if(cad.length()==3)f="0";
			cad=f+cad;
			System.out.println(""+cad.charAt(0)+cad.charAt(1)+":"+cad.charAt(2)+cad.charAt(3));
		}
	}
}
