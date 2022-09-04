import java.util.*;
public class _11926_Multitasking {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(true){
			int n = leer.nextInt();
			int m = leer.nextInt();
		    if(n+m==0)break;
			int V[]= new int [1000001];
			boolean q=true;
			for (int i = 0; i < n; i++){
				int a = leer.nextInt(),b=leer.nextInt();
				q=(V[a]==0||V[a]==3)&&(V[b]==0||V[b]==2)&&q;
				if(q){V[a]+=2;V[b]+=3;
					while(q){a++;
						if(a<b){q=V[a]==0;
							if(q)V[a]=1;
						}else break;
					}
				}
			}
			for (int i = 0; i < m; i++){
				int a = leer.nextInt(),b=leer.nextInt(),r=leer.nextInt();
				q=b-a<=r&&q;
				if(q){
					while(a<=1000000&&q){
						q=(V[a]==0||V[a]==3)&&(b<=1000000&&(V[b]==0||V[b]==2)||b>1000000);
						if(q){V[a]+=2;
						if(b<=1000000)V[b]+=3;
						int y=a;
						while(q){y++;
						   if(y<b&&y<=1000000){
							   q=V[y]==0;
							   if(q)V[y]=1;
						   }else break;
						}
						}else break;
						a=a+r;b=b+r;
					}
				}
			}
			if(q)System.out.println("NO CONFLICT");
			else System.out.println("CONFLICT");
		}
	}
}
