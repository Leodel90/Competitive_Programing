import java.util.*;
public class Sombras {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        while(true){
        	int c=leer.nextInt();
        	int f = leer.nextInt();
        	int a= leer.nextInt();
        	boolean M[][] = new boolean [f][c];
        	   if(c!=0 || f!=0 || a!=0){
        		   int res=0;
        		   LinkedList<Integer> A = new LinkedList<Integer>();
        		   LinkedList<Integer>B= new LinkedList<Integer>();
        		    for (int i = 0; i < a; i++){
						int x=leer.nextInt()-1;
        		        int y=leer.nextInt()-1;
        		        M[y][x]=true;
        		        A.add(x);
        		        B.add(y);
					}
        		    for (int i = 0; i < a; i++){
						int x= A.remove();
						int y= B.remove();
						if(x>=1 && y>=1){if(!M[y-1][x-1]){res++;M[y-1][x-1]=true;}
        		        } 
        		        if(y>=1){if(!M[y-1][x]){res++;M[y-1][x]=true;}
        		        }
        		        if(x<c-1 && y>=1){if(!M[y-1][x+1]){res++;M[y-1][x+1]=true;}
        		        }
        		        if(x>=1){if(!M[y][x-1]){res++;M[y][x-1]=true;}
        		        }
        		        if(x<c-1){if(!M[y][x+1]){res++;M[y][x+1]=true;}
        		        }
        		        if(x>=1 && y<f-1){if(!M[y+1][x-1]){res++;M[y+1][x-1]=true;}
        		        }
        		        if(y<f-1){if(!M[y+1][x]){res++;M[y+1][x]=true;}
        		        }
        		        if(x<c-1 && y<f-1){if(!M[y+1][x+1]){res++;M[y+1][x+1]=true;}
        		        }
					}
        		   System.out.println(res);
        	   }else break;	
        }
	}

}
