import java.util.*;
public class _10945_Mother_Bear {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
		 String cad = leer.nextLine();
		 if(!cad.equals("DONE")){
			 int i =0, j=cad.length()-1;
			 char x='-',y='-';
			 boolean q=true;
			 while(i<=j&&q){
				 if(x=='-'){
				 if(cad.charAt(i)>=65&&cad.charAt(i)<=91)x=cad.charAt(i);
				 if(cad.charAt(i)>=97&&cad.charAt(i)<=123)x=(char)(cad.charAt(i)-32);
				 i++;
				 }
				 if(y=='-'){
				 if(cad.charAt(j)>=65&&cad.charAt(j)<=91)y=cad.charAt(j);
				 if(cad.charAt(j)>=97&&cad.charAt(j)<=123)y=(char)(cad.charAt(j)-32);
				 j--;
				 }
				 if(x!='-'&&y!='-'){
					 q=x==y;x='-';y='-';
				 }
			 }
			 if(q)System.out.println("You won't be eaten!");
			 else System.out.println("Uh oh..");
		 }else break;
		}
	}
}
