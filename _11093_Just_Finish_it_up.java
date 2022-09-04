import java.util.*;
public class _11093_Just_Finish_it_up{
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for (int xd = 1; xd <=t; xd++){
			int  n = leer.nextInt();
			LinkedList<Integer> P= new LinkedList<Integer>();
			for (int i = 0; i < n; i++)P.add(leer.nextInt());
			long s=0,k=-1;			
			int r=-1;
			for (int i = 1; i <=n; i++){
				int p = P.remove()-leer.nextInt();
				s+=p;
				if(k<0&&p>=0){k=p;r=i;}else k+=p;
			}
			if(s>=0)System.out.println("Case "+xd+": Possible from station "+r);
			else System.out.println("Case "+xd+": Not possible");
		}
	}
}

/*
3
5
1 1 1 1 1
1 1 2 1 1
7
1 1 1 10 1 1 1
2 2 2 2 2 2 2
7
0 0 0 1 3 9 1
1 1 1 0 4 2 1
*/