import java.util.*;
public class _11039_Building_designing{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int xd = 0; xd < t; xd++){
			int n = leer.nextInt();
			boolean P[]= new boolean[10000000];
			boolean N[]= new boolean[10000000];
			int min=1000000,max=0;
			for (int i = 0; i < n; i++){
				int x = leer.nextInt();
				if(x>0)P[x]=true;else N[-x]=true;
				if(Math.abs(x)<min)min=Math.abs(x);
				if(Math.abs(x)>max)max=Math.abs(x);
			}
			boolean a=true,b=false;
			int x=0,y=0;
			for (int i = min; i <=max; i++){
				if(P[i]&&!a||N[i]&&a){a=!a;x++;}
				if(P[i]&&!b||N[i]&&b){b=!b;y++;}
			}
			System.out.println(Math.max(x, y));
		}
	}
}


/*
3
5
7
-2
6
9
-3
8
11
-9
2
5
18
17
-15
4
8
9
-9
2
-2
18
17
-4
4
*/