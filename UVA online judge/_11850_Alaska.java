import java.util.*;
public class _11850_Alaska {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(true){
        	int n = leer.nextInt();
        	if(n==0)break;
        	boolean S[]= new boolean[1423];
        	for (int i = 0; i < n; i++)S[leer.nextInt()]=true;
			int p=0;
			boolean f=true;
			while(f){
				if(p>=1322)break;
				p++;
				int l=p+200;f=false;
				while(p<l&&p<1423){
					if(S[p]){f=true;break;}
					p++;
				}
			}
			if(f)System.out.println("POSSIBLE");
			else System.out.println("IMPOSSIBLE");
        }
	}
}
