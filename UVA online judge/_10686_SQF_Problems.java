import java.util.*;
public class _10686_SQF_Problems {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        for (int xd = 0; xd < n; xd++) {
			int c = leer.nextInt();
			String C[] = new String[c];
			LinkedList<String> W[] = new LinkedList[c];
			int P[]= new int[c];
			TreeMap<String, Boolean> T= new TreeMap<String, Boolean>();
			for (int i = 0; i < c; i++){
				C[i]= leer.next();
				int w = leer.nextInt();
				P[i] = leer.nextInt();
				W[i]= new LinkedList<String>();
				for (int j = 0; j < w; j++){
					W[i].add(leer.next());
					T.put(W[i].getLast(), false);
				}
			}
			leer.nextLine();
			while(true){
				String cad = leer.nextLine()+" ",p="";
				if(cad.length()==1)break;
				for (int i = 0; i < cad.length(); i++) {
                    char x = cad.charAt(i);
                    if(!(x>=65&&x<=91||x>=97&&x<=123)){
                    	if(T.containsKey(p))T.put(p, T.get(p)||true);
                    	p="";
                    }else p+=x;
				}
			}
			String res="";
			for (int i = 0; i < c; i++){
				int s=0;
				while(!W[i].isEmpty()){
					if(T.get(W[i].remove()))s++;
				}
				if(s>=P[i]){
					if(res.length()>0)res+=',';
					res+=C[i];
				}
			}
			if(res.length()==0)res="SQF Problem.";System.out.println(res);
		}
	}
}
/*
1
2
Graph 4 3
node
edge
directed
distance
Geometrical 4 2
point
convex
polygon
boring
This is neither a SQF problem nor a graph problem.
This is a boring geometrical problem. In this problem
you should calculate the convex area of a regular polygon.
*/