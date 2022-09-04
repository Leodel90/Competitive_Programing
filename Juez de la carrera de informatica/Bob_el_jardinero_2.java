import java.util.*;
import java.text.DecimalFormat;
public class Bob_el_jardinero_2 {
	public static void main(String[] args) {
	  try{
		  Scanner leer = new Scanner (System.in);
			    int t = leer.nextInt();
			    DecimalFormat res = new DecimalFormat("0.00");
			    leer.nextLine();
			    for (int xd = 1; xd <=t; xd++) {
				String cad = leer.nextLine();
					double a=0,e=0,i=0,o=0,u=0;
					int c = cad.length();
					int j=0;int x =0;
					while (x<c){
						char v = cad.charAt(x);
						if(v>=65 && v<=91 || v>=97&& v<=123){
						if(v=='a')a++;
						if(v=='e')e++;
						if(v=='i')i++;
						if(v=='o')o++;
						if(v=='u')u++;
						j++;
						}x++;
					}
					a=a*100/j;
					e=e*100/j;
					i=i*100/j;
					o=o*100/j;
					u=u*100/j;
				    System.out.println("Caso "+xd+":");
				    System.out.println("a= "+res.format(a));
				    System.out.println("e= "+res.format(e));
				    System.out.println("i= "+res.format(i));
				    System.out.println("o= "+res.format(o));
				    System.out.println("u= "+res.format(u));
				}
	  }catch(Exception E){}
	}

}
/*
3
aeiou
ujigohaves
up

*/
