import java.util.*;
public class _00555_Bridge_Hands {
	static String X,Y;
	public static boolean Compara(){
		boolean q;
		if(X.charAt(0)!=Y.charAt(0)){
			if(X.charAt(0)!='C' && Y.charAt(0)!='C'){
				if(X.charAt(0)!='D' && Y.charAt(0)!='D'){
					q= Y.charAt(0)=='S';	
				}else q= Y.charAt(0)=='D';
			}else q= Y.charAt(0)=='C';
		}else{
		    if(X.charAt(1)>57 || Y.charAt(1)>57){
		    	if(X.charAt(1)>57 && Y.charAt(1)>57){
		    		if(X.charAt(1)!='T' && Y.charAt(1)!='T'){
		    			if(X.charAt(1)!='J' && Y.charAt(1)!='J'){
		    				if(X.charAt(1)!='Q' && Y.charAt(1)!='Q'){
								q=Y.charAt(1)=='K';
							}else q= Y.charAt(1)=='Q';
						}else q= Y.charAt(1)=='J';		
					}else q= Y.charAt(1)=='T';	
		    	}else q=Y.charAt(1)<=57;
		    }else q=Y.charAt(1)<X.charAt(1);
		}
		return q;
	}
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			String I= leer.next();
			String M[][]= new String[13][4];
			if(I.charAt(0)!='#'){
				String B= leer.next()+leer.next();
				int j=0;
				String cad;
				for (int i = 0; i < 13; i++) {
					for (int k = 0; k < 4 && j<B.length(); k++){
						M[i][k]=""+B.charAt(j);j++;
						M[i][k]+=B.charAt(j);
						int p=i;
						Y=M[i][k];
						while(p>0){
							X=M[p-1][k];
							if(Compara()){
								M[p-1][k]=M[p][k];
								M[p][k]=X;p--;
							}else break;
						}
						j++;
					}
				}
				char V[]= {'S','W','N','E'};
			    j=3;
			    if(I.charAt(0)=='W')j=2;
			    if(I.charAt(0)=='N')j=1;
			    if(I.charAt(0)=='E')j=0;
				for (int k = 0; k < 4; k++){
					System.out.print(V[k]+":");
					for (int h = 0; h < 13; h++) 
						System.out.print(" "+M[h][j]);
					System.out.println();
					if(j!=3)j++;
					else j=0;
				}
			}else break;
		}
	}
}
