import java.util.*;
public class _10813_Traditional_BINGO {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int x = 0; x < t; x++) {
        	int C[]= new int[5];
        	int R[]= new int[5];
        	int F[]= new int [76];
        	boolean DL[]= new boolean[76];
        	boolean DR[]= new boolean[76];
			for (int i = 1; i <=5; i++){
				for (int j = 1; j <=5; j++){
					if(i!=3 || j!=3){
						int f= leer.nextInt();
					F[f]=i;
					DL[f]=i==j;
					DR[f]=i+j==6;
					}
				}
			}
			int c=0,dl=1,dr=1;
			C[2]=1;R[2]=1;
			boolean w=false;
			for (int i = 0; i < 75; i++){				
						int n=leer.nextInt();
                        if(!w){ 
                        	c++;
						if(F[n]-1==(n-1)/15)
						dl++;
						if(F[n]-1+(n-1)/15==4)
						dr++;
						if(F[n]>0){
							R[F[n]-1]++;
							C[(n-1)/15]++;
							w=C[(n-1)/15]==5||R[F[n]-1]==5||dl==5||dr==5;
						}else w=dl==5||dr==5;
						
						}					
			}
			System.out.println("BINGO after "+c+" numbers announced");
		}
	}
}


