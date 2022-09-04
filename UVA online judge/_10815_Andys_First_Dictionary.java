import java.util.*;
public class _10815_Andys_First_Dictionary {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
         TreeSet<String> D= new TreeSet<String>();
         try{while(true){
        		 String cad = leer.nextLine()+" ",p="";
        		 for (int i = 0; i < cad.length(); i++){
					char x =  cad.charAt(i);
					if((x<65||x>90)&&(x<97||x>122)){
						if(p.length()>0){
						D.add(p);p="";
						}
					}else{if(x<97)p+=(char)(x+32);else p+=x;}
				}
        	 }
         }catch(Exception e){}
         while(!D.isEmpty())System.out.println(D.pollFirst());
	}
}/*
Adventures in Disneyland

Two blondes were going to Disneyland when they came to a fork in the
road. The sign read: "Disneyland Left."

So they went home.

*/
