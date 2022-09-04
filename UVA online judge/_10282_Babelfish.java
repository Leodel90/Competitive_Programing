import java.util.*;
public class _10282_Babelfish {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		TreeMap<String, String> D= new TreeMap<String, String>();
		while(true){
			String cad = leer.nextLine(),P[]=new String [2];
			if(cad.length()==0)break;P[0]="";
			for (int i = 0,k=0; i < cad.length(); i++){
				char x = cad.charAt(i);
				if(x==' '){k++;P[k]="";}
				else P[k]+=x;
			}
			D.put(P[1], P[0]);
		}
        try{
        	while(true){
        		String cad = leer.next();
        		if(D.containsKey(cad))System.out.println(D.get(cad));
        		else System.out.println("eh");
        	}
        }catch(Exception e){}
	}
}
/*
dog ogday
cat atcay
pig igpay
froot ootfray
loops oopslay

atcay
ittenkay
oopslay
*/