import java.util.*;
public class CompuZombie {
//Concurso 143
	static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
 int n = leer.nextInt();
 
 for (int xd = 0; xd < n; xd++) {
	String cad = leer.next();
	String res="";
	int x =0;
	char c = cad.charAt(x);
    for (int i = 0; i <cad.length() ; i++) {
		char p = cad.charAt(i);
		if(p>=97)p=(char)(p-32);
		if(c>=97)c=(char)(c-32);
	    if(i==x || c!=p){res=res+p;x=i;c=p;}
    }System.out.println(res);
}
/*
 Holaaaa
 SEELect
 Where
 TakeeeBaaackkkk
 IFFFfff
 A
 GgggrrrroupppppByyY
 CooookkkkkeEEee
 ZzzzzommmmbbbbBBbbiiiiiiiiEEEE
 AttttaccccckKKK
 */

	}

}
