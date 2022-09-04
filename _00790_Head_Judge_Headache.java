import java.util.*;
public class _00790_Head_Judge_Headache {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int C=leer.nextInt();
		leer.nextLine();
		leer.nextLine();
		for (int xd = 0; xd < C; xd++){
		int M[][]=new int [26][7];
		int T[]=new int [26];
		int P[]=new int [26];
		boolean V[][]=new boolean [26][7];
		int R[]= new int[26];
		int r=0,max=0,k=0;
		LinkedList<Integer> tn= new LinkedList<Integer>();
		LinkedList<String> tp= new LinkedList<String>();
		LinkedList<String> tt= new LinkedList<String>();
		LinkedList<String> tv= new LinkedList<String>();
		try{
			while(true){StringTokenizer W= new StringTokenizer(leer.nextLine());
			if(W.countTokens()==0)break;
			tn.add(Integer.parseInt(W.nextToken()));
			if(tn.getLast()>max)max=tn.getLast();
			tp.add(W.nextToken());
			tt.add(W.nextToken());
			tv.add(W.nextToken());k++;
			}
		}catch(Exception e){}
		int TN[]= new int [k];
		String TP[]= new String [k];
		int  TT[]= new int [k];
		String TV[]= new String [k];
		for (int i = 0; i < k; i++){
			TN[i]=tn.remove();
			TP[i]=tp.remove();
			String f=tt.remove();
			if(f.length()==5)TT[i]=((f.charAt(0)-48)*10+f.charAt(1)-48)*60+(f.charAt(3)-48)*10+f.charAt(4)-48;
			else TT[i]=(f.charAt(0)-48)*60+(f.charAt(2)-48)*10+f.charAt(3)-48;
			TV[i]=tv.remove();
			int h=i;
			while(h>0){
				if(TT[h]<TT[h-1]||TT[h-1]==TT[h]&&TV[h].equals("N")){int aux=TN[h];TN[h]=TN[h-1];TN[h-1]=aux;aux=TT[h];TT[h]=TT[h-1];TT[h-1]=aux;
				String au=TP[h];TP[h]=TP[h-1];TP[h-1]=au;au=TV[h];TV[h]=TV[h-1];TV[h-1]=au;h--;
				}else break;
			}
		}
			for (int i = 0; i < k; i++){
				int n = TN[i];if(n>max)max=n;
				String p=TP[i];
				int t=TT[i];
				String v=TV[i];
				if(!V[n][p.charAt(0)-65]){
				if(v.charAt(0)=='Y'){
					V[n][p.charAt(0)-65]=true;
					T[n]=T[n]+t+M[n][p.charAt(0)-65];
					P[n]++;
				}else M[n][p.charAt(0)-65]+=20;
				}
			}

		for (int i = 1; i <=max; i++){
			R[r]=i;
			int h=r;
			while(h>0){boolean q=P[R[h]]>P[R[h-1]]||P[R[h]]==P[R[h-1]]&&(T[R[h]]<T[R[h-1]]||T[R[h]]==T[R[h-1]]&&R[h]<R[h-1]);
				if(q){
					int aux=R[h];R[h]=R[h-1];R[h-1]=aux;h--;
				}else break;
			}r++;
		}
		int h=0,p=8,t=-1,c=1;
		if(xd>0)System.out.println();
		System.out.println("RANK TEAM PRO/SOLVED TIME");
		for (int i = 0; i < r; i++){
			if(P[R[i]]<p||T[R[i]]>t){h=h+c;c=1;}
			else c++;
			p=P[R[i]];t=T[R[i]];
			String e="  ";
			if(h<10)e+=' ';
			System.out.print(e+h);
			e="   ";
			if(R[i]<10)e+=' ';
			System.out.print(e+R[i]);
			if(p>0){System.out.print("    "+p+"       ");
			e="";
			if(t<1000)e=" ";
			if(t<100)e+=" ";
			if(t<10)e+=" ";
			System.out.print(e+t);
			}
			System.out.println();
		}
		}
	}
}

