import java.util.*;
public class Palindrome_extendido{
	public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        while(leer.hasNext()){
        	String cad= leer.next();
        	if(cad.charAt(0)!='E'){
        	int i=0 ,x=-1,t=cad.length()-1,j=t;
        	int pal[]=new int[cad.length()];
             while(i<j){
            	 if(cad.charAt(i)!=cad.charAt(j)){j=t;x=i;}
            	 else j--;
              pal[i]=cad.charAt(i);
              i++;
             }
             System.out.print(cad);
            while(x>=0){
            	System.out.print((char)pal[x]);
                x--;
            }
            System.out.println();
        }
        }

	}
}
