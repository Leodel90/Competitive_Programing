import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class _11860_Document_Analyzer {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t =Integer.parseInt(br.readLine());        
        for (int xd = 1; xd <=t; xd++) {
			int n=0,s=0,T=0;
			LinkedList<String>A= new LinkedList<String>();
			LinkedList<Integer>B= new LinkedList<Integer>();
			TreeSet<String> V= new TreeSet<String>();
			String ant="";
			while(true){
				String cad = br.readLine();
				if(cad.equals("END"))break;
				cad+=" ";
				String p="";
				char C[]= cad.toCharArray();
				for (int j = 0; j < C.length; j++){
				   if(C[j]<97||C[j]>122){
					   if(p.length()>0){n++; 
						   if(!p.equals(ant)){
							   if(!V.contains(p)){T++;V.add(p);}
							   A.add(p);B.add(n);ant=p;
						   }p="";
					   }
				   }else p+=C[j];
			    }
			}
			int q=n+1,p=1,i=0,j=-1,qv=0,pv=0;
			boolean w=true;
			String C[]= new String[A.size()];
			int P[]= new int[B.size()];
			TreeMap<String, Integer> V1= new TreeMap<String, Integer>();
			while(true){
				if(w){if(A.isEmpty())break;
					j++;C[j]=A.remove();P[j]=B.remove();
				if(!V1.containsKey(C[j])){s++;V1.put(C[j],1);}
				else V1.put(C[j], V1.get(C[j])+1);
				w=s<T;
				}else{
					int h=V1.get(C[i]);
					if(h==1){if(i<j){pv=P[i+1]-1;qv=P[j];}
				    else {pv=1;qv=1;}
				    if(qv-pv<q-p||qv-pv==q-p&&pv<p){p=pv;q=qv;}
				    w=true;
					}
					else {V1.put(C[i], h-1);i++;}
				}
			}
			System.out.println("Document "+xd+": "+p+" "+q);
        }
	} 
}
/*
3
1. a case is a case,
2. case is not a case~
END
a b c d e
END
a@#$a^%a a a
b b----b b++12b
END


*/