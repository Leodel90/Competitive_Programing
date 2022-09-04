import java.util.*;
public class _12239_Bingo {
	public static void main(String[] args) {
	   Scanner leer = new Scanner(System.in);
       while(leer.hasNext()){
    	   int n= leer.nextInt();
    	   int b = leer.nextInt();
    	   if(n+b>0){int c=n+1;
    	   boolean V[]= new boolean[c];
    			   int G[]= new int[b];
    			   for (int i = 0; i < b; i++){
    			      G[i]=leer.nextInt();
    			      if(!V[G[i]]){c--;V[G[i]]=true;}
    			      for(int j = i-1; j >=0; j--){
					        int h=Math.abs(G[i]-G[j]);
					        if(!V[h]){c--;V[h]=true;}
				      }
    			   }
    			   if(c==0)System.out.println('Y');
    			   else System.out.println('N');
    	   }else break;
       }
	}
}
