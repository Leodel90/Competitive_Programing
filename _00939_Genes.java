import java.util.*;
import java.util.Map.Entry;
public class _00939_Genes {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
         int n = leer.nextInt();
         TreeMap<String, Person> D = new TreeMap<String,Person>();
         LinkedList<String> W= new LinkedList<String>();
         for (int i = 0; i < n; i++){
			String N= leer.next(),X=leer.next();
			boolean q=X.equals("non-existent") ||X.equals("recessive")||X.equals("dominant");
			boolean c1=D.containsKey(N),c2=D.containsKey(X);
			if(!q){Person A = new Person();
				if(c2)A=D.get(X);
				A.P[A.c]=N;
				A.c=A.c+1;
				D.put(X,A);
			}
			else{Person A = new Person();if(c1)A=D.get(X);A.E=X;D.put(N,A);}
			if(!c1)W.add(N);
			if(!c2&&!q)W.add(X);
		}
        while(!W.isEmpty()){
        	LinkedList<String> L= new LinkedList<String>();
        	L.add(W.remove());
        	LinkedList<String> R= new LinkedList<String>();
        	while(!L.isEmpty()){
        	    	String h=L.remove();
        		    Person A=D.get(h);
        		  if(A.E.length()==0){
        		    	R.add(h);
        		    	L.add(A.P[0]);L.add(A.P[1]);
        		  }
          }
        	while(!R.isEmpty()){
        		String h=R.removeLast();
        		Person A = D.get(h);boolean q=true;
        		for (int i = 0; i < 2&&q; i++){
					Person T=D.get(A.P[i]);
					q=T.E.length()>0;
				}
        		if(q){Person P1=D.get(A.P[0]);Person P2=D.get(A.P[1]);
        			if(P1.E.equals("dominant")||P2.E.equals("dominant")){
            			if(!P1.E.equals("dominant")||!P2.E.equals("dominant")){
            				if(P1.E.equals("non-existent")||P2.E.equals("non-existent"))A.E="recessive";
            				else A.E="dominant";
            			}else A.E="dominant";
            		}else{
            			if(P1.E.equals("recessive")&&P2.E.equals("recessive"))A.E="recessive";
            			else A.E="non-existent";
            		}
        			D.put(h,A);
        		}else R.addFirst(h);
        	}
        	}
            while(!D.isEmpty()){
            	Entry<String, Person> P= D.pollFirstEntry();
            	System.out.println(P.getKey()+" "+P.getValue().E);
            } 
        } 
	public static class Person {
		String P[],E;
		int c;
		public Person(){
			c=0;
			P= new String[2];
			E="";
		}
	} 
}
/*
7
John dominant
Mary recessive
John Susan
Mary Susan
Peter non-existent
Susan Marta
Peter Marta

11
a b
b c
c d
a recessive
z b
z dominant
y c 
a y
z y
x d
x non-existent
*/
