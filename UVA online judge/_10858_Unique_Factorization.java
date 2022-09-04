import java.util.*;
public class _10858_Unique_Factorization{
	static LinkedList<Integer> R[];
	static int c;
	public static void F(int x,int a){
		int s=c;
	     while(true){
	    	 double b=x;b/=a;
	    	 if(a<=b){
	    	   if((int)b==b){
	    		   F((int)b,a);
	    		   for (int i = s; i < c; i++)R[i].addFirst(a);
				   s=c;
	    		}a++;
	    	   }else break; 
	     }
	     R[c]=new LinkedList<Integer>();
	     R[c].add(x);c++;
	}
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		while(true){
		   int n = leer.nextInt();
		   if(n==0)break;
		   R= new LinkedList[n+1];
		   c=0;
		   F(n,2);
		   System.out.println(c-1);
		   for (int i = 0; i < c-1; i++){
			   System.out.print(R[i].remove());
			   while(!R[i].isEmpty())System.out.print(" "+R[i].remove());   
			   System.out.println();
		   }
		}
	}
}
