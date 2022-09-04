import java.util.*;
public class VDeVenganza {
//Concurso 143
	static int zx[];
	static int zy[];
	static int bx[];
	static int by[];
	static int r[];
	public static Double Distancia(int a,int b,int c,int d){return Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));}
	
   public static int Total(int i ,int m[],int s[]){
	   int z =0;
	   for (int k = 0; k < m.length; k++) {
		double d = Distancia(bx[i],by[i],zx[k],zy[k]);
		if(d<=r[i] && m[k]!=-1){z++;m[k]=-1;}
	   }
	   for (int j = 0; j<r.length; j++){
		  if(j!=i && s[j]!=-1){
		   double d = Distancia(bx[i], by[i],bx[j],by[j]);
		   if(d<=r[i]){s[j]=-1;z=z+Total(j,m,s);}
		  }
	   }
	   return z;
   }
   
   static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
    int N = leer.nextInt();
     for (int xd = 0; xd < N; xd++) {
		int p = leer.nextInt();
		int q = leer.nextInt();
		    zx=new int [p];
		    zy=new int [p];
		    bx=new int [q];
		    by=new int [q];
		    r=new int [q];
		for (int i = 0; i < p; i++) {
			zx[i]=leer.nextInt();
			zy[i]=leer.nextInt();
		}
		int max=0;
		
	    for (int i = 0; i < q; i++) {
	    	
	    	bx[i]=leer.nextInt();
			by[i]=leer.nextInt();
			r[i]=leer.nextInt();
		 }
	    System.out.println(Arrays.toString(bx));
	    System.out.println(Arrays.toString(by));
	    System.out.println(Arrays.toString(r));
	     for (int i = 0; i < q; i++) {
	    	 int m[]=new int [p];
	    	 int s[]=new int [q];
	    	 int z = Total(i,m,s);
	    	 System.out.println(z);
			    if(z>max)max=z;
	     } 
System.out.println(max);
	}

/*
2
13 3 
2 2
3 1
3 3
4 2
4 6
5 6
8 2
8 4
8 8
8 9
8 12
11 6
12 6
3 2 2
8 6 5
8 10 3


4 5
0 0 
2 2
0 2
2 0
1 5 1
3 -1 2
2 3 1
1 4 2
0 3 1
*/

	}

}
