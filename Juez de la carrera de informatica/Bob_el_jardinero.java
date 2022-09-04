import java.util.*;
import java.text.DecimalFormat;
public class Bob_el_jardinero {
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		DecimalFormat P= new DecimalFormat("0.00");
		int p=1;
		char Voc[]={'a','e','i','o','u'};
		while(leer.hasNext()){
			String cad = leer.next();
			  if(cad.charAt(0)>=48 && cad.charAt(0)<=57){
                  p=1;
			}
			else{
	        int C = cad.length(); 
	    	double V[]= new double [5];
	    	boolean q=false;
	    	for(int j=0;j< cad.length() && !q;j++) {
					char c = cad.charAt(j);
					q=c>=48 && c<=57;
					if(q)C--;
					if(c=='a')V[0]++;
					if(c=='e')V[1]++;
					if(c=='i')V[2]++;
					if(c=='o')V[3]++;
					if(c=='u')V[4]++;
			}
				V[0]=V[0]/C*100;
	    		V[1]=V[1]/C*100;
	    		V[2]=V[2]/C*100;
	    		V[3]=V[3]/C*100;
	    		V[4]=V[4]/C*100;
			    System.out.println("Caso "+p+":");
				String c;
			    for (int i = 0; i < 5 ; i++) {
					cad=P.format(V[i]);
					c="";
					for (int j = 0; j < cad.length(); j++) {
						if(cad.charAt(j)==',')c=c+".";
						else c=c+cad.charAt(j);
					}
				    System.out.println(Voc[i]+"= "+c);
			    }
				if(q)p=1;
			  else p++;
			  }
	     }
	}
}
/*
3
aeiou
ujigohaves
up
3
aeiou
ujigohaves
up
*/