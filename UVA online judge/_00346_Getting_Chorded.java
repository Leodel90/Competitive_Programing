import java.util.*;
public class _00346_Getting_Chorded{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
        String N1[]={"A","A#","B","C","C#","D","D#","E","F","F#","G","G#"};
        String N2[]={"A","Bb","Cb","B#","Db","D","Eb","Fb","E#","Gb","G","Ab"};
		try{
			while(true){
			 String C[]= new String[3];
			 String T="";
			 for (int i = 0; i < 3; i++) {C[i]=leer.next();T+=C[i]+" ";
			 if(C[i].charAt(0)>=97){
				 if(C[i].length()>1)C[i]=(char)(C[i].charAt(0)-32)+""+C[i].charAt(1);else C[i]=(char)(C[i].charAt(0)-32)+"";
				 }
			 }
			 int K[]=new int [3],p=0;
			 boolean q=true;
			 for (int j = 0; j < 12; j++){
				 for (int i = 0; i < 3; i++) {
					if(N1[j].equals(C[i])||N2[j].equals(C[i])){
						K[p]=j;
						int h=p;
						while(h>0){
							if(K[h]<K[h-1]){
								int aux=K[h];K[h]=K[h-1];K[h-1]=aux;h--;
							}else break;
						}
							p++;
					  }
					}
			 }
			 if(p==3){
			 for (int i = 0; i < 3; i++){int j=(i+1)%3,k=(i+2)%3,A,B;
			 if(K[j]<K[i])A=11+K[j]-K[i];
			 else A=K[j]-K[i]-1;
			 if(K[k]<K[j])B=11+K[k]-K[j];
			 else B=K[k]-K[j]-1;
			 if(K[j]<K[i])A=11+K[j]-K[i];
				 if(A==2&&B==3||A==3&&B==2){
					 if(A==3&&B==2)System.out.println(T+"is a "+N1[K[i]]+" Major chord.");
					 else System.out.println(T+"is a "+N1[K[i]]+" Minor chord.");q=false;break;}
			 }
			 }
			if(q)  System.out.println(T+"is unrecognized.");
			}
		}catch(Exception e){}

	}
}
/*
C E G
C E F#
G C E
c# a f#
f g# C
C Eb G
*/