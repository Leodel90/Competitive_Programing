import java.util.*;
public class _00696_How_Many_Knights {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
       while(leer.hasNext()){
    	   int n = leer.nextInt();
    	   int m = leer.nextInt();
    	   if(n>0||m>0){
    		   if(n>1 && m>1){
    		   if(n==2 || m ==2){int r;
    			   if (n!=2)r=(n-1);else r=(m-1);
    			   int s=2;
    			   if(r%4!=0)s=4;
    			   System.out.println((r/4)*4+s+" knights may be placed on a "+n+" row "+m+" column board.");
    		   }else System.out.println(((n*m +(n*m)%2)/2)+" knights may be placed on a "+n+" row "+m+" column board.");
    		   }else System.out.println(n*m+" knights may be placed on a "+n+" row "+m+" column board.");
    	   }else break;
       }
	}
}
