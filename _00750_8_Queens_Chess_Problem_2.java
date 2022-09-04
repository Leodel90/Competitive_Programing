import java.util.*;
public class _00750_8_Queens_Chess_Problem_2 {
    static int a,b,i,CR[],r;
    static boolean F[],DD[],DI[];
    public static void Backtracking(){
    	if(i==9){
    	if(r<10)System.out.print(" ");
    	System.out.print(r+"      ");
    	r++;
    	for (int k = 1; k <=7; k++){System.out.print(CR[k]+" ");}System.out.println(CR[8]);
    	return;}
        if(i==b){i++;Backtracking();i--;return;}
        for (int j = 1; j <=8; j++){
			if(!F[j]&&!DD[j-i+8]&&!DI[i+j-1]){F[j]=true;DD[j-i+8]=true;DI[i+j-1]=true;CR[i]=j;i++;
				Backtracking();i--;
				F[j]=false;DD[j-i+8]=false;DI[i+j-1]=false;
			}
		}
    }
	public static void main(String[] args){
	Scanner leer = new Scanner(System.in);
	int T= leer.nextInt();
	for (int xd = 0; xd < T; xd++){
    a=leer.nextInt();b=leer.nextInt();
    F= new boolean[9];DD= new boolean[16];DI= new boolean[16];CR= new int[9];
    F[a]=true;DD[a-b+8]=true;DI[a+b-1]=true;CR[b]=a;
    i=1;r=1;
    if(xd>0)System.out.println();
    System.out.println("SOLN       COLUMN");
    System.out.println(" #      1 2 3 4 5 6 7 8");
    System.out.println();
    Backtracking();
	}
	}
}
