import java.util.*;
public class _00541_Error_Correction {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(true){
        	int n = leer.nextInt();
        	if(n==0)break;
        	int C[]= new int [n];
        	int F[]= new int [n];
        	for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {int b=leer.nextInt();
					C[j]+=b;F[i]+=b;
				}
			}
        	int cf=0,cc=0,x=0,y=0;
        	for (int i = 0; i < n; i++){
				if(F[i]%2==1){cf++;x=i+1;}
				if(C[i]%2==1){cc++;y=i+1;}
			}
        	if(cf>0||cc>0){
        	if(cf==1&&cc==1)System.out.println("Change bit ("+x+","+y+")");
        	else System.out.println("Corrupt");
        	}else System.out.println("OK");
        }
	}
}
/*
4
1 0 1 0
0 0 0 0
1 1 1 1
0 1 0 1
4
1 0 1 0
0 0 1 0
1 1 1 1
0 1 0 1
4
1 0 1 0
0 1 1 0
1 1 1 1
0 1 0 1
0
*/