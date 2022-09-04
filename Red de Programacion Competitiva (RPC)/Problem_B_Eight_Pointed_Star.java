import java.util.*;
public class Problem_B_Eight_Pointed_Star{
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        try{boolean q=false;
        	while(true){
        		int k = leer.nextInt();
        		if(q)System.out.println();
        		else q=true;
        		String K[]= new String[2*k+1];
        		String p1="";
        		for (int i = 0; i < k; i++) {p1=p1+" ";}
        		K[0]=p1+"*";
        		int c = 2*k-1;
        		for (int i = 0; i < c; i++){K[0]=K[0]+" ";}
        		K[0]=K[0]+"*";int m =-1;
        		for (int i = 1; i < k; i++){m++;K[i]=p1+"*";
        		for (int j = 0; j < m; j++){K[i]=K[i]+" ";}
        		K[i]=K[i]+"*";c=c-2;
        		for (int j = 0; j < c; j++){K[i]=K[i]+" ";}
        		K[i]=K[i]+"*";
        		for (int j = 0; j < m; j++){K[i]=K[i]+" ";}
        		K[i]=K[i]+"*";
				}
        		K[k]="";
        		c=k*4+1;
        		for(int i = 0;i<c; i++){K[k]=K[k]+"*";}
        		K[2*k]=K[0];
        		p1=" ";
        		c=1;
        		for (int i = k+1; i < 2*k; i++){K[i]=p1+"*";p1=p1+" ";
					for (int j = 0; j < m; j++){K[i]=K[i]+" ";}
					K[i]=K[i]+"*";
					for (int j = 0; j < m; j++){K[i]=K[i]+" ";}
					K[i]=K[i]+"*";
					for (int j = 0; j < c; j++){K[i]=K[i]+" ";}c=c+2;
					K[i]=K[i]+"*";
					for (int j = 0; j < m; j++){K[i]=K[i]+" ";}
					K[i]=K[i]+"*";
					for (int j = 0; j < m; j++){K[i]=K[i]+" ";}
					K[i]=K[i]+"*";
					m--;
				}
        		for (int i = 0; i < K.length; i++) {System.out.println(K[i]);}
        		for (int i = 2*k-1; i >0; i--) {System.out.println(K[i]);}
        		System.out.print(K[0]);
        		}
        	
        }catch(Exception e){
        }
	}
}


/*
3
4
5

*/