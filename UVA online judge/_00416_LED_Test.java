import java.io.*;
import java.util.Scanner;
public class _00416_LED_Test {
	public static void main(String[] args) throws NumberFormatException, IOException {
		PrintWriter pw= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		Scanner leer =new Scanner (System.in);
		int N[]={126,48,109,121,51,91,95,112,127,123}; 
		while(true){
			int n= leer.nextInt();
			if(n==0)break;
			int V[]= new int[n];
			String C;
			boolean r=true;
			for (int i = 0; i < n; i++){C=leer.next();
				for (int j = 0; j < 7; j++){
					r=r&&(C.charAt(j)=='Y'||C.charAt(j)=='N');
					if(r){
						if(C.charAt(j)=='Y')V[i]=V[i]|(1<<(6-j));
					}
				}
			}
			if(r){
				for(int i=9,p=0,v=127,j=i; r&&n-1<=i; p=0,v=127,i--,j=i){
						while(r&&(N[j]&V[p])==V[p]&&(v|V[p])==v){
								v=v&~((N[j]&~V[p]));p++;j--;r=p<n;
						}
				}
			}else r=true;
			if(r)pw.println("MISMATCH");
			else pw.println("MATCH");
		}
		pw.close();	
	}
}

/*

1
YYYYYYY
2
NNNNNNN
NNNNNNN
2
YYYYYYY
YYYYYYY
3
YNYYYYY
YNYYNYY
NYYNNYY
3
YNYYYYN
YNYYNYN
NYYNNYN
3
YNYYYYN
YNYYNYN
NYYNYYN
4
YYYYYYY
NYYNNNN
NNYYYYN
NNNYNNN
3
NNNNNNN
YNNNNNN
NNNNYNN
0

*/