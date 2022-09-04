import java.util.*;
public class _00114_Simulation_Wizardry {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int m = leer.nextInt();
        int cm= leer.nextInt();
        int p= leer.nextInt();
        int V[][]= new int[n+2][m+2];
        int C[][]= new int[n+2][m+2];
        boolean B[][]= new boolean[n+2][m+2];
        for (int i = 0; i < p; i++){
			int x= leer.nextInt();
			int y= leer.nextInt();
			V[x][y]= leer.nextInt();
			C[x][y]= leer.nextInt();B[x][y]=true;
		}int s=0;
		leer.nextLine();
		try{
        while(true){
        	String r = leer.nextLine();
        	if(r.length()>0){
        	StringTokenizer cad = new StringTokenizer(r);
        	int x = Integer.parseInt(cad.nextToken());
        	int y = Integer.parseInt(cad.nextToken());
        	int d = Integer.parseInt(cad.nextToken());
        	if(d==0|| d==2)d=2-d;
        	int l = Integer.parseInt(cad.nextToken());
        	int t=0;
        	int J[]={0,1,0,-1};
        	int I[]={-1,0,1,0};
        	boolean w=false;
        	boolean b= false;
        	while(l>0){l--;
        		if(w||b){
        			if(w){
        				l=l-cm;w=false;
        			}else{
        				t+=V[x][y];l=l-C[x][y];
        				b=false;
        			}
        			y=y-J[d];x=x-I[d];d=(d+1)%4;
        		}
        		x=x+I[d];y=y+J[d];
        		if(x==1||x==n||y==1||y==m)w=true;
        		else b=B[x][y];
        	}
        	s=s+t;
        	System.out.println(t);
        	}else break;
        }
        }
        catch(Exception e){}
        System.out.println(s);
	}
}


/*
4 4
0
2
2 2 1 0
3 3 1 0
2 3 1 1
2 3 1 2
2 3 1 3
2 3 1 4
2 3 1 5

*/
