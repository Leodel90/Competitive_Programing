import java.util.*;
public class _06628_Canal {
	//Hay que enviar 
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(leer.hasNext()){
        	int ab=leer.nextInt();
        	int ac=leer.nextInt();
        	int bd=leer.nextInt();
        	int den=bd-ac;
        	int num=ab*ac;
        	int d=Math.min(num, den);
        	while(d>=2){
        		if(num%d==0&&den%d==0){
        			num=num/d;den=den/d;
        		}else d--;
        	}
        	System.out.println(num+"/"+den);
        }
	}
}
