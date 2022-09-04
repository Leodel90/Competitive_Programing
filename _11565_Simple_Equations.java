import java.util.*;
public class _11565_Simple_Equations {
	public static void main(String[] args){
	   Scanner leer = new Scanner(System.in);
       int n = leer.nextInt();
       for (int i = 0; i < n; i++){int x=0,y=0,z=0;
    	   int A = leer.nextInt(),B=leer.nextInt(),C=leer.nextInt();
    	   boolean q = false;
    	   int l=21;x=-l;
    	   while(x<=l){
    		   int r1=A*x-x*x, r2=4*x*B;
    		   if(r1*r1>=r2){
    			   double r = Math.sqrt(r1*r1-r2);
    			   if((int)r==r){
    				   if(r!=Math.abs(r1)){
    					   double yr=(r1-(int)r)/(2*x);
    					   if((int)yr==yr){
    						y=(int)yr; 
    						if(x*x+y*y<C&&y!=x){z=A-y-x;
    						if(x*x+y*y+z*z==C&&z!=y&&z!=x){q=true;break;}
    						}
    					   }
    					   yr=(r1+(int)r)/(2*x);
    					   if((int)yr==yr){
    						   y=(int)yr;
    						   if(x*x+y*y<C&&y!=x){z=A-y-x;
    						   if(x*x+y*y+z*z==C&&z!=y&&z!=x){q=true;break;}
    						   }
    					   }
    				   }
    			    }
    		  }x++;
    	}
    	   TreeSet<Integer> R= new TreeSet<Integer>();
    	   R.add(x);R.add(y);R.add(z);
    	   if(q)System.out.println(R.pollFirst()+" "+R.pollFirst()+" "+R.pollFirst());
    	   else System.out.println("No solution.");
	}
	}
}

