import java.util.*;
public class _11297_Census_2{
	static int M[][],MIN[],MAX[],x1,x2,y1,y2,max,min;
	public static void llena(int X1, int Y1, int X2, int Y2, int p){
		if(X1>X2||Y1>Y2){MIN[p]=Integer.MAX_VALUE; MAX[p]=Integer.MIN_VALUE; return;}
		if(X1==X2&&Y1==Y2){MIN[p]=M[X1][Y1];MAX[p]=M[X1][Y1];return;}
		int mx=(X1+X2)/2,my=(Y1+Y2)/2,np=(p<<2)+1;
		llena(X1,Y1,mx,my,np);
		llena(X1,my+1,mx,Y2,np+1);
		llena(mx+1,my+1,X2,Y2,np+2);
		llena(mx+1,Y1,X2,my,np+3);
	    MIN[p]=Math.min(Math.min(MIN[np], MIN[np+1]),Math.min(MIN[np+2], MIN[np+3]));
	    MAX[p]=Math.max(Math.max(MAX[np], MAX[np+1]),Math.max(MAX[np+2], MAX[np+3]));
	}
	public static void C(int X1, int Y1, int X2, int Y2, int p){
		if(X1==X2&&Y1==Y2){MIN[p]=M[X1][Y1];MAX[p]=M[X1][Y1];return;}
		int mx=(X1+X2)/2,my=(Y1+Y2)/2,np=(p<<2)+1;
		if(x1<=mx){if(y1<=my)C(X1,Y1,mx,my,np);else C(X1,my+1,mx,Y2,np+1);}
		else{if(y1<=my)C(mx+1,Y1,X2,my,np+3);else C(mx+1,my+1,X2,Y2,np+2);}
		MIN[p]=Math.min(Math.min(MIN[np], MIN[np+1]),Math.min(MIN[np+2], MIN[np+3]));
	    MAX[p]=Math.max(Math.max(MAX[np], MAX[np+1]),Math.max(MAX[np+2], MAX[np+3]));
	}
	public static void Q(int X1, int Y1, int X2, int Y2, int p){
		if(X1>X2||Y1>Y2)return;
		if((X1<=x1&&x1<=X2||X1<=x2&&x2<=X2)&&(Y1<=y1&&y1<=Y2||Y1<=y2&&y2<=Y2)
        ||(x1<=X1&&X1<=x2||x1<=X2&&X2<=x2)&&(y1<=Y1&&Y1<=y2||y1<=Y2&&Y2<=y2)
        ||(x1<=X1&&X2<=x2||X1<=x1&&x2<=X2)&&(y1<=Y1&&Y2<=y2||Y1<=y1&&y2<=Y2)){
			if(x1<=X1&&X2<=x2&&y1<=Y1&&Y2<=y2){max=Math.max(max,MAX[p]);min=Math.min(min,MIN[p]);}
			else{int mx =(X1+X2)/2,my=(Y1+Y2)/2,np=(p<<2)+1;
				Q(X1,Y1,mx,my,np);Q(X1,my+1,mx,Y2,np+1);Q(mx+1,my+1,X2,Y2,np+2);Q(mx+1,Y1,X2,my,np+3);
			}
		}
	}
	public static void main(String[] args){
	   Scanner leer = new Scanner(System.in);
	   int n = leer.nextInt();
	   M= new int [n][n];
	   	   for (int i = 0; i < n; i++){for (int j = 0; j < n; j++) M[i][j]=leer.nextInt();}
	       if(n>0){
	   	   double w = Math.log(n*n) /Math.log(4)+1;
	       if((int)w<w)w++;
	       w=(Math.pow(4, (int)w)-1)/3;
	       MIN= new int [(int)w];
	       MAX= new int [(int)w];
	       llena(0,0,n-1,n-1,0);
	       }
	       int q = leer.nextInt();
	       for (int
	    		   i = 0; i < q; i++){
			String cad = leer.next();
			x1=leer.nextInt()-1;y1=leer.nextInt()-1;
			if(cad.equals("q")){x2=leer.nextInt()-1;y2=leer.nextInt()-1;
			max=-1;min=Integer.MAX_VALUE;
			Q(0,0,n-1,n-1,0);
			System.out.println(max+" "+min);
			}else{M[x1][y1]=leer.nextInt();C(0,0,n-1,n-1,0);}
		 }
	}
}


/*
5
1 2 3 4 5
0 9 2 1 3
0 2 3 4 1
0 1 2 4 5
8 5 3 1 4

4
q 1 1 2 3
c 2 3 10
q 1 1 5 5
q 1 2 2 2
q 2 3 3 5

6
1 2 3 4 5 3
0 9 2 1 3 1 
0 2 3 4 1 9
0 1 2 4 5 9
8 5 3 1 4 2
4 1 8 5 8 0
30
c 3 4 6
q 3 4 3 4 6
q 4 2 6 4
q 5 4 6 6

7
1 2 3 4 5 3 4
0 9 2 1 3 1 3
0 2 3 6 1 9 7
0 1 2 4 5 9 5
8 5 3 1 4 2 0
4 1 8 5 8 0 6
6 8 9 6 7 5 7 
*/