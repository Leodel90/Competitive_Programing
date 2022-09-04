import java.util.*; 
public class Jackub {
	

public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
while(leer.hasNext()){
int t = leer.nextInt();
leer.nextLine();
for (int xd = 0; xd < t; xd++) {
	String tec , pal;
	int teclado [], m[][],h,s;
	tec = leer.nextLine();
	teclado = new int[26];
    for (int i = 0; i < tec.length(); i++) {
		char x = tec.charAt(i);
    	teclado[x-97]= i+1;
	}
    pal = leer.nextLine();
    h = pal.length();
    m = new int [26][26];
    s=0;
    for (int i = 1; i < h; i++) {
		int x=pal.charAt(i)-97;
		int y=pal.charAt(i-1)-97;
    	if(m[x][y]==0 && x!=y){
    		m[x][y]=Math.abs(teclado[x]-teclado[y]);
    	    m[y][x]=m[x][y];
    	}
	    s=s+m[x][y];
    }
    System.out.println(s);
}
}
}
}
/*
5
qwertyuiop
potter
tc
tctcttccctccccttc
a
aaaaaaaaaaa
kwadrutove
rowerowe
qwertyuiopasdfghjklzxcvbnm
topcodersingleroundmatchgoodluckhavefun


*/