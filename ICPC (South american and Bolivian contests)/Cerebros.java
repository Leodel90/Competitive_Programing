import java.util.*;
public class Cerebros {
//Concurso 143
	static char M [][];
 	public static void Zona(int x,int y){
 		 M[x][y]='*';
 		if(M[x-1][y-1]=='@')Zona(x-1,y-1);
 		if(M[x-1][y]=='@')Zona(x-1,y);
 		if(M[x-1][y+1]=='@')Zona(x-1,y+1);
 		if(M[x][y-1]=='@')Zona(x,y-1);
 		if(M[x][y+1]=='@')Zona(x,y+1);
 		if(M[x+1][y-1]=='@')Zona(x+1,y-1);
 		if(M[x+1][y]=='@')Zona(x+1,y);
 		if(M[x+1][y+1]=='@')Zona(x+1,y+1);
 	}
	static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
          while(true){
        	  int n = leer.nextInt();
        	  int m = leer.nextInt();
        	  if(n!=0 || m !=0){
        		  M=new char[n+2][m+2];
        		  M[0][0]='*';M[0][m+1]='*';M[n+1][0]='*';M[n+1][m+1]='*';
        		  for (int i = 1; i <=n ; i++) {
        			 M[i][0]='*';M[i][m+1]='*'; 
					String cad = leer.next();
					for (int j = 1; j <=m; j++) {
						M[i][j]=cad.charAt(j-1);
					    M[0][j]='*';M[n+1][j]='*';
					}
        		  }int c = 0;
        		  for (int i = 1; i <=n ; i++) {
        			for (int j = 1; j <=m; j++) {
						if(M[i][j]=='@'){Zona(i,j);c++;}
					}  
        		  }System.out.println(c);
        	  }else break;
          }
          
/*
1 1
*
             
3 5 
*@*@* 
**@**
*@*@*
1 8
@@****@*
5 5 
****@ 
*@@*@ 
*@**@ 
@@@*@ 
@@**@ 
1 1
*
3 5 
*@*@* 
**@**
*@*@*
1 8
@@****@*
5 5 
****@ 
*@@*@ 
*@**@ 
@@@*@ 
@@**@ 


*/

	}

}
