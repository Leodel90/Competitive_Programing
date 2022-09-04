	import java.util.*;
	public class _01061_Consanguine_Calculations{
		public static void main(String[] args){
			Scanner leer = new Scanner(System.in);
			String ABO[]= {"O","AB","B","A"};
			String abo[]= {"OO","AB","BO","AO",};
			int t=1;
			while(true){
				String p1=leer.next();
				String p2=leer.next();
				String ch=leer.next();
				if(!p1.equals("E")||!p2.equals("N")||!ch.equals("D")){
					String P1="",P2="",CH="",r="";
					for (int i = 0; i < p1.length(); i++){if(p1.charAt(i)>=65&&p1.charAt(i)<=90)P1+=p1.charAt(i);}
					for (int i = 0; i < p2.length(); i++){if(p2.charAt(i)>=65&&p2.charAt(i)<=90)P2+=p2.charAt(i);}
					for (int i = 0; i < ch.length(); i++){if(ch.charAt(i)>=65&&ch.charAt(i)<=90)CH+=ch.charAt(i);}
					TreeSet<Integer> R= new TreeSet<Integer>();
					boolean s1,s2;
					if(!ch.equals("?")){s1=ch.charAt(ch.length()-1)=='+';
						String px;
						if(p1.equals("?")){px=P2;s2=p2.charAt(p2.length()-1)=='+';}else {px=P1;s2=p1.charAt(p1.length()-1)=='+';}
						int bp=0,bc=0;
						for (int i = 0; i < 4; i++){if(ABO[i].equals(px)){bp=i;break;}}
						for (int i = 0; i < 4; i++){if(ABO[i].equals(CH)){bc=i;break;}}
						boolean q=abo[bp].charAt(0)==abo[bc].charAt(0)||abo[bp].charAt(0)==abo[bc].charAt(1)||abo[bp].charAt(1)==abo[bc].charAt(0)||abo[bp].charAt(1)==abo[bc].charAt(1);					
						if(q){String x;
						      if(bc!=bp&&bp!=1){
						    	  if(abo[bp].charAt(0)==abo[bc].charAt(0)||abo[bp].charAt(1)==abo[bc].charAt(0))x=abo[bc].charAt(1)+"";
						    	  else x=abo[bc].charAt(0)+"";
						      }else x=abo[bc];
						      for (int i = 0; i < 4; i++){
								for (int j = 0; j < x.length(); j++){
									if(abo[i].charAt(0)==x.charAt(j)||abo[i].charAt(1)==x.charAt(j)){R.add(i);break;}
								}
							  }char S[];
						      if(!s1||s1&&s2){S=new char[2];S[0]='-';S[1]='+';}
						      else{S= new char [1];S[0]='+';}
						      if(R.size()>1||S.length==2){
						      while(!R.isEmpty()){
						    	  x=ABO[R.pollFirst()];
						    	  for (int i = 0; i < S.length; i++){
									if(r.length()>0)r+=", "+x+S[i];
									else r="{"+x+S[i];
								  }
						      }r+="}";
						      }else r=""+ABO[R.pollFirst()]+S[0];
						}else r="IMPOSSIBLE";
						if(p1.equals("?"))r=r+" "+p2+" "+ch;
					      else r=p1+" "+r+" "+ch;
					}else{
						int bp1=0,bp2=0;
						for (int i = 0; i < 4; i++) {if(ABO[i].equals(P1)){bp1=i;break;}}
						for (int i = 0; i < 4; i++) {if(ABO[i].equals(P2)){bp2=i;break;}}
						for (int i = 0; i < 2; i++){
							for (int j = 0; j < 2; j++){
								String x;
								if(abo[bp1].charAt(i)>=abo[bp2].charAt(j)){
									if(abo[bp1].charAt(i)>abo[bp2].charAt(j))x=""+abo[bp2].charAt(j)+abo[bp1].charAt(i);
									else x=""+abo[bp1].charAt(i)+'O';
								}
								else x =""+abo[bp1].charAt(i)+abo[bp2].charAt(j);
								for (int k = 0; k < 4; k++){
									if(x.equals(abo[k])){R.add(k);break;}
								}
							}
						}
					char S[];s1=p1.charAt(p1.length()-1)=='+';s2=p2.charAt(p2.length()-1)=='+';
					if(s1||s2){S=new char[2];S[0]='-';S[1]='+';}
					else {S=new char[1];S[0]='-';}
					if(R.size()>1||S.length==2){
					   while(!R.isEmpty()){
						 int h=R.pollFirst();
						 for (int i = 0; i < S.length; i++){
							if(r.length()>0)r+=", "+ABO[h]+S[i];else r="{"+ABO[h]+S[i];
						}
					   }r+="}";
					}else r=""+ABO[R.pollFirst()]+S[0];
					   r=p1+" "+p2+" "+r;
					}
					System.out.println("Case "+t+": "+r);t++;
				}else break;
			}
		}	
	}

/*
O+ O- ?
O+ ? O-
AB- AB+ ?
AB+ ? O+
O- ? O-
O- ? O+
? A+ B-
? A- B+
A+ B+ ?
A- A- ?
O- ? B+
O- ? B-
*/