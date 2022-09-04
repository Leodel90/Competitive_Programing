import java.util.*;
public class _10098_Generating_Fast_Sorted_Permutation {
	static TreeSet<String>P;
	static char T[],C[];
	static boolean V[];
	static int r,n;
	public static void Permuta(){
		if(r==n){
			String R="";
			for (int i = 0; i < n; i++)
				R=R+C[i];
				P.add(R);
			return;
		}
		boolean K[]= new boolean [62];
		for (int i = 0; i < n; i++){
			if(!V[i]){
				V[i]=true;
				int p;
				if(T[i]>57){
					if(T[i]>=97)p=T[i]-71;
					else p=T[i]-65;
				}else p=T[i]+4;
				if(!K[p]){
					K[p]=true;
				C[r]=T[i];
				r++;
				Permuta();
				r--;
				}
				V[i]=false;
			}
		}
	}
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t= leer.nextInt();
        for (int i = 0; i < t; i++){
              String cad = leer.next();
              P= new TreeSet<String>();
              n=cad.length();
              T= new char[n];
              C= new char[n];
              V= new boolean[n];r=0;
              for (int j = 0; j < n; j++)
				T[j]=cad.charAt(j);
			   Permuta();
			   while(!P.isEmpty())System.out.println(P.pollFirst());
			   System.out.println();
		}
	}
}
