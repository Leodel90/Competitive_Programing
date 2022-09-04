	import java.util.*;
	public class _00230_Borrowers {
		public static void main(String[] args) {
			Scanner leer = new Scanner(System.in);
	        LinkedList<String> L= new LinkedList<String>();
	        while(true){
	        	String cad = leer.nextLine();
	        	if(cad.equals("END"))break;
	        	L.add(cad);
	        }
	        int p=0;
	        String A[]= new String[L.size()];
	        String T[]= new String[L.size()];
	        boolean S[]= new boolean[A.length];
	        while(!L.isEmpty()){
	        	String r= L.remove(),t="",a="";
	        	int i = 0;
	        	while(true){t+=r.charAt(i);
	        	if(r.charAt(i)=='"'&&t.length()>1)break;
	        	else i++;
	        	}
	        	T[p]=t;S[p]=true;
	        	i=i+5;
	        	while(i<r.length()){a+=r.charAt(i);i++;}
	        	A[p]=a;
	        	int j=p;
	        	while(j>0){boolean q=true,o=false;
	        	int k=0;
	        		while(true){
	        			if(k<A[j].length()&&k<A[j-1].length()){
						   if(A[j].charAt(k)!=A[j-1].charAt(k)){
						       o=A[j-1].charAt(k)>A[j].charAt(k);q=false;break;
						   }else k++;
						}else{
							if(A[j].length()!=A[j-1].length()){
							    q=false; o=A[j].length()<A[j-1].length();
							}
							break;
						}
					}
	        		if(q){k=0;
	        			while(true){
	            			if(k<T[j].length()&&k<T[j-1].length()){
	    					   if(T[j].charAt(k)!=T[j-1].charAt(k)){
	    					       o=T[j-1].charAt(k)>T[j].charAt(k);break;
	    					   }else k++;
	    					}else{o=T[j].length()<T[j-1].length();break;}
	    				}
	        		}
	        		if(o){a=A[j];A[j]=A[j-1];A[j-1]=a;
	        		t=T[j];T[j]=T[j-1];T[j-1]=t;j--;
	        		}else break;
	        	}p++;
	        }
	        
	    	boolean R[]= new boolean [A.length];
	    	while(true){
	    	String r=leer.next();
	    		if(!r.equals("END")){
	    		if(r.equals("SHELVE")){int a=-1;
	    			for (int i = 0; i < R.length; i++){
						if(R[i]){
							if(a!=-1)System.out.println("Put "+T[i]+" after "+T[a]);
							else System.out.println("Put "+T[i]+" first");
							R[i]=false;S[i]=true;
						}
						if(S[i])a=i;
					}
	    			System.out.println("END");
	    		}else{
	    			String cad = leer.nextLine(),c="";
	    			for (int i = 1; i < cad.length(); i++)c+=cad.charAt(i);
	    			int I=0;
	    			for (int i = 0; i < T.length; i++){if(T[i].equals(c)){I=i;break;}}
	    			R[I]=r.equals("RETURN");
	    			S[I]=false;
	    		}
	    		}else break;
	    	}
		}
	}

/*
"The Canterbury Tales" by Chaucer, G.
"Algorithms" by Sedgewick, R.
"The C Programming Language" by Kernighan, B. and Ritchie, D.
END
BORROW "Algorithms"
BORROW "The C Programming Language"
RETURN "Algorithms"
RETURN "The C Programming Language"
SHELVE
END
*/