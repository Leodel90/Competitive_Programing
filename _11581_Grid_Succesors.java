import java.util.*;
public class _11581_Grid_Succesors{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int xd = 0; xd < t; xd++){
					int I=-1;
					int G[][]=new int [5][5];
					for (int i = 1; i <=3; i++) {String c =leer.next();
						for (int j = 1; j <=3; j++) 
							G[i][j]=c.charAt(j-1)-48;
					}
					while(true){
						int H[][]= new int [5][5];
						for (int i = 1; i <=3; i++){
							for (int j = 1; j <=3; j++) 
								H[i][j]=(G[i-1][j]+G[i+1][j]+G[i][j-1]+G[i][j+1])%2;
						}boolean q=false;
						for (int i = 1; i <=3; i++){
							for (int j = 1; j <=3; j++){
								q=q||H[i][j]!=G[i][j];
								G[i][j]=H[i][j];
							}
						}
						if(q)I++;
						else break;
					}
					System.out.println(I);
		}
	}
}
