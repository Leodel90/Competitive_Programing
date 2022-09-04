import java.util.*;
public class _10082_WERTYU {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String T[]= new String[4];
		T[0]="`1234567890-=";
		T[1]="QWERTYUIOP[]"+(char)92;
		T[2]="ASDFGHJKL;'";
		T[3]="ZXCVBNM,./";
		try{
		while(leer.hasNextLine()){
			String cad = leer.nextLine(),R="";
			for (int k = 0; k < cad.length(); k++){
				char r = cad.charAt(k);
				if(r!=' '){boolean q=true;
		        for (int i = 0; i < 4&&q; i++){
			     for (int j = 0; j < T[i].length()&&q; j++){
				     if(T[i].charAt(j)==r){
				    	 q=false;
                         if(j>0)
				    	 r=T[i].charAt(j-1);
				     }
			     }
			     }
		     }
				R+=r; 
		}
		System.out.println(R);
		}
		}catch(Exception e){
			
		}
	}
}
