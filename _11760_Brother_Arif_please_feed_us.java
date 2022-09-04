import java.util.*;
public class _11760_Brother_Arif_please_feed_us {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t =1;
        while(true){
		int r = leer.nextInt();
        int c = leer.nextInt();
        long n = leer.nextLong();
        if(r+c+n==0)break;
          boolean X[]= new boolean[r];
          boolean Y[]= new boolean[c];
          for (int i = 0; i < n; i++){
        	  X[leer.nextInt()]=true;
        	  Y[leer.nextInt()]=true;
          }
          int x=leer.nextInt(),y=leer.nextInt();
          if(!X[x]&&!Y[y]||!X[x]&&(y>0&&!Y[y-1]||y<c-1&&!Y[y+1])||!Y[y]&&(x>0&&!X[x-1]||x<r-1&&!X[x+1]))
        	  System.out.println("Case "+t+": Escaped again! More 2D grid problems!");
          else System.out.println("Case "+t+": Party time! Let's find a restaurant!");t++;
        }
	}
}

/*
5 5 2
0 1
4 2
1 2
5 5 3
0 1
4 2
4 3
1 2
0 0 0

*/