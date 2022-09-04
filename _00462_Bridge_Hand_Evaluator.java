import java.util.*;
public class _00462_Bridge_Hand_Evaluator {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(leer.hasNext()){
			String c;
			int C[]= new int[4];
			int s =0;
			LinkedList<String> F= new LinkedList<String>();
			for (int i = 0,j=0; i < 13; i++){
				c= leer.next();
			    if(c.charAt(1)=='S')j=0;
			    if(c.charAt(1)=='H')j=1;
			    if(c.charAt(1)=='D')j=2;
			    if(c.charAt(1)=='C')j=3;
			    C[j]++;
			    if(c.charAt(0)>57 && c.charAt(0)!='T'){
			    if(c.charAt(0)=='J')s++;
			    if(c.charAt(0)=='Q')s=s+2;
			    if(c.charAt(0)=='K')s=s+3;
			    if(c.charAt(0)=='A')s=s+4;
			    F.add(c);
			    }
			}
			int j=0;
			boolean M[][]= new boolean [3][4];
			while(!F.isEmpty()){
				c=F.remove();
			    if(c.charAt(1)=='S')j=0;
			    if(c.charAt(1)=='H')j=1;
			    if(c.charAt(1)=='D')j=2;
			    if(c.charAt(1)=='C')j=3;
			    if(c.charAt(0)=='K' && C[j]-1==0)s--;
			    if(c.charAt(0)=='Q' && C[j]-1<=1)s--;
			    if(c.charAt(0)=='J' && C[j]-1<=2)s--;
			    if(c.charAt(0)=='A')M[0][j]=true;
			    if(c.charAt(0)=='K')M[1][j]=true;
			    if(c.charAt(0)=='Q')M[2][j]=true;
			}
			boolean m=M[0][0]|| M[1][0]&&C[0]>=2||M[2][0]&&C[0]>=3,
					n=M[0][1]|| M[1][1]&&C[1]>=2||M[2][1]&&C[1]>=3,
					p=M[0][2]|| M[1][2]&&C[2]>=2||M[2][2]&&C[2]>=3,
					q=M[0][3]|| M[1][3]&&C[3]>=2||M[2][3]&&C[3]>=3;
			if(s<16 || !(m&&n&&p&&q)){
				if(C[0]<=2)s++;if(C[0]<=1)s++;
				if(C[1]<=2)s++;if(C[1]<=1)s++;
				if(C[2]<=2)s++;if(C[2]<=1)s++;
				if(C[3]<=2)s++;if(C[3]<=1)s++;
				if(s>=14){
					int max=-1;
					char y=' ';
					if(C[0]>max){y='S';max=C[0];}
					if(C[1]>max){y='H';max=C[1];}
					if(C[2]>max){y='D';max=C[2];}
					if(C[3]>max){y='C';max=C[3];}
					System.out.println("BID "+y);
				}else System.out.println("PASS");
			}else System.out.println("BID NO-TRUMP");
		}
	}
}
