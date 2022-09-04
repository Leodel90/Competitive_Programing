import java.util.*;
public class _1188_Niños_Traviesos{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
	try{
			while(leer.hasNext()){
				int n= leer.nextInt();
				int s=0,p=9,d=1,p9=9;
				while(n>p){n=n-p;
					s+=p9;d++;
					p9=p9*10;
					p=p9*d;
				}
				double f= (double)n/(double)d;
				if((int)f<f)f++;
				s=s+(int)f;
				int m=(n%d)-1;
				if(m<0)m=d-1;
				System.out.println((s+"").charAt(m));
				
			}
		}catch(Exception e){
			
		}
	}
}
