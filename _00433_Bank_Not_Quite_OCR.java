import java.io.*;
import java.util.LinkedList;
public class _00433_Bank_Not_Quite_OCR{
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader  br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n= Integer.parseInt(br.readLine());
		int N[]= {490,288,242,434,312,410,474,290,506,442};
		for(int xd = 0; xd < n; xd++){
			int C[]= new int [9];
			for (int i = 0,p=1; i < 3; i++,p=p<<3){String h = br.readLine();
				for (int j=0,pp=p; j < 9; j++,pp=p){
					for (int k = 0; k < 3; k++){
						if(h.charAt(j*3+k)!=' '){
							C[j]=C[j]|pp;
						}
						pp=pp<<1;
					}
				}
			}
			LinkedList<Integer> Pi= new LinkedList<Integer>(),Pm= new LinkedList<Integer>();
			LinkedList<StringBuilder> Ps= new LinkedList<StringBuilder>();
			StringBuilder R=new StringBuilder(),Q=new StringBuilder();
			int p=0,i=0,c=0,m=0;
			boolean q=true,qq=true,sw=true,qr,qs;
			while(true){
				if(q){
					if(qq){
						if(p==9){
							if(m==0){
								R=Q; Q=new StringBuilder();c++;}
							q=false;
						}
					}qq=false;
					while(q&&i<10&&c<2){qr=true;
						qs=N[i]==C[p];
						qr=(N[i]&C[p])==C[p]&&(qs||!(qs)&&sw);
						if(qr){
							if(!qs)sw=false;
							Pi.add(i);Ps.add(Q);Q=new StringBuilder(Ps.getLast());Q.append(i);
							Pm.add(m);m=(m+(i*(9-p))%11)%11;p++;i=0;qq=true;break;
						}i++;
					}q=qq;
				}else{if(p==0)break;
					i=Pi.removeLast();p--;
					m=Pm.removeLast();Q=Ps.removeLast();
					qq=false;q=true;
					if(!sw)sw=N[i]!=C[p];
					i++;
				}
			}
			if(c==0)pw.println("failure");
			if(c==1)pw.println(R);
			if(c==2)pw.println("ambiguous");
		}
		pw.close();
	}
}
/*
4
    _  _     _  _  _  _  _ 
  | _| _||_||_ |_   ||_||_|
  | _  _|  | _||_|  ||_| _|
    _  _  _  _  _  _     _ 
|_||_|| || ||_   |  |  ||_ 
  | _||_||_||_|  |  |  | _|
 _  _  _  _  _  _  _  _  _ 
|_||_||_||_||_||_||_||_||_|
|_||_||_||_||_||_||_||_||_|
 _     _  _  _  _  _  _  _ 
|_|  ||_||_||_||_||_||_||_|
|_|  ||_||_||_||_||_||_||_|

*/