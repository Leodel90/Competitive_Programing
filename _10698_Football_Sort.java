import java.text.DecimalFormat;
import java.util.*;
public class _10698_Football_Sort {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		boolean o=false;
		while(true){	
			int t = leer.nextInt();
			int g = leer.nextInt();
			if(t+g==0)break;
			int P[]= new int [t];
			int GSc[]= new int [t];
			int GSu[]= new int [t];
			int GP[]= new int [t];
			leer.nextLine();
			String Teams[]= new String [t];
			for (int i = 0; i < t; i++)
				Teams[i]= leer.nextLine();
			for (int i = 0; i < g; i++){
				String n1= leer.next();
				int g1= leer.nextInt();
				leer.next();
				int g2=leer.nextInt();
				String n2= leer.next();
				int t1=0,t2=0;
				for (int j = 0; j < t; j++){
					if(n1.equals(Teams[j])){t1=j;break;}
				}
				for (int j = 0; j < t; j++){
					if(n2.equals(Teams[j])){t2=j;break;}
				}
				GP[t1]++;GP[t2]++;
			    if(g1!=g2){
			    	if(g1>g2)P[t1]+=3;else P[t2]+=3;
			    }else {P[t1]++;P[t2]++;}
			    GSc[t1]+=g1;GSc[t2]+=g2;
			    GSu[t1]+=g2;GSu[t2]+=g1;
			}
			int R[]= new int [t];
			for (int i = 0; i < t; i++){
				R[i]=i;
				int h =i;
				while(h>0){
			    	String t1=Teams[R[h]].toUpperCase(),t2=Teams[R[h-1]].toUpperCase();boolean qq=false;
			    	int k = 0;
			    	while(true){
			    		if(k<t1.length()&&k<t2.length()){
			    			if(t1.charAt(k)!=t2.charAt(k)){qq=t1.charAt(k)<t2.charAt(k);break;}else k++;
			    		}else {qq=t1.length()<t2.length();break;}
			    	}
					if(P[R[h]]>P[R[h-1]]||P[R[h]]==P[R[h-1]]&&(GSc[R[h]]-GSu[R[h]]>GSc[R[h-1]]-GSu[R[h-1]]||GSc[R[h]]-GSu[R[h]]==GSc[R[h-1]]-GSu[R[h-1]]&&(GSc[R[h]]>GSc[R[h-1]]||GSc[R[h]]==GSc[R[h-1]]&&qq))){int aux = R[h];R[h]=R[h-1];R[h-1]=aux;h--;}else break;
				}
			}
			if(o)System.out.println();else o=true;
			DecimalFormat A= new DecimalFormat("0.00");
			for (int i = 0; i < R.length; i++){String e;
			if(i==0||!(P[R[i]]==P[R[i-1]]&&GSc[R[i]]-GSu[R[i]]==GSc[R[i-1]]-GSu[R[i-1]]&&GSc[R[i]]==GSc[R[i-1]])){e=i+1+".";}else e="  ";
				for (int j=0;j<16-Teams[R[i]].length();j++)
					e=e+" ";
				if(i+1<10)e=" "+e;
				System.out.print(e+Teams[R[i]]);
				e=""+P[R[i]];int l=4-e.length();
			    for (int j = 0; j < l;j++) 
					e=" "+e;
			    System.out.print(e);
			    e=""+GP[R[i]]; l=4-e.length();
			    for (int j = 0; j < l;j++) 
					e=" "+e;
			    System.out.print(e);
			    e=""+GSc[R[i]];l=4-e.length();
			    for (int j = 0; j < l;j++) 
					e=" "+e;
			    System.out.print(e);
			    e=""+GSu[R[i]];l=4-e.length();
			    for (int j = 0; j < l;j++) 
					e=" "+e;
			    System.out.print(e);
			    e=GSc[R[i]]-GSu[R[i]]+"";l=4-e.length();
			    for (int j = 0; j < l;j++) 
					e=" "+e;
			    System.out.print(e);
			    if(GP[R[i]]>0){
			     double w=P[R[i]];w/=(GP[R[i]]*3);
			     e=A.format(w*100);
			     if(e.length()==6)e=" "+e;
			     if(e.length()==5)e="  "+e;
			     if(e.length()==4)e="   "+e;
			     e=e.substring(0,e.length()-3)+"."+e.charAt(e.length()-2)+e.charAt(e.length()-1);
			    }else e="    N/A";
			    System.out.println(e);
			}
		}
	}
}

/*
6 10
tA
tB
tC
td
tE
tF
tA 1 - 1 tB
tC 0 - 0 td
tE 0 - 0 tA
tC 0 - 0 tB
td 0 - 0 tE
tA 0 - 0 tC
tB 0 - 0 tE
td 0 - 0 tA
tE 0 - 0 tC
tB 0 - 0 td
2 2
Botafogo
Flamengo
Botafogo 3 - 2 Flamengo
Flamengo 2 - 3 Botafogo
5 10
tA
tB
tC
tD
tE
tA 0 - 0 tB
tC 0 - 0 tD
tE 0 - 0 tA
tC 0 - 0 tB
tD 0 - 0 tE
tA 0 - 0 tC
tB 0 - 0 tE
tD 0 - 0 tA
tE 0 - 0 tC
tB 0 - 0 tD
3 2
Quinze-Novembro
Flamengo
Santo-Andre
Quinze-Novembro 6 - 0 Flamengo
Flamengo 0 - 2 Santo-Andre
0 0
*/