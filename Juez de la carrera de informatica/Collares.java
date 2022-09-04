import java.util.*;
public class Collares{
	static int t,k;
	static String cad;
	static boolean p[];
	static int d;
	public static void collar(int i,int ini){
		if(k<t){
		if(cad.charAt(ini)<cad.charAt(i) || ini==i){
			int a=(ini+1)%t,b=(ini-1+t)%t;
			while(cad.charAt(a)==cad.charAt(b) && a!=b){
				p[a]=true;
				p[b]=true;
				if(cad.charAt(a)==cad.charAt(ini)){}
				if(cad.charAt(b)==cad.charAt(ini)){}
			}
			if(a!=b){

			}
			
		}else{
			if(cad.charAt(ini)==cad.charAt(i)){}
			else{
			ini=i; k=0; p= new boolean[t];}
		}
		}else return;
	}
	public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        while(leer.hasNext()){
        	cad = leer.nextLine();
            t=cad.length();
            k=0;
            
        }
	}
}
