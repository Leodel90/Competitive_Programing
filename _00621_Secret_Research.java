import java.util.*;
public class _00621_Secret_Research {
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for (int i = 0; i < t; i++) {
			String cad = leer.next();
			if(!cad.equals("4") && !cad.equals("1")&&!cad.equals("78")){
			     if(cad.length()>=2){
			    	 if(cad.charAt(cad.length()-2)!='3' || cad.charAt(cad.length()-1)!='5'){
			    		if(cad.charAt(0)!='9' || cad.charAt(cad.length()-1)!='4'){
			    			if(cad.length()>=3 && cad.substring(0,3).equals("190"))System.out.println("?");
			    		}else System.out.println("*"); 
			    	 }else System.out.println("-");
			     }
			}else System.out.println("+");
		}
	}
}


/*
12
19035
1902342432
92342424
111
444
7777777778
78787878
1123131
1
4
78
94949435

-
?
*
+
+
+
-

 
1
787835

-

*/