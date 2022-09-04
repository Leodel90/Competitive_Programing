import java.util.*;
public class _11507_Bender_B_Rodriguez {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
		  int n = leer.nextInt();
		  if(n!=0){
			  char a='+';
			  char k='x';
			  int l;
			  for (int i = 1; i < n; i++){
				  String r= leer.next();
				  if(!r.equals("No")&&(k=='x' || k==r.charAt(1))){
						char f, g;
					  if(k=='x'){f='+';g='-';
					  k=r.charAt(1);
					  }else{f='-';g='+';
					      if(k==r.charAt(1))k='x';
					  }
						if(a==r.charAt(0))a=f;else a=g;
					}
			}System.out.println(a+""+k);
		  }
		}
	}
}
