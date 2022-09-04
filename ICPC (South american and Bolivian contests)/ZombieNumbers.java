import java.util.*;
public class ZombieNumbers {
//Concurso 143
	static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
      while(true){
    	  int a = leer.nextInt();
    	  int b = leer.nextInt();
    	  if(a!=0 || b!=0){
    		  int c= 0; 
    		  while(a<=b){
    			  String x=a+"";
    			  boolean s = true;
      			  for(int i = 0; i<x.length()-1 && s; i++){
    		      s=x.charAt(i)>=x.charAt(i+1);
      			  }
      			  if(s){c++;System.out.println(a);}
    			  a++;
    		}System.out.println(c);
    	  }else break;
      }       

	}

}
