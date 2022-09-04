import java.util.*;
public class _00594_One_Little_Two_Little_Three_Little_Endians{
	static boolean N[];
	public static void S(){
		int p=31;
		while(p>=0){
			if(N[p]){N[p]=false;p--;}
			else {N[p]=true;break;}
		}
	}
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		try{
		while(true){
		int n = leer.nextInt(),c=Math.abs(n);
		N= new boolean[32];
		int p=31,l=1;
		if(n<0)l=0;
		while(p>=0){
			if(c%2==l)N[p]=true;
			c/=2;p--;
		}
		if(n<0)S();
		boolean C[]= new boolean[32];
		for (int i = 24,k=0; i >=0; i=i-8){
			for (int j = i; j < i+8; j++,k++){
				if(N[24])C[k]=!N[j];
				else C[k]=N[j];
			}
		}
		boolean q=N[24];
		N=C;
		int r=0;
        if(q)S();
		for (int i = 0; i <32; i++){
			if(r>0)r=r<<1;
			if(N[i])r++;
		}
		if(q)r=-r;
		System.out.println(n+" converts to "+r);
		}
		}catch(Exception e){}
	}
}
/*
123456789
-123456789
1
16777216
20034556
2147483647
-2147483648



00000111010110111100110100010101
11111000101001000011001011101010    C
11111000101001000011001011101011    S1
11101011001100101010010011111000    I
00010100110011010101101100000111    C
00010100110011010101101100001000    S1
00010100110011010101101100001000
00010100110011010101110000000000
*/