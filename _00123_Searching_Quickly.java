import java.util.*;
public class _00123_Searching_Quickly {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String R[]= new String[3500];
		String K[]= new String[3500];
		int g=0,r=0;
		String IG[]= new String[51];
        while(true){
			IG[g]=leer.nextLine();
			if(IG[g].equals("::"))break;
			g++;
		}
		try{
		while(true){
			String title= leer.nextLine()+" ";
			if(title.length()==1)break;
			String T="",k="",ig="";
			for (int i = 0; i < title.length(); i++){
				char t= title.charAt(i);
				if(t==' '){
					if(k.length()>0){
					boolean q=true;
					for (int j = 0; j < g&&q; j++)
						q=!ig.equals(IG[j]);
					if(q){R[r]=T+k;
					K[r]=k;
					   for (int j = i; j < title.length()-1; j++){
						  if(title.charAt(j)<97&&title.charAt(j)!=' ')R[r]+=(char)(title.charAt(j)+32);
						  else R[r]+=title.charAt(j);
					   }
					   int h=r;
					   while(h>0){
						   q=true;int j=0;
						   while(true){
							if(j<K[h].length()&&j<K[h-1].length()){
								if(K[h].charAt(j)!=K[h-1].charAt(j)){
									q=K[h].charAt(j)<K[h-1].charAt(j);break;
								}else j++;
							}else{q=K[h].length()<K[h-1].length();break;}
						   }
						   if(q){k=K[h];K[h]=K[h-1];K[h-1]=k;
						   k=R[h];R[h]=R[h-1];R[h-1]=k;h--;
						   }else break;
					   }r++;
					}
					}
					T+=ig+' ';
					ig="";k="";
				}else {if(t>=97){ig=ig+t;k=k+(char)(t-32);}else {ig=ig+(char)(t+32);k=k+t;}
				}
			}
		}
		}catch(Exception e){}
		for (int i = 0; i < r; i++){
			System.out.println(R[i]);
		}
	}
}

/*
is
the
of
and
as
a
but
::
Descent of Man
The Ascent of Man
The Old Man and The Sea
A Portrait of The Artist As a Young Man
A Man is a Man but Bubblesort IS  A DOG
*/