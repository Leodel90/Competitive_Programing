import java.util.*;
public class _00584_Bowling {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
		StringTokenizer cad = new StringTokenizer(leer.nextLine());
		int t=cad.countTokens();
		if(t>2){
			int s =0,i=0,k;char T[] = new char[t];			
			while(cad.hasMoreTokens()){
				T[i]= cad.nextToken().charAt(0);i++;}
			k=0;i=0;
		    while(k<20){
		    	int y=1;
		    	if(T[i]=='X'){y=3;k++;}
		    	if(T[i]=='/')y=2;
		    	for (int j = 0; j < y; j++){
					if(T[i+j]>=48&&T[i+j]<=57)
					  	s+=T[i+j]-48;
					else{
						if(T[i+j]=='/')s+=10-T[i+j-1]+48;
						else s+=10;
					}
				}i++;k++;
		    }System.out.println(s);
		}else break;
		}
	}
}

/*
1 0 1 / 2 2 X 3 3 X 1 / 3 / X 1 2
1 0 1 / 2 2 X 3 3 X 1 / 3 / 1 / X 8 0
1 0 1 / 2 2 X 3 3 X 1 / 3 / 1 / 8 / 9
Game over
*/