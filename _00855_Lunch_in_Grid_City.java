import java.util.*;
public class _00855_Lunch_in_Grid_City{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
        int t = leer.nextInt();
        for (int xd = 0; xd < t; xd++){
			int s=leer.nextInt();
			int a = leer.nextInt();
			int f = leer.nextInt();
			int X[]= new int[s+1];
			int Y[]= new int[a+1];
			long tx=0,ty=0;
			for (int i = 0; i < f; i++){
				int x = leer.nextInt(),y=leer.nextInt();
				X[x]++;tx+=x;
				Y[y]++;ty+=y;
			}
			int x=0,y=0;
			long S=tx,sl=0,sr=tx,r=f,l=0;
			for (int i = 1; i <=s; i++){
				long m=sr-r*i+l*i-sl,c=X[i]*i;
				r=r-X[i];
				l=l+X[i];
				sr=sr-c;
				sl=sl+c;
				if(m<S){S=m;x=i;}
			}r=f;l=0;sr=ty;sl=0;S=ty;
			for (int i = 1; i <=a; i++){
				long m=sr-r*i+l*i-sl,c=Y[i]*i;
				r=r-Y[i];
				l=l+Y[i];
				sr=sr-c;
				sl=sl+c;
				if(m<S){S=m;y=i;}
			}
			System.out.println("(Street: "+x+", Avenue: "+y+")");
		}
	}
}
/*
13
5 5 4
1 1 
1 4 
4 4
4 1
5 5 5
1 1
3 1
4 4
3 3
1 3
7 7 12
1 2
1 7
2 2
2 3
2 5
3 4
4 2
4 5
4 6
5 3
6 5
3 5
5 5 5
2 2
3 3
3 5
5 3
5 5
4 4 8
1 1
1 2
1 3
2 1
2 3
3 1 
3 2 
3 3
6 6 6
1 1 
1 2 
1 3
3 1 
3 3 
4 4
5 5 12
1 1 
1 2 
1 3 
1 4
2 1 
2 4
3 1 
3 4
4 1 
4 2 
4 3 
4 4
2 2 2
1 1
2 2
7 7 11
1 2
1 7
2 2
2 3
2 5
3 4
4 2
4 5
4 6
5 3
6 5
22 22 6 
1 5 
1 4 
1 3 
2 1 
3 10 
3 9
10 10 1 
5 5 
2 2 2 
1 1 
2 2
7 7 11 
1 2 
1 7 
2 2 
2 3 
2 5 
3 4 
4 2 
4 5 
4 6 
5 3 
6 5


*/