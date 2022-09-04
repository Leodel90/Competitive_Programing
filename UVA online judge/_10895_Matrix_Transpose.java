import java.util.*;
public class _10895_Matrix_Transpose {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        try{
        	while(true){
        		int m = leer.nextInt();
        		int n = leer.nextInt();
        		LinkedList<Integer> T[]= new LinkedList[n];
        		LinkedList<Integer> I[]= new LinkedList[n];
        		for (int i = 0; i < m; i++){
					int r=leer.nextInt();
					LinkedList<Integer> R= new LinkedList<Integer>();
					for (int j = 0; j < r; j++) 
						R.add(leer.nextInt());
					for (int j = 0; j < r; j++){
						int x=leer.nextInt();
						int p=R.remove()-1;
						if(T[p]==null){T[p]= new LinkedList<Integer>();I[p]=new LinkedList<Integer>();}
						T[p].add(x);
						I[p].add(i+1);
					}
				}
        		System.out.println(n+" "+m);
        		for (int j = 0; j < n; j++){
					if(T[j]!=null){
				      System.out.print(T[j].size());
				      while(!I[j].isEmpty())System.out.print(" "+I[j].remove());
				      System.out.println();
				      System.out.print(T[j].remove());
				      while(!T[j].isEmpty())System.out.print(" "+T[j].remove());
					}else System.out.println(0);
					System.out.println();
				}
        	}
        }catch(Exception e){}
	}
}
