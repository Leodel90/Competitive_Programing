import java.util.*;
public class _11040_Add_bricks_in_the_wall {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
        int n = leer.nextInt();
        for (int xd= 0; xd < n; xd++){
             int W[][]= new int [9][9];
             for(int i = 0,k=1; i < 9; i=i+2){
				for(int j = 0; j<k; j=j+2)W[i][j]=leer.nextInt();
				k=k+2;
			 }
             for(int i = 0; i < 9;i++){if(i%2==0&&i<7){
			   	for (int j = 0; j <=i; j++){
			   		if(j%2==0){
			   			W[i+2][j+1]=(W[i][j]-W[i+2][j]-W[i+2][j+2])/2;
			   			W[i+1][j]=W[i+2][j+1]+W[i+2][j];
			   			W[i+1][j+1]=W[i+2][j+1]+W[i+2][j+2];
			   		}if(j!=0)System.out.print(" ");
			   		System.out.print(W[i][j]);
				}
			   	}else{
			   		for (int j = 0; j <=i; j++){
			   			if(j!=0)System.out.print(" ");
				   		System.out.print(W[i][j]);	
					}
			   	}
             System.out.println();
			 }
		}
	}
}
