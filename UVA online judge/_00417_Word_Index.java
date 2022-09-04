import java.util.*;
public class _00417_Word_Index {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int M[][]= new int [6][26];
		int a=0,c=1;
		for (int i = 1; i <=5; i++){int s=0;
		    M[i][0]=a;
			for (int j = 1; j <26-i+1; j++){
				M[i][j]=a+c-M[i-1][j];
				a=M[i][j];s+=a;
			}
			a++;
			c=a;
		}
        try{
        	while(true){
        		String cad = leer.next();
        		int l=cad.length(),r=M[l][0]+1,p=0;
        		boolean q =true;
        		for (int i = 0; i < cad.length()&&q; i++){
					int x = cad.charAt(i)-97;
					if(x>=p){
						r+=M[l][x]-M[l][p];l--;
						p=x+1;
					}else q=false;
				}
        		if(!q)r=0;
        		System.out.println(r);
        	}
        }catch(Exception e){}
	}
}
