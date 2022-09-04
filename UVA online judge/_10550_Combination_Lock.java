import java.util.*;
public class _10550_Combination_Lock {
	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
        while(leer.hasNext()){
        	int a = leer.nextInt();
        	int b= leer.nextInt();
        	int c = leer.nextInt();
        	int d = leer.nextInt();
        	if(a+b+c+d>0){
        		System.out.println(1080+((40+a-b)%40)*9+((40+c-b)%40)*9+((40+c-d)%40)*9);
        	}
        }
	}
}
