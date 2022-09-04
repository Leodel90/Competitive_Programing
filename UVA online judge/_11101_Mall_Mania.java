import java.util.*;
public class _11101_Mall_Mania{
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		while(leer.hasNext()){
			int M[][]= new int [2001][2001];
			int p= leer.nextInt();
			if(p==0)return;
			LinkedList<Integer> X = new LinkedList<Integer>();
			LinkedList<Integer> Y = new LinkedList<Integer>();
			for (int i = 0; i < p; i++) {
				int x = leer.nextInt();int y = leer.nextInt();
				M[x][y]=-1;
				X.add(x);Y.add(y);
			}
			p= leer.nextInt();
			for (int i = 0; i < p; i++) {
				int x=leer.nextInt(),y=leer.nextInt();
				M[x][y]= -2;
			}
			boolean q=true;
			int res=0,l=2;
		    while(q){int Cx= X.size();
		    	for (int i = 0; i < Cx; i++) {
		    		int x =X.remove();
		    		int y= Y.remove();
		    		if(x>0){
		    			if(M[x-1][y]==0){
		    				M[x-1][y]=M[x][y]+l;
		    				X.add(x-1);Y.add(y);
		    			}else{
		    				if(M[x-1][y]==-2){res=M[x][y]+l;q=false;break;}
		    			}
		    		}
		    		if(x<2000){
		    			if(M[x+1][y]==0){
		    				M[x+1][y]=M[x][y]+l;
		    				X.add(x+1);Y.add(y);
		    			}else{
		    				if(M[x+1][y]==-2){res=M[x][y]+l;q=false;break;}
		    			}
		    		}
		    		if(y>0){
		    			if(M[x][y-1]==0){
		    				M[x][y-1]=M[x][y]+l;
		    				X.add(x);Y.add(y-1);
		    			}else{
		    				if(M[x][y-1]==-2){res=M[x][y]+l;q=false;break;}
		    			}
		    		}
		    		if(y<2000){
		    			if(M[x][y+1]==0){
		    				M[x][y+1]=M[x][y]+l;
		    				X.add(x);Y.add(y+1);
		    			}else{
		    				if(M[x][y+1]==-2){res=M[x][y]+l;q=false;break;}
		    			}
		    		}
		    	}
		    	l=1;
		    }
		    System.out.println(res);
		}
	}
}
