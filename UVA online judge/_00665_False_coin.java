import java.util.*;
public class _00665_False_coin {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        int m = leer.nextInt();
        for (int i = 0; i < m; i++){
		    int n =leer.nextInt();
		    int k =leer.nextInt();
		    int V[]= new int [n+1];
		    boolean q=true;
		    int cl=0,ch=0,cv=0;
		    for (int j = 0; j < k; j++){
				int p=leer.nextInt();
				LinkedList<Integer>C1=new LinkedList<Integer>();
				LinkedList<Integer>C2=new LinkedList<Integer>();
				for (int l = 0; l < p; l++)C1.add(leer.nextInt());
				for (int l = 0; l < p; l++)C2.add(leer.nextInt());
				String cad = leer.next();
				if(q){
				if(cad.charAt(0)!='='){int Y[]= new int[n+1];
					if(cad.charAt(0)=='<'){while(!C1.isEmpty())Y[C1.remove()]=1;while(!C2.isEmpty())Y[C2.remove()]=2;
					}else{while(!C2.isEmpty())Y[C2.remove()]=1;while(!C1.isEmpty())Y[C1.remove()]=2;}
					int x=0,y=0;
					   for (int l = 1; l <=n&&q; l++){
						if(Y[l]>0){
							if(V[l]>=0){
								if(V[l]!=0){
									if(V[l]!=Y[l]){if(V[l]==1)cl--;else ch--;V[l]=-1;cv++;q=cl+ch>0;}
								}else{if(cl+ch==0){if(Y[l]==1)x++;else y++;V[l]=Y[l];}else{V[l]=-1;cv++;}}
							}
						}else{if(V[l]>0){if(V[l]==1)cl--;else ch--;V[l]=-1;cv++;q=cl+ch>0;}}
					   }
					   if(q){cl+=x;ch+=y;}
				}else{
					int y=cl+ch;
					while(!C1.isEmpty()){
						int x=C1.remove();
						if(V[x]==1)cl--;
						if(V[x]==2)ch--;
						if(V[x]!=-1){V[x]=-1;cv++;}
					}
					while(!C2.isEmpty()){
						int x=C2.remove();
						if(V[x]==1)cl--;
						if(V[x]==2)ch--;
						if(V[x]!=-1){V[x]=-1;cv++;}
					}
					q=y==0||cl+ch>0;
				}
				}
			}
		    if(i>0)System.out.println();
		    if(q&&(cl+ch==1||cv==n-1)){
		    	for (int j = 1; j <=n; j++){if(V[j]>0||V[j]==0&&cv==n-1){System.out.println(j);break;}}
		    }else System.out.println(0);
		}
	}
}

/*
3

5 3
2 1 2 3 4
<
1 1 4
=
1 2 5
=

10 5
3 10 9 8 7 6 5
=
4 10 9 8 7 6 5 4 3
>
1 9 7
=
4 1 5 7 4 2 3 8 9 
<
1 2 3
=

10 5
3 10 9 8 7 6 5
=
4 10 9 8 7 6 5 4 3
>
1 9 4
=
4 1 5 7 4 2 3 8 9 
<
1 2 3
=

1
10 2
3 10 9 8 7 6 5
=
4 4 10 9 8 3 7 6 5  
<

1
10 4
3 10 9 8 7 6 5
=
1 4 3
<  
1 3 1
>
4 4 10 9 8 3 7 6 5  
<
*/