import java.util.*;
public class UMSA_WORD {
	public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
          while(leer.hasNext()){
        	  int n = leer.nextInt();
        	  String basura=leer.nextLine();
        	  for (int i = 0; i < n; i++) {
				int pa[]=new int [7];
				String cad=leer.nextLine();
				for (int j = 0; j < cad.length(); j++) {
					if(cad.charAt(j)=='A')pa[0]++;
					if(cad.charAt(j)=='C')pa[1]++;
					if(cad.charAt(j)=='I')pa[2]++;
					if(cad.charAt(j)=='M')pa[3]++;
					if(cad.charAt(j)=='P')pa[4]++;
					if(cad.charAt(j)=='S')pa[5]++;
					if(cad.charAt(j)=='U')pa[6]++;
				}
				if(pa[0]>=1 && pa[1]>=2 && pa[2]>=1 && pa[3]>=1 && pa[4]>=1 && pa[5]>=1 && pa[6]>=1)System.out.println("ES POSIBLE"); 
				else System.out.println("NO ES POSIBLE");
        	  }
          }
	}
}
/*
3
UMSAICPC
ICPCUMSA
ICPCUMSHJK

 
*/
