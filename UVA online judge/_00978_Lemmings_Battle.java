import java.util.*;
public class _00978_Lemmings_Battle {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        for (int xd = 0; xd < n; xd++){
			int field=leer.nextInt();
			int sg=leer.nextInt();
			int sb=leer.nextInt();
			TreeSet<Integer>GS= new TreeSet<Integer>();
			TreeSet<Integer>BS= new TreeSet<Integer>();
			int G[]= new int[102];
			int B[]= new int[102];
			for (int i = 0; i < sg; i++){int x =leer.nextInt();G[x]++;GS.add(x);} 
			for (int i = 0; i < sb; i++){int x =leer.nextInt();B[x]++;BS.add(x);}
			if(xd>0)System.out.println();
			while(!GS.isEmpty()&&!BS.isEmpty()){
				int g=GS.pollLast(),b=BS.pollLast();
				LinkedList<Integer> gs=new LinkedList<Integer>();
				LinkedList<Integer> bs=new LinkedList<Integer>();
				int CG[]= new int [102];
				int CB[]= new int [102];
				for (int i = 0; i < field&&g!=-1&&b!=-1; i++){
					B[b]--;G[g]--;
					if(g>b){CG[g-b]++;gs.add(g-b);}
					if(b>g){CB[b-g]++;bs.add(b-g);}
					if(G[g]<=0){if(!GS.isEmpty())g=GS.pollLast();else g=-1;}
					if(B[b]<=0){if(!BS.isEmpty())b=BS.pollLast();else b=-1;}
				}
				if(g!=-1&&G[g]>0)GS.add(g);
				if(b!=-1&&B[b]>0)BS.add(b);
				while(!gs.isEmpty()){int x=gs.remove();GS.add(x);G[x]+=CG[x];CG[x]=0;}
				while(!bs.isEmpty()){int x=bs.remove();BS.add(x);B[x]+=CB[x];CB[x]=0;}
			}
			if(!GS.isEmpty()||!BS.isEmpty()){int x=0;
				if(GS.isEmpty()){
					System.out.println("blue wins");
					while(true){
						if(B[x]<=0){if(BS.isEmpty())break;else x=BS.pollLast();
						}else {System.out.println(x);B[x]--;}
						}
					}
				else{
					System.out.println("green wins");
					while(true){
						if(G[x]<=0){if(GS.isEmpty())break; else x=GS.pollLast();}
					    else{System.out.println(x);G[x]--;}
					}
					}
			}else System.out.println("green and blue died");
		} 
	}
}







