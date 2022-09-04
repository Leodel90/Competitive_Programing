import java.util.*;
public class _00514_Rails {
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
        while(true){
        	int n = leer.nextInt();
        	if(n==0)break;
        	while(true){
        		int x =leer.nextInt(),max=1;
        		if(x==0)break;
        		LinkedList<Integer> L=new  LinkedList<Integer>();
        		while(max<x){L.add(max);max++;}
        		boolean q=true;
        		for (int i = 1; i<n ; i++){
				    x=leer.nextInt();
				    if(x>max){max++;while(max<x){L.add(max);max++;}
				    }else {q=!L.isEmpty()&&x==L.removeLast()&&q;}
				}
        		if(q)System.out.println("Yes");
        		else System.out.println("No");
        	}
        	System.out.println();
        }
	}
}

/*
5
1 2 3 4 5
5 4 1 2 3
0
6
6 5 4 3 2 1
0
0


*/