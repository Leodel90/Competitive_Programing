import java.util.*;
public class _10315_Poker_Hands {
	static int H[],S[];
	static Scanner leer = new Scanner(System.in);
	public static void Llena(){
		for (int i = 0; i < 5; i++) {
			String cad= leer.next();
			if(cad.charAt(0)>57){
				if(cad.charAt(0)=='T')H[i]=10;
				if(cad.charAt(0)=='J')H[i]=11;
				if(cad.charAt(0)=='Q')H[i]=12;
				if(cad.charAt(0)=='K')H[i]=13;
				if(cad.charAt(0)=='A')H[i]=14;
			}else H[i]=cad.charAt(0)-48;
			if(cad.charAt(1)=='C')S[0]++;
			if(cad.charAt(1)=='D')S[1]++;
			if(cad.charAt(1)=='H')S[2]++;
			if(cad.charAt(1)=='S')S[3]++;
		}
		Arrays.sort(H);
	}
	public static int g(){
		int g=0;
		boolean s=S[0]==5||S[1]==5||S[2]==5||S[3]==5;
		  boolean e=H[1]-H[0]==1&&H[2]-H[1]==1&&H[3]-H[2]==1&&H[4]-H[3]==1;
		  if(!s||!e){
			  if(H[0]!=H[3] && H[1]!=H[4]){
				  if((H[0]!=H[1]||H[2]!=H[4]) && (H[0]!=H[2]||H[3]!=H[4])){
					  if(!s){
						  if(!e){
						     if(H[0]!=H[2] && H[1]!=H[3] && H[2]!=H[4]){
							    if(!(H[0]==H[1]&&H[2]==H[3])&&!(H[1]==H[2]&&H[3]==H[4])&&!(H[0]==H[1]&&H[3]==H[4])){
								     if(!(H[0]==H[1]|| H[1]==H[2]|| H[2]==H[3]|| H[3]==H[4]))
								    	 g=1;
								     else g=2;
							    }else g=3;
						     }else g=4;
						  } else g=5;
					  }else g=6;
				  }else g=7;
			  }else g=8;
		  }else g=9;
		return g;
	}
	public static void main(String[] args){
		while(leer.hasNext()){
			H= new int [5];S= new int[4];
		  Llena();
		  int HB[]=H,SB[]=S;
		  H= new int [5];S= new int[4];
		  Llena();
		  int HW[]=H,SW[]=S;
		  H=HB;S=SB;
		  int gb=g();
		  H=HW;S=SW;
		  int gw=g();
		  boolean c=false;
		  if(gb==gw){
			  if(gb!=9){
				  if(gb!=8 && gb!=7 && gb!=4){
					  if(gb!=6 && gb!=5){
						 if(gb!=3){
							 if(gb==2){int x=0,y=0;
								 if(HB[3]==HB[4]||HB[3]==HB[2]){x=HB[3];}
								 if(HB[1]==HB[0]||HB[1]==HB[2]){x=HB[1];}
								 if(HW[3]==HW[4]||HW[3]==HW[2]){y=HW[3];}
								 if(HW[1]==HW[0]||HW[1]==HW[2]){y=HW[1];}
								 if(x==y){
									 int mb=-1,mw=-1,i=4,j=4;
									 while(i>=0 || j >=0){
										if(mb==-1 || mw==-1){
											if(mb==-1){
											if(HB[i]!=x)mb=HB[i]; i--;
											}
											if(mw==-1){
												if(HW[j]!=y)mw=HW[j]; j--;
                                            }
										}
										if(mb!=-1&&mw!=-1){if(mb!=mw){if(mb>mw)gb++;else gw++; break;}else{mb=-1;mw=-1;}}
									}
								 }else{if(x>y)gb++;else gw++;}
							 }else c=true;
						 }else{
							 if(HB[3]==HW[3]){
								 if(HB[1]==HW[1]){int x=0,y=0;
									 for (int i = 4; i >=0; i--) {
										if(HB[i]!=HB[3]&&HB[i]!=HB[1])x=HB[i];
										if(HW[i]!=HW[3]&&HW[i]!=HW[1])y=HW[i];
									    if(x!=y){if(x>y)gb++;else gw++; break;}
									 }
								 }else {
									 if(HB[1]>HW[1])gb++;else gw++;	 
								 }
							 }else{
								 if(HB[3]>HW[3])gb++;else gw++;
							 }
						 }
					  }else c= true;
				  }else{
					  if(HB[2]>HW[2])gb++;
					  else gw++;
				  }
			  }else c=true;
		  }
		  if(c){
			  for (int i = 4; i >=0; i--){
				if(HB[i]!=HW[i]){if(HB[i]>HW[i])gb++;else gw++; break;}
			  }
		  }
		  if(gb>gw)System.out.println("Black wins.");
		  if(gw>gb)System.out.println("White wins.");
		  if(gb==gw)System.out.println("Tie.");
		}
	}
}
