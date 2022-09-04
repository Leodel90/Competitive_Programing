import java.util.*;
public class jurado_despistado_TAP_2014 {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
			int n = leer.nextInt();
			LinkedList<Integer> R = new LinkedList<>();
			R.push(n);
			boolean E[]= new boolean[n+2];
			int H[]= new int[n+2];
			for (int i = 0; i < n; i++)
				H[i]=leer.nextInt();
			for (int j = n-1; j>0; j--){
		      if(H[j]+j<n){
		    	  E[j]=H[j]+j==n-1||E[H[j]+j+1];
		    	  if(E[j])R.push(j);
		      }
			}
			while(!R.isEmpty()){
				System.out.println(R.pop());
			}
	}
}
