import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class _11991_Easy_Problem_from_Rujia_Liu {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{while(true){
			StringTokenizer A= new StringTokenizer(br.readLine());
			int n= Integer.parseInt(A.nextToken()),m=Integer.parseInt(A.nextToken());
		    int N[]= new int[1000000];
		    LinkedList<Integer> L= new LinkedList<Integer>();
		    LinkedList<Integer> T= new LinkedList<Integer>();
		    A= new StringTokenizer(br.readLine());
		    for (int i = 0; i < n; i++){
				int x = Integer.parseInt(A.nextToken());
		        if(N[x]==0)L.add(x);
		        N[x]++;
		        T.add(x);
			}
		    E R[]= new E[1000000];
		   while(!L.isEmpty()){
			   int x =L.remove();
			   R[x]=new E(N[x]);
		   }
		   int p=1;
		   for (int i = 0; i < m; i++){
			   A= new StringTokenizer(br.readLine());
			  int k = Integer.parseInt(A.nextToken()),v=Integer.parseInt(A.nextToken());
			  if(N[v]>=k){
				  while(R[v].p<k){
					  int x=T.remove();
					  R[x].O[R[x].p]=p;
					  R[x].p++;
					  p++;
				  }System.out.println(R[v].O[k-1]);
			  }else System.out.println(0);
		   }
		}
		}catch(Exception e){}
	}
	public static class E{
		int O[];
		int p;
		public E(int t){
			O= new int[t];
			p=0;
		}
	} 
}
