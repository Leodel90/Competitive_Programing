import java.util.*;
public class Permutaciones{
//Concurso 143
static Scanner leer = new Scanner(System.in);
public static void main(String[] args) {
int ñ=leer.nextInt();
for (int xd = 0; xd < ñ; xd++) {
	int v[];
	long n;
	long x;
	leer.nextLine();
	String cad=leer.nextLine();
	n=leer.nextLong();
	v=new int [cad.length()];
	x=1;
	for (int i = 0,h; i <cad.length();i++,x=x*i){
	    h=i;v[i]=cad.charAt(i);
		while(h>0){
		if(v[h]<v[h-1]){int aux=v[h];v[h]=v[h-1];v[h-1]=aux;h--;}
		else h=0;
		}
	}
	int k = cad.length();
	cad="";
	long y;
	while(k>0){
		 x=x/k; 
		y=(n/x);
	     cad=cad+(char)v[(int)y];
	     for (int i = (int)y; i < k-1; i++) {
			v[i]=v[i+1];
		}
	     n=n%x;
	     k--;
	 }
System.out.println(cad);
}
//-----------------------------
/*
8
abc
0
abc
5
abc
3
cba
3
abcde
119 
abcdefghijklmnopqrst
0
abcdefghijklmnopqrst
2432902008176639999
qrstabcfghijklmnopde
2432902008176639999
 */

}


}
