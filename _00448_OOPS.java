import java.util.*;
public class _00448_OOPS {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		LinkedList<Character> C = new LinkedList<Character>();
		String I []= {"ADD","SUB","MUL","DIV","MOV","BREQ","BRLE","BRLS","BRGE","BRGR","BRNE","BR","AND","OR","XOR","NOT"};
		String O[]={"R","$","PC+",""};
		String cad = "";
		try{
			while(true){
			cad=leer.nextLine();
			if(cad.length()==0)break;
			for (int i = 0; i < cad.length(); i++) 
				C.add(cad.charAt(i));
		}
		}catch(Exception e){}
	    while(!C.isEmpty()){
	    	char ins = C.remove();
	    	int o=1;
	    	if(ins>=48&&ins<=57){cad=I[ins-48]+" ";if(ins<=52)o=2;}
	    	else {cad=I[ins-55]+" "; if(ins>=67&&ins<=69)o=3;}
	    	for(int j = 0; j < o; j++){
	    		if(j>0)cad+=',';
	    		char m=C.remove();
	    		int h,p;
	    		if(m>=48&&m<=57){h=(m-48)/4;p=((m-48)%4)<<12;}else {h=(m-55)/4;p=((m-55)%4)<<12;}
	    		cad+=O[h];
	    		for (int k = 8; k >=0; k=k-4){
					m=C.remove();
					if(m>=48&&m<=57)p+=(m-48)<<k;else p+=(m-55)<<k;
				}
	    		cad+=p;
			}
	    	System.out.println(cad);
	    }
	    
	}
}


/*
4C00D00004C0020001000000001400
005FFFB801E
*/