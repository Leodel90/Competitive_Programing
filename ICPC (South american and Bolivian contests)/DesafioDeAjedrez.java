import java.util.*;
public class DesafioDeAjedrez {
//Concurso 143
	static int x[];
	static int c[];
	static int dd[];
	static int di[];
	static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
	 while(leer.hasNext()){
		int s=0;
	    int n = leer.nextInt();
		int m[][]=new int [n][n];
		// la matriz m sirve para verificar !!!!!!
		x=new int [n];
		c=new int [n];
		dd=new int [2*n-1];
		di=new int [2*n-1];
	    int i =0;
	    int j =0;
	    while(i>=0){
	     while(j<n){
	    	if(c[j]==0 && dd[i-j+n-1]==0 && di[j+i]==0){
	    		 m[i][j]=1;x[i]=j;c[j]=1;dd[i-j+n-1]=1;di[j+i]=1;i++;
	    		 j=0;break;     
	    	 }else j++;
	     }
	     if(j==n || i==n){
	    	 if(i==n){System.out.println();
	    	 for (int k = 0,o; k < n; k++) {
	    		 o=x[k]+1;
	    		 System.out.print(o+" ");
	    	  }
	    	  s++;
	    	 }
	    	 i--;
	    	 if(i>=0){c[x[i]]=0;dd[i-x[i]+n-1]=0;di[i+x[i]]=0;j=x[i]+1;m[i][x[i]]=0;}	    			  
	     }
	   }System.out.println();
	    System.out.println(s);
	}
		
//--------------------
	}

}
