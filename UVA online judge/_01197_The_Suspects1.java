import java.util.*;
public class _01197_The_Suspects1{
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
         while(true){
        	 int n = leer.nextInt();
        	 int m = leer.nextInt();
        	 if(n+m==0) break;
        	 boolean S[]= new boolean[n];
        	 LinkedList<Integer> L= new LinkedList<Integer>();
        	 LinkedList<Integer> G[]= new LinkedList[m];
        	 LinkedList<Integer> E[]= new LinkedList[n];
        	 int c =1;S[0]=true;
        	 for (int i = 0; i < m; i++){
				int k = leer.nextInt();G[i]= new LinkedList<Integer>();
				for (int j = 0; j < k; j++){
					 int x = leer.nextInt();
					 G[i].add(x);
					 if(E[x]==null)E[x]=new LinkedList<Integer>();
					 E[x].add(i);
				}
			}
        	 if(E[0]!=null)L.add(0);
        	 while(!L.isEmpty()){
        		 int x = L.remove();
        		 while(!E[x].isEmpty()){
        			 int y= E[x].remove();
        			 while(!G[y].isEmpty()){
        				 int e=G[y].remove();
        				 if(!S[e]){c++;S[e]=true;L.add(e);}
        			 }
        		 }
        	 }
        	 System.out.println(c);
         }
	}
}
