import java.text.DecimalFormat;
import java.util.*;
public class _11348_Exhibition{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int k = leer.nextInt();
		DecimalFormat F= new DecimalFormat("0.000000");
		for (int xd = 1; xd <=k; xd++){
			int n = leer.nextInt();
			double N[]= new double[n+1],t=0;
			int S[]= new int[10001];
			for (int i = 1; i <=n; i++){
				int m = leer.nextInt();
				for (int j = 0; j < m; j++){int s =leer.nextInt();
					if(S[s]!=0){if(S[s]!=-1&&S[s]!=i){N[S[s]]--;t--;S[s]=-1;}
					}else {S[s]=i;N[i]++;t++;}
				}
			}
			System.out.print("Case "+xd+":");
			for (int i = 1; i <=n; i++){String r;
				if(t>0){r= F.format((N[i]*100/t));System.out.print(" "+r.substring(0,r.length()-7)+"."+r.substring(r.length()-6,r.length())+"%");}
				else System.out.print(" 0.000000%");
			}
			System.out.println();
		}
	}
}
/*
3
3
3 1 2 3
2 4 5
3 4 2 6
3
3 1 2 3
2 4 5
2 4 2
5
3 458 567 12
5 1234 7 132 78 23
2 345 67
1 3
2 1234 12


*/