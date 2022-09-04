import java.util.*;
public class _10141_Request_for_Proposal {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int s =1;
		boolean t=false;
		while(leer.hasNext()){
			double n = leer.nextDouble();
			 int p= leer.nextInt();
			if(n+p>0){
			 leer.nextLine();
			 for (int i = 0; i < n; i++)
				leer.nextLine();
			 
			 String res="";
			 double max=0;
			 double pre=Double.MAX_VALUE;
			 for (int i = 0; i < p; i++){
				String cad = leer.nextLine();
				double d = Double.parseDouble(leer.next());
				double k= leer.nextDouble();
				leer.nextLine();
				for (int j = 0; j < k; j++)
					leer.nextLine();
				if(n!=0&&(k/n>max ||k/n==max&&pre>d)){
					max=k/n;pre=d;res=cad;
				}
			 }
			 if(t)System.out.println();
			 else t=true;
			 System.out.println("RFP #"+s);
			 System.out.println(res);
			 s++;
			 }
		}
	}
}
