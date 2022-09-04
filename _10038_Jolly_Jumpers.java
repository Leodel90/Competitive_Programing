import java.util.*;
public class _10038_Jolly_Jumpers {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        try{
        	while(true){
        		int n = leer.nextInt();
        		boolean J[]= new boolean[n];
        		int ant=0;
        		if(n>=1)ant=leer.nextInt();
        		boolean q= n!=0;
        		for (int i = 2; i <=n; i++){
        			int a=leer.nextInt();
					int b=Math.abs(a-ant);
					if(b>=1&&b<=n-1){
						q=!J[b]&&q;
						J[b]=true;
					}else q=false;
					ant=a;
				}
        		for (int i = 1; i <n&&q; i++)
					q=J[i];
				if(q)System.out.println("Jolly");
				else System.out.println("Not jolly");
        	}
        }catch(Exception e){}
	}
}
