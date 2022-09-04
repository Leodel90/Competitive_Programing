import java.util.*;
public class _00297_Quadtrees{
	static int Q[];
	static int P[]={1024,256,64,16,4,1};
	public static void Llena(String cad){
		LinkedList<Integer> L= new LinkedList<Integer>();
		LinkedList<Integer> C= new LinkedList<Integer>();
		LinkedList<Integer> T= new LinkedList<Integer>();
		L.add(1);
		int c=1,p=0;
		for (int i = 0; i < cad.length();i++){
			int x= L.removeLast();
			if(cad.charAt(i)!='p'){
				if(cad.charAt(i)=='f')Q[x]=P[p];c--;
				while(c==0){p--;if(p<0)break;
				 c=C.removeLast();x=T.removeLast();
				 Q[x]=0;
				 for (int j = x*4+1; j >=x*4-2; j--)Q[x]+=Q[j];
				}
			}else{for (int j = x*4+1; j >=x*4-2; j--)L.add(j);
			      C.add(c-1);c=4;T.add(x);p++;
			      }
		}
	}
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int n= leer.nextInt();
		for (int i = 0; i < n; i++){
		   Q= new int [1366];
		   Llena(leer.next());
		   Llena(leer.next());
		   System.out.println("There are "+Q[1]+" black pixels.");
		}
	}
}

/*
3
ppeeefpffeefe
pefepeefe
peeef
peefe
peeef
peepefefe

*/