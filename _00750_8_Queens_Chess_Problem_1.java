import java.util.*;
public class _00750_8_Queens_Chess_Problem_1{
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int T= leer.nextInt();
		for (int xd = 0;xd < T; xd++){
        int a= leer.nextInt(),b= leer.nextInt();
        boolean F[]= new boolean[9];
        boolean DD[]= new boolean[16];
        boolean DI[]= new boolean[16];
        F[a]=true;DD[b-a+8]=true;DI[a+b-1]=true;
        int r=1,i=1,j=1,aj=1;
        int CR[]= new int[9];CR[b]=a;
        LinkedList<Integer> pr= new LinkedList<Integer>(),pc=new LinkedList<Integer>();
        pr.add(a);pc.add(b);
        System.out.println("SOLN       COLUMN");
        System.out.println(" #      1 2 3 4 5 6 7 8");
        System.out.println();
        while(true){
        	while(i<=8){
        		if(i!=b){j=aj;
        		while(j<=8){
        			if(!F[j]&&!DD[i-j+8]&&!DI[i+j-1]){F[j]=true;DD[i-j+8]=true;DI[i+j-1]=true;
        			 CR[i]=j;pc.add(i);pr.add(j);aj=1;break;
        			}
        			j++;
        		}}
        		if(j==9){if(i==1)break;int y=pc.removeLast(),x=pr.removeLast();F[x]=false;
        		DD[y-x+8]=false;DI[x+y-1]=false;aj=x+1;i=y;
        		}else i++;
        	}
        	if(i!=9)break;
        	if(r<10)System.out.print(" ");
        	System.out.print(r+"      ");
        	r++;
        	for (int k = 1; k <=7; k++){
				System.out.print(CR[k]+" ");
			}System.out.println(CR[8]);
			i=pc.removeLast();aj=pr.removeLast();
			F[aj]=false;DD[i-aj+8]=false;DI[aj+i-1]=false;
			aj++;
        }
        if(xd!=T-1)System.out.println();
		}
	}
}
/*
1 1

*/