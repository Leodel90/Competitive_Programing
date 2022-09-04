import java.util.*;
public class _00333_Recognizing_Good__ISBNs {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
	    try{while(true){
	    	  String r = leer.nextLine();
	    	  String y="",g="";
	    	  boolean o=true;
	    	  int c=0;
	    	  int s1=0,s2=0;
	    	  for (int i = 0; i < r.length(); i++){
	    		  if(r.charAt(i)!=' '){
	    		if(r.charAt(i)>=48&&r.charAt(i)<=57||r.charAt(i)=='X'){
					if(r.charAt(i)=='X'){s1+=10;o=o&&c==9;}
					else s1+=r.charAt(i)-48;
					s2+=s1;c++;
				}
	    		g=g+y+r.charAt(i);
				y="";
	    		}else{
                    if(g.length()>0)y=y+r.charAt(i);
				}
			  }
	    	  if(o&&c==10&&s2%11==0)System.out.println(g+" is correct.");
	    	  else System.out.println(g+" is incorrect.");
	    	}
	    }catch(Exception e){}
        
	}
}

/*
0-89237-010-6
0-8306-3637-4
  0-06-017758-6
    This_is_garbage
1-56884-030-6
    0-8230-2571-3
    0-345-31386-0
    0-671-88858-7
    0-8104-5687-7
    0-671-74119-5
    0-812-52030-0
    0-345-24865-1-150
0-452-26740-4
    0-13-139072-4
    0-1315-2447-X
  - -0  00-11   11- -   0   00     - -- 
  - -0  00-11   10- -   0   00     - --    
  - -0  00-00   01- -   1   11     - --    
  - -1  11-00   00- -   0   00     - --
  000010X000 

*/