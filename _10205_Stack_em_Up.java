import java.util.*;
public class _10205_Stack_em_Up{ 
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		String suit[]={"Clubs", "Diamonds", "Hearts", "Spades"};
		String values[]={"2","3","4","5","6","7","8","9","10","Jack","Queen","King", "Ace"};
		for (int i = 0; i < n; i++){
			int x = leer.nextInt();
			int M[][]= new int [x+1][53];
			for (int j = 1; j <=x; j++) {
				for (int k = 1; k <=52; k++){
					M[j][k]=leer.nextInt();
				}
			}
			int v[]= new int [53];
			for (int j = 1; j <=52; j++)
			   v[j]=j;
			String c;
			leer.nextLine();
			try{
			while(true){
				c=leer.nextLine();
				if(c.length()>0){int p[]= new int[53];
				int t=Integer.parseInt(c);
				for (int j = 1; j <=52; j++)
					p[j]=v[M[t][j]];
				v=p.clone();
				}else break;
			}
			}catch(Exception e){}
			for (int j = 1,r=0,y=0; j <=52; j++){
				if(v[j]<=13){r=1;y=0;}
				if(v[j]>13&&v[j]<=26){y=1; r=14;}
				if(v[j]>26&&v[j]<=39){y=2; r=27;}
				if(v[j]>39){y=3; r=40;}
				System.out.println(values[v[j]-r]+" of "+suit[y]);
			}if(i!=n-1)
			System.out.println();
		}
	}
}
