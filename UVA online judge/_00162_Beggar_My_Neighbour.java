import java.util.*;
public class _00162_Beggar_My_Neighbour{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			String A = leer.nextLine();
			if(A.charAt(0)!='#'){
				LinkedList<String> ND= new LinkedList<String>(); 
				LinkedList<String> D= new LinkedList<String>();
				A+=" "+leer.nextLine();
				A+=" "+leer.nextLine();
				A+=" "+leer.nextLine();
				StringTokenizer C= new StringTokenizer(A);
				boolean q =true,p=false;
				while(C.hasMoreTokens()){
					if(q)ND.addLast(C.nextToken());
					else D.addLast(C.nextToken());
					q=!q;
				}
				q=true;
				LinkedList<String> P= new LinkedList<String>();
				String L="";
				int c=0;
			    while(true){
			    	if(q){q=false;
			    		if(p){ 
			    		  while(!ND.isEmpty() && c>0){
			    			  L=ND.removeLast();P.addLast(L);
			    			  if(L.charAt(1)<=57 || L.charAt(1)=='T')c--;
			    			  else {c=-1; break;}
			    		  }
			    		  if(ND.isEmpty() && c>0)
			    			  break;
			    		  else{
			    			  if(c==0){
			    				  while(!P.isEmpty()){
			    					  D.addFirst(P.removeFirst());
			    				  }L="TT";
			    			  }
			    		  }
			    		}else{
			    		if(!ND.isEmpty()){
			    	    L=ND.removeLast();
			    	    P.addLast(L);}else  break;
			    		}
			    	}else{q=true;
			    		if(p){
			    		  while(!D.isEmpty() && c>0){
			    			  L=D.removeLast();P.addLast(L);
			    			  if(L.charAt(1)<=57 || L.charAt(1)=='T'){c--;}
			    			  else {c= -1; break;}
			    		  }
			    		  if(D.isEmpty() && c>0)
			    			  break;
			    		  else{
			    			  if(c==0){
			    				  while(!P.isEmpty()){
			    					  ND.addFirst(P.removeFirst());
			    				  }L="TT"; 
			    			  }
			    		  }
			    		 
			    		}else{
			    		if(!D.isEmpty()){
			    	    L=D.removeLast();
			    	    P.addLast(L);
			    	    }else  break;
			    		}
			    	}
			    	p=L.charAt(1)>57 && L.charAt(1)!='T';
			    	if(p){
			    	    if(L.charAt(1)=='J')c=1;
			    	    if(L.charAt(1)=='Q')c=2;
			    	    if(L.charAt(1)=='K')c=3;
			    	    if(L.charAt(1)=='A')c=4;
			    	}
			    	
			    }
			    if(q){
			    	if(ND.size()<10)System.out.println(2+"  "+ND.size());
			    		else 
			    	System.out.println(2+" "+ND.size());}
			    else {
			    	if(D.size()<10)System.out.println(1+"  "+D.size());
			    	else
			    	System.out.println(1+" "+D.size());
			    	}
			}else break;
		}
	}
}
