import java.util.*;
public class _00793_Network_Connections {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int xd = 0; xd < t; xd++){
        	int n=leer.nextInt();leer.nextLine();
        	int a=0,b=0;
        	int P[] = new int[n+1];
        	int R[] = new int[n+1];
			try{
				while(true){String cad = leer.nextLine();
					if(cad.length()==0) break;
					cad+=" ";
					int D[]= new int [2];int p =0;
					for (int i = 2; i < cad.length(); i++){
						char x = cad.charAt(i);
						if(x!=' ')D[p]=D[p]*10+x-48;
						else p++;
					}
					LinkedList<Integer> L[]= new LinkedList[2];
			        if(cad.charAt(0)=='c'){
			        	for (int i = 0; i < 2; i++){L[i]=new LinkedList<Integer>();
			        		while(P[D[i]]>0){L[i].add(D[i]);D[i]=P[D[i]];}
			        		L[i].add(D[i]);
			        	}
			        	if(D[0]!=D[1]){
			        		if(R[D[0]]>=R[D[1]]){
			        			while(!L[1].isEmpty())P[L[1].remove()]=D[0];
			        			if(R[D[0]]==R[D[1]])R[D[0]]++;
			        		}else{
                               while(!L[0].isEmpty())P[L[0].remove()]=D[1];
			        		}
			        	}
			        }else{
			        	for (int i = 0; i < 2; i++){L[i]=new LinkedList<Integer>();
		        		   while(P[D[i]]>0){L[i].add(D[i]);D[i]=P[D[i]];}
		        	    }
			        	if(D[0]==D[1])a++;else b++;
			        	for (int i = 0; i < 2; i++){
							while(!L[i].isEmpty())P[L[i].remove()]=D[i];
						}
			        }
				}
			}catch(Exception e){}
			if(xd>0)System.out.println();
			System.out.println(a+","+b);
		}
	}
}

/*
2
10
c 1 5
c 2 7
q 7 1
c 3 9
q 9 6
c 2 5
q 7 5

1
q 1 1
c 1 1
q 1 1

*/