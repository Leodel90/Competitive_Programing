import java.util.*;
public class _11933_Splitting_Numbers {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
       while(true){
    	   int n=leer.nextInt();
    	   if(n==0)break;
    	   LinkedList<Integer>L= new LinkedList<Integer>();
    	   int p=1;
    	   while(n>0){
    		   if(n%2==1)L.add(p);
    		   n=n>>1;p=p<<1;
    	   }
    	   int a=0,b=0;
    	   boolean q=L.size()%2==1;
    	   while(!L.isEmpty()){
    		   b+=L.removeLast();
    		   if(L.isEmpty())break;
    		   a+=L.removeLast();
    	   }
    	   if(q)System.out.println(b+" "+a);
    	   else System.out.println(a+" "+b);
       }
	}
}
