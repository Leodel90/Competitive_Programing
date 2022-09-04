import java.util.*;
public class _10227_Forests {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int y = leer.nextInt();
        for (int i = 0; i < y; i++){
			int p = leer.nextInt();
			int t = leer.nextInt();
			TreeSet<String> M= new TreeSet<String>();
			LinkedList<Integer> L[]= new LinkedList[p+1];
			leer.nextLine();
			try{while(true){
					StringTokenizer cad= new StringTokenizer(leer.nextLine());
					if(cad.countTokens()==0)break;
					int pi= Integer.parseInt(cad.nextToken()),tj=Integer.parseInt(cad.nextToken());
					if(L[pi]==null)
						L[pi]= new LinkedList<Integer>();
					L[pi].add(tj);
				}	
			}catch(Exception e){}
			for (int j = 1; j <=p; j++){
				String r="-";
				if(L[j]!=null){TreeSet<Integer> A= new TreeSet<Integer>();
				while(!L[j].isEmpty())A.add(L[j].remove());
				while(!A.isEmpty())r=r+A.pollFirst()+"-";
				}
				M.add(r);
			}
			if(i>0)System.out.println();
			System.out.println(M.size());
		}
	}
}
