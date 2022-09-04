import java.util.*;
public class _00119_Greedy_Gift_Givers {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		boolean r=false;
		while(leer.hasNext()){
			int n = leer.nextInt();
			String A[]= new String[n];
			int GR[]= new int[n];
			for (int i = 0; i < n; i++) 
				A[i]= leer.next();
			int g;
			for (int i = 0; i < n; i++){
					String cad = leer.next();
					int j= 0;
					while(!A[j].equals(cad))j++;
					g= leer.nextInt();
					int c= leer.nextInt();
					if(c>0){
						int h=g/c;
						int t=g%c;
					while(c>0){c--;
					cad= leer.next();
						int k =0;
						while(!A[k].equals(cad))k++;
						GR[k]+=h;
					}
					GR[j]=GR[j]+t-g;
					}
			}
			if(r)
				System.out.println();
			else r=true;
			for (int i = 0; i < n; i++){
				System.out.println(A[i]+" "+GR[i]);
			}
		}
	}
}

/*

10
qghume ylnlf xfir vscxggb kfnqdux fnf zvsrtkjpr pggxrpn vystmwcy yyc
zvsrtkjpr 1805 1 yyc
qghume 1350 6 ylnlf vscxggb vystmwcy yyc vscxggb kfnqdux
kfnqdux 756 4 zvsrtkjpr zvsrtkjpr ylnlf vystmwcy
kfnqdux 439 1 vscxggb
pggxrpn 1538 5 xfir yyc ylnlf vscxggb fnf
yyc 1658 4 qghume pggxrpn zvsrtkjpr vscxggb
zvsrtkjpr 1021 4 kfnqdux xfir qghume yyc
pggxrpn 1573 2 xfir zvsrtkjpr
qghume 1161 3 fnf pggxrpn fnf
kfnqdux 31 6 qghume qghume ylnlf zvsrtkjpr qghume pggxrpn
8
atxdknly yhfixjsw kkufnuxxzr bmnmgq oketl hnkoaugzq cddi teiojwa
kkufnuxxzr 886 1 yhfixjsw
hnkoaugzq 142 5 atxdknly yhfixjsw cddi kkufnuxxzr bmnmgq
hnkoaugzq 1699 3 oketl oketl bmnmgq
atxdknly 600 1 bmnmgq
hnkoaugzq 1861 4 yhfixjsw teiojwa teiojwa kkufnuxxzr
yhfixjsw 182 1 atxdknly
kkufnuxxzr 617 3 atxdknly oketl yhfixjsw
kkufnuxxzr 1721 5 atxdknly yhfixjsw atxdknly oketl yhfixjsw


4
sa ba na fa
fa 0 0
na 203 2 na fa
sa 600 3 ba na fa
ba 3 1 sa

*/