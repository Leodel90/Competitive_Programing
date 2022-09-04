import java.util.*;
public class _11902_Dominator {
	//Revisar esta mal la logica
	static int n,L[],k;
	static Lista A[],R[];
	static boolean P[],V[];
	static char res[][];
	public static void Llena(int i){
       L[k]=i;k++;
       for (int j = 0; j < k; j++){
		res[L[j]][i]='Y';
	   }
       while(!R[i].ini.isEmpty())
    	   Llena(R[i].ini.pollFirst());
       k--;
	}

	
	public static void Calcula(int i,int p){
		if(!P[i]){
			P[i]=true;
			V[i]=true;
			R[i].p=p;
			R[p].ini.add(i);
			TreeSet<Integer> aux = (TreeSet<Integer>) A[i].ini.clone();
			while(!aux.isEmpty()){
				Calcula(aux.pollFirst(),i);
			}
			V[i]=false;
		}else{
			int c=R[i].p;
			while(!V[c]){
					c=R[c].p;
			}
			R[R[i].p].ini.remove(i);
			R[i].p=c;
			R[c].ini.add(i);
		}
	}
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
		for(int xd = 1; xd <= t; xd++){
		     n= leer.nextInt();
		     A= new Lista[n];
		     res= new char[n][n];
		     R= new Lista[n];
		     for (int i = 0; i < n; i++){A[i]=new Lista();R[i]=new Lista();}
		     for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++){ 
					if(leer.nextInt()==1)
					A[i].add(j);
					res[i][j]='N';
				}
		    P= new boolean[n];
		    V= new boolean[n];
		    Calcula(0,0);
		    L= new int[n+1];
		    k=0;
		    Llena(0);
		    System.out.println("Case "+xd+":");
		    StringBuilder R= new StringBuilder();
		    R.append("+");
		    for (int i = 0; i < n-1; i++)
				R.append("--");
			R.append("-+");
			System.out.println(R);
			for (int i = 0; i < n; i++){
				for (int j = 0; j < n; j++){
					System.out.print("|"+res[i][j]);
				}
				System.out.print("|");
				System.out.println();
				System.out.println(R);
			}
		}
	}
public static class Lista{
 TreeSet<Integer> ini;
 int p;
    public Lista(){
    	ini=new TreeSet<Integer>();p=0;
    }
    public void add(int x){
        ini.add(x);
    }
}
}

/*
7
12
1 1 1 0 0 1 1 1 1 0 0 0
0 0 1 0 1 0 0 1 1 1 0 1
0 0 1 1 0 1 1 0 0 1 0 0
0 1 1 0 1 0 0 0 0 1 0 1
1 0 0 1 1 0 0 0 0 1 1 1
1 1 1 1 0 1 0 0 0 1 0 0
1 1 0 1 0 0 0 0 1 1 1 0
1 1 0 0 0 0 1 1 1 0 1 1
1 1 1 1 0 0 1 0 1 1 1 1
0 0 1 1 1 0 1 0 1 0 0 0
0 1 1 1 1 0 0 0 1 1 0 0
1 1 0 0 1 1 0 1 1 1 0 0
10
0 0 0 0 0 0 0 0 0 0
1 1 1 1 1 0 1 0 0 0
1 1 1 1 0 1 0 0 0 1
1 1 1 1 1 0 1 1 1 0
1 1 1 0 1 1 1 1 0 0
1 1 1 1 1 1 1 1 1 1
1 1 1 0 1 1 1 1 1 1
0 1 1 1 1 0 1 1 1 1
1 1 1 1 1 1 0 1 1 1
1 0 1 0 1 1 0 1 1 1
5
1 0 0 0 1
1 0 0 0 1
1 0 0 0 1
0 0 0 0 0
1 1 0 0 1
10
1 0 0 0 0 0 0 0 0 1
1 1 1 1 1 0 1 1 0 1
1 1 1 1 0 1 0 0 0 1
1 1 1 1 1 1 1 1 1 0
1 1 1 1 1 1 1 1 0 0
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
0 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 1
5
0 1 1 0 0
0 0 0 1 0
0 0 0 1 0
0 0 0 0 1
0 0 0 0 0
10
1 0 0 0 0 1 0 1 0 1
1 0 0 1 0 0 1 1 0 1
0 0 0 1 1 1 1 0 1 0
0 0 0 1 0 0 0 0 1 0
0 1 1 1 1 1 0 1 1 0
0 0 1 0 1 1 1 1 1 0
0 0 1 1 1 0 1 1 1 0
0 1 1 1 0 0 0 1 0 0
1 1 1 1 1 1 0 1 0 1
1 1 1 1 0 1 1 1 1 1
4
1 1 0 1
1 0 1 1
1 1 1 1
1 1 0 1


Case 1:
+-----------------------+
|Y|Y|Y|Y|Y|Y|Y|Y|Y|Y|Y|Y|
+-----------------------+
|N|Y|N|N|N|N|N|N|N|N|N|N|
+-----------------------+
|N|N|Y|N|N|N|N|N|N|N|N|N|
+-----------------------+
|N|N|N|Y|N|N|N|N|N|N|N|N|
+-----------------------+
|N|N|N|N|Y|N|N|N|N|N|N|N|
+-----------------------+
|N|N|N|N|N|Y|N|N|N|N|N|N|
+-----------------------+
|N|N|N|N|N|N|Y|N|N|N|N|N|
+-----------------------+
|N|N|N|N|N|N|N|Y|N|N|N|N|
+-----------------------+
|N|N|N|N|N|N|N|N|Y|N|N|N|
+-----------------------+
|N|N|N|N|N|N|N|N|N|Y|N|N|
+-----------------------+
|N|N|N|N|N|N|N|N|N|N|Y|N|
+-----------------------+
|N|N|N|N|N|N|N|N|N|N|N|Y|
+-----------------------+
Case 2:
+-------------------+
|Y|N|N|N|N|N|N|N|N|N|
+-------------------+
|N|N|N|N|N|N|N|N|N|N|
+-------------------+
|N|N|N|N|N|N|N|N|N|N|
+-------------------+
|N|N|N|N|N|N|N|N|N|N|
+-------------------+
|N|N|N|N|N|N|N|N|N|N|
+-------------------+
|N|N|N|N|N|N|N|N|N|N|
+-------------------+
|N|N|N|N|N|N|N|N|N|N|
+-------------------+
|N|N|N|N|N|N|N|N|N|N|
+-------------------+
|N|N|N|N|N|N|N|N|N|N|
+-------------------+
|N|N|N|N|N|N|N|N|N|N|
+-------------------+
Case 3:
+---------+
|Y|Y|N|N|Y|
+---------+
|N|Y|N|N|N|
+---------+
|N|N|N|N|N|
+---------+
|N|N|N|N|N|
+---------+
|N|Y|N|N|Y|
+---------+
Case 4:
+-------------------+
|Y|Y|Y|Y|Y|Y|Y|Y|Y|Y|
+-------------------+
|N|Y|N|N|N|N|N|N|N|N|
+-------------------+
|N|N|Y|N|N|N|N|N|N|N|
+-------------------+
|N|N|N|Y|N|N|N|N|N|N|
+-------------------+
|N|N|N|N|Y|N|N|N|N|N|
+-------------------+
|N|N|N|N|N|Y|N|N|N|N|
+-------------------+
|N|N|N|N|N|N|Y|N|N|N|
+-------------------+
|N|N|N|N|N|N|N|Y|N|N|
+-------------------+
|N|N|N|N|N|N|N|N|Y|N|
+-------------------+
|N|Y|Y|Y|Y|Y|Y|Y|Y|Y|
+-------------------+
Case 5:
+---------+
|Y|Y|Y|Y|Y|
+---------+
|N|Y|N|N|N|
+---------+
|N|N|Y|N|N|
+---------+
|N|N|N|Y|Y|
+---------+
|N|N|N|N|Y|
+---------+
Case 6:
+-------------------+
|Y|Y|Y|Y|Y|Y|Y|Y|Y|Y|
+-------------------+
|N|Y|N|N|N|N|N|N|N|N|
+-------------------+
|N|N|Y|N|N|N|N|N|N|N|
+-------------------+
|N|N|N|Y|N|N|N|N|N|N|
+-------------------+
|N|N|N|N|Y|N|N|N|N|N|
+-------------------+
|N|N|N|N|N|Y|N|N|N|N|
+-------------------+
|N|N|N|N|N|N|Y|N|N|N|
+-------------------+
|N|N|N|N|N|N|N|Y|N|N|
+-------------------+
|N|N|N|N|N|N|N|N|Y|N|
+-------------------+
|N|N|N|N|N|N|N|N|N|Y|
+-------------------+
Case 7:
+-------+
|Y|Y|Y|Y|
+-------+
|N|Y|Y|N|
+-------+
|N|N|Y|N|
+-------+
|N|N|N|Y|
+-------+
 */
