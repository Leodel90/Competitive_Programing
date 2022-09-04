import java.util.*;
public class Truco_de_magia {

	public static void main(String[] args) {
	   Scanner leer = new Scanner (System.in);
	   boolean p[];
	   while(leer.hasNext()){
		   int t = leer.nextInt();
		   for (int xd = 1; xd <=t; xd++) {
			int n = leer.nextInt();
			int c =0,k=0,r=0;
			leer.nextLine();
			p=new boolean[17];
			for (int i = 1; i <=4; i++) {
				if(i==n){
					p[leer.nextInt()]=true;
					p[leer.nextInt()]=true;
					p[leer.nextInt()]=true;
					p[leer.nextInt()]=true;
				}
				leer.nextLine();
			}
			n=leer.nextInt();
			leer.nextLine();
			for (int i = 1; i <=4; i++) {
				if(i==n){
					for (int j = 0; j <4; j++) {
						 k = leer.nextInt();
					if(p[k]){c++;r=k;}
					}
				}
				 leer.nextLine();
			}
			if(c==1)System.out.println("Case #"+xd+": "+r);
			else {if(c>1)System.out.println("Case #"+xd+": Bad magician!");
			else System.out.println("Case #"+xd+": Volunteer cheated!");}
			
		}
		   
	   }

	}

}
/*
3
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
3
1 2 5 4
3 11 6 15
9 10 7 12
13 14 8 16
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
2
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
3
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
 
 
*/
 