import java.util.*;
public class Come_todo_el_Helado_que_puedas {
	public static int H[][],S,c,m,max,Sumas[][];
	public static boolean p;
	public static void Combinaciones(int i){
	   if(i==c){
			if(S>max){max=S;p=max==m;}
		}
		else{
			for (int j = 1; j <=H[i][0] && !p; j++){
				S=S+H[i][j];
			    if(S<=m && Sumas[i][S]==0)
			    {Sumas[i][S]=1;
			    	Combinaciones(i+1);}
				S=S-H[i][j];
			}
		}
	}
	public static void main(String[] args) {
try{
		Scanner leer = new Scanner (System.in);
while(leer.hasNext()){
	int n = leer.nextInt();
	for (int xd = 0; xd < n; xd++) {
		m = leer.nextInt();
		c = leer.nextInt();
		H= new int[c][21];
		S=0;
		max=-1;
		p=false;
		int m1=0,m2=0;
		for (int i = 0; i < c; i++) {
			H[i][0] = leer.nextInt();
			int a=0,b=0;
			for (int j = 1; j <=H[i][0]; j++) {
				H[i][j]= leer.nextInt();
			    if(H[i][j]>a)a=H[i][j];
			    if(H[i][j]<b||b==0)b=H[i][j];
			}
			m1=m1+a;
			m2=m2+b;
	    }
		if(m1<=m)max=m1; 
		if(m2>m)max=0;
		if(max==-1){
		Sumas=new int[c][m1+1];Combinaciones(0);
		}
		
	    if(max!=0)System.out.println(max);
	    else System.out.println("No es posible");
	    
	}
	}
   }catch (Exception E){}
	}
}
/*
4
100 4
3 8 6 4
2 5 10
4 1 3 3 7
4 50 14 23 8
20 3
3 4 6 8
2 5 10
4 1 3 5 5
5 3
3 6 4 8
2 10 6
4 7 3 1 7
10 10
2 1 1
2 1 1
2 1 1
2 1 1
2 1 1
2 1 5
2 1 1
2 1 1
2 1 1
2 1 1
*/
