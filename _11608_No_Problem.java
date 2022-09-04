import java.util.*;
public class _11608_No_Problem {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = 1;
        while(true){
        	int s= leer.nextInt();
        	if(s>=0){
        		int M[]= new int [12];
        		for (int i = 0; i < 12; i++) 
					M[i]=leer.nextInt();
        		System.out.println("Case "+t+":");
        		for (int i = 0; i < 12; i++) {
        			int h = leer.nextInt();
					if(s>=h){System.out.println("No problem! :D");s-=h;}
					else System.out.println("No problem. :(");
					s+=M[i];
				}t++;
        	}else break;
        }
	}
}

/*
5
3 0 3 5 8 2 1 0 3 5 6 9
0 0 10 2 6 4 1 0 1 1 2 2
-1
*/
