import java.util.*;
public class _00447_Population_Explosion{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int X[]={-1,-1,-1,0,0,1,1,1};
		int Y[]={-1,0,1,-1,1,-1,0,1};
		int t=leer.nextInt();
		for (int xd = 0; xd <t; xd++){
			if(xd>0)System.out.println();
		int y= leer.nextInt();
		leer.nextLine();
		char P[][]= new char[20][20];
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) 
				P[i][j]=' ';
		}
		
        try{
        	while(true){String cad = leer.nextLine();
        	if(cad.length()>0){
        		StringTokenizer L= new StringTokenizer(cad);
        		P[Integer.parseInt(L.nextToken())-1][Integer.parseInt(L.nextToken())-1]='O';}else break;}
        }catch(Exception e){}
        System.out.println("********************");
        while(y>0){y--;
            char C [][]= new char[20][20]; 
        	for (int i = 0; i <20; i++){
				for (int j = 0; j <20; j++){
					int c=0;C[i][j]=' ';
					for (int k = 0; k < 8; k++){
						int a=i+X[k],b=j+Y[k];
						if(a>=0&&b>=0&&a<20&&b<20&&P[a][b]=='O')c++;
					}
					if(P[i][j]=='O'){if(c==2||c==3)C[i][j]='O';}
					else {if(c==3)C[i][j]='O';}
				}
			}
        	for (int i = 0; i < 20; i++) {
				for (int j = 0; j < 20; j++) {System.out.print(P[i][j]);	
					P[i][j]=C[i][j];}System.out.println();
			}
        	if(y>0)System.out.println("********************");
        }
        System.out.println("********************");
		}
	}
}

/*
1

3
5 4
5 5
5 6 
5 7  

2

3
5 4
5 5
5 6
5 7

3
5 4
5 5
5 6
5 7


*/