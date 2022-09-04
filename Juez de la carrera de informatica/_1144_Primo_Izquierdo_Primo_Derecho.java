import java.util.*;
public class _1144_Primo_Izquierdo_Primo_Derecho{
    static boolean primos[];
    static int I[], D[],x,l=1;
	public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
		primos= new boolean[1000004];
		I= new int[1000004];
		D= new int[1000004];
        int n = leer.nextInt();
        for (int t = 0; t < n; t++){
			x = leer.nextInt();
			if(x>l)Criba();
			System.out.println(I[x]+D[x]);
		}
	}
	public static  void Criba(){
		boolean q=true;
		int u=l,i=l+1;
		 while(x>l){
			if(!primos[i]){
				l=i;
				for (int j = i+i; j <=1000003; j=j+i)primos[j]=true;
				for (int j = u+1; j <=i; j++)D[j]=i;
				u=i;
				
			}else I[i]=u;
			i++;
		}
	 }
}
