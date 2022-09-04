import java.util.*;
public class _00706_LC_Display {
	public static void main(String[] args){
		Scanner leer = new Scanner (System.in);
		String D[]={"***.***","..*..*.","*.***.*","*.**.**",".***.*.","**.*.**","**.****","*.*..*.","*******","****.**"};
        while(true){
        	int s=leer.nextInt();
        	String n=leer.next();
        	if(s>0){
        	boolean q=false;
        	String w="",l="";
        	int c=0;
        	for (int i = 0; i < s; i++){
				w+=" ";l+="-";
        	}
        	for (int i = 0; i < 5; i++){
        		int d;
				if(q){
					for (int j = 0; j < s; j++){
						for (int k = 0; k < n.length(); k++){
							d=n.charAt(k)-48;
							if(D[d].charAt(c)=='*')System.out.print("|"+w);
							else System.out.print(" "+w);
							if(D[d].charAt(c+1)=='*')System.out.print("|");
							else System.out.print(" ");
							if(k+1<n.length())System.out.print(" ");
						}
						System.out.println();
					}c=c+2;
				}
				else{
					for (int j = 0; j < n.length(); j++) {
						d=n.charAt(j)-48;
						if(D[d].charAt(c)=='*')System.out.print(" "+l+" ");
						else System.out.print(" "+w+" ");
						if(j+1<n.length())System.out.print(" ");
					}c++;System.out.println();
				}
				q=!q;
			}
        	System.out.println();
        	}else break;
        }
	}
}
/*
2 12345
3 67890
0 0
*/