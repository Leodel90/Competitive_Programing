import java.util.*;
public class _12291_Polynomio_Composer {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(true){
			int n = leer.nextInt(),cn=0;
			int m = leer.nextInt(),cm=0;
			leer.nextLine();
			if(n+m==0)break;
			char N[][]=new char [n][n]; 
			int MX[]= new int [m*m];
			int MY[]= new int[m*m];
			boolean p=true;
			for (int i = 0; i < n; i++){
				String h= leer.nextLine();
				if(h.length()==n){
				for (int j = 0; j < h.length(); j++){N[i][j]=h.charAt(j);
					if(N[i][j]=='*')cn++;
				}
				}else p=false;
			}
			for (int i = 0; i < m; i++){String h= leer.nextLine();
			    if(h.length()==m){
				for (int j = 0; j < m; j++){
					if(h.charAt(j)=='*'){MX[cm]=i;MY[cm]=j;cm++;}
				}
				}else p=false;
			}
			boolean q = false;
			if(cm*2==cn&&p){q=true;
					for (int i = 0; i < n&&q; i++){
						for (int j = 0; j < n&&q; j++){
							if(N[i][j]=='*'){
								int a=MX[0]-i,b=MY[0]-j;
							    for (int k = 0; k < cm; k++){int x=MX[k]-a,y=MY[k]-b;
								    q=x>=0&&x<n&&y>=0&&y<n&&N[x][y]=='*';
								    if(q)N[x][y]='.';else break;
							    }
							}
						}
				   }
			}
			if(q&&p)System.out.println(1);
			else System.out.println(0);
		}
	}
}


