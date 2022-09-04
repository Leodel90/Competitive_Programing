import java.util.*;
public class _10703_Free_spots {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(true){
        	int w = leer.nextInt();
        	int h = leer.nextInt();
        	int n = leer.nextInt();
        	if(w+h+n==0)break;
        	int s=w*h;
        	boolean M[][]= new boolean[w+1][h+1];
        	for (int i = 0; i < n; i++){
				int x1=leer.nextInt();
				int y1=leer.nextInt();
				int x2=leer.nextInt();
				int y2=leer.nextInt();
				if(x1>x2||y1>y2){
					int y,x;
						if(y1>y2){y=y1;y1=y2;y2=y;}
						if(x1>x2){x=x2;x2=x1;x1=x;}
				}
				for (int j = x1; j <=x2; j++){
					for (int k = y1; k <=y2; k++){
						if(!M[j][k]){M[j][k]=true;s--;}
					}
				}
			}
        	if(s>0){if(s>1)System.out.println("There are "+s+" empty spots.");
        	else System.out.println("There is one empty spot.");
        	}
        	else System.out.println("There is no empty spots.");
        }
	}
}

