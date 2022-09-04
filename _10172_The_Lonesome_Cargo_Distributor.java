import java.util.*;
public class _10172_The_Lonesome_Cargo_Distributor {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int xd = 0; xd < t; xd++){
			int n = leer.nextInt();
			int s = leer.nextInt();
			int q = leer.nextInt();
			LinkedList<Integer> B[]= new LinkedList[n];
			LinkedList<Integer>C = new LinkedList<Integer>();
			int g = 0;
			for (int i = 0; i < n; i++){
				B[i]= new LinkedList<Integer>();
				int h= leer.nextInt();
				g+=h;
				for (int j = 0; j < h; j++) 
					B[i].add(leer.nextInt()-1);
			}
			int c=0,x=0;
			long time=0;
			while(true){
				while(!C.isEmpty()){
				if(C.getLast()!=x){
					    if(B[x].size()<q){time++;B[x].add(C.removeLast());c--;}
					    else break;
				   }else{C.removeLast();c--;time++;g--;}
				}
				if(g==0)break;
				while(!B[x].isEmpty()){
				   if(c<s){time++;
					   C.add(B[x].remove());c++;
				   }else break;
				}
				x=(x+1)%n;time=time+2;
			}
			System.out.println(time);
		}
	}
}
/*
2
5 2 3
3 4 5 2
2 1 3
0
3 3 5 1
1 4
5 2 3
3 4 5 2
2 1 3
0
3 3 5 1
1 4

*/