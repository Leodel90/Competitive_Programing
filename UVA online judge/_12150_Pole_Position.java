import java.util.*;
public class _12150_Pole_Position {
	public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         while(true){
        	 int n = leer.nextInt();
        	 if(n==0)break;
        	 int C[]= new int [n];        	 
        	 boolean q=true;
        	 for (int i = 0; i < n; i++){
				int c = leer.nextInt();
				int p= i+leer.nextInt(); 
				q=q&&p>=0&&p<n&&C[p]==0;
				if(q)C[p]=c;
			}
        	 if(q){
        		 for (int i = 0; i < n; i++) {
					if(i!=0)System.out.print(" ");
					System.out.print(C[i]);
				}System.out.println();
        	 }else System.out.println(-1);
         }   
	}
}
/*
4
1 0
3 1
2 -1
4 0
4
22 1
9 1
13 0
21 -2
3
19 1
9 -345
17 0
7
2 2
8 0
5 -2
7 1
1 1
9 1
3 -3
0
*/