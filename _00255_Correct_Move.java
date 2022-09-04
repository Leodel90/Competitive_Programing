import java.util.*;
public class _00255_Correct_Move {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			int k= leer.nextInt();
			int q = leer.nextInt();
			int m= leer.nextInt();
			if(k!=q){
				if(k!=m&&m!=q&&(q/8==m/8 || q%8==m%8) &&(k>q&&k>m || k<q&&k<m || (k/8!=q/8 && k%8!=q%8)||(k/8!=m/8 && k%8!=m%8))){
					if(k+8!=m&&k-8!=m&&(k%8==0 || k-1!=m)&&(k%8==7 || k+1!=m)){
						boolean M[]= new boolean[64];
						if(m%8!=0)M[m-1]=true;
						if(m%8!=7)M[m+1]=true;
						if(m+8<=63)M[m+8]=true;
						if(m>=8)M[m-8]=true;
						if((k%8!=0&&!M[k-1])||(k%8!=7&&!M[k+1])||(k>=8&&!M[k-8])||(k<=55&&!M[k+8]))System.out.println("Continue");
						else System.out.println("Stop");
					}else System.out.println("Move not allowed");
				}else System.out.println("Illegal move");
			}else System.out.println("Illegal state");
		}

	}
}
