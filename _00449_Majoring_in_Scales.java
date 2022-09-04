import java.util.*;
public class _00449_Majoring_in_Scales {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String Sharps[]= {"C","C#","D","D#","E","F","F#","G","G#","A","A#","B"};
		String Letters[]= {"C","Db","D","Eb","E","F","Gb","G","Ab","A","Bb","Cb"};
		String S[]={"C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab", "A", "Bb","B"};
		boolean V[]={true,false,true,false,true,false,false,true,false,true,false,true};
		int MS[]={2,2,1,2,2,2,1};
		try{
		while(true){
			String N= leer.next();leer.nextLine();
			String H[]= new String[8];
			int p=0;
			boolean q=false;
			for (int i = 0; i < 12; i++){if(S[i].equals(N)){p=i;q=V[i];break;}}
			if(q){for (int i = 0; i < 8; i++){H[i]=Sharps[p];if(i<7)p=(p+MS[i])%12;}}
			else {for (int i = 0; i < 8; i++){H[i]=Letters[p];if(i<7)p=(p+MS[i])%12;}}
			String cad = leer.nextLine();
			int i=0;
			System.out.println("Key of "+N);
			while(i<cad.length()){
				String nota="",r="";
				while(cad.charAt(i)!=' ' || nota.length()==0){
					if(cad.charAt(i)!=' ')nota+=cad.charAt(i);i++;
				}q=false;
				for (int j = 0; j < 8; j++){
					if(H[j].equals(nota)){q=true;p=j;break;}
				}
				if(q){
					int x=0,y=0;
				while(true){
					if(cad.charAt(i)!=' '){
						if(cad.charAt(i)=='U'){x=1;i=i+2;nota=nota+": UP ";}else{x=-1;i=i+4;nota+=": DOWN ";}break;
					}i++;
				}
				while(i<cad.length()&&(cad.charAt(i)!=';'&&cad.charAt(i)!=' ' || r.length()==0)){
					if(cad.charAt(i)!=' ')r=r+cad.charAt(i);i++;
				}
				nota+=r+" > ";
				if(r.equals("SECOND"))y=1;
				if(r.equals("THIRD"))y=2;
				if(r.equals("FOURTH"))y=3;
				if(r.equals("FIFTH"))y=4;
				if(r.equals("SIXTH"))y=5;
				if(r.equals("SEVENTH"))y=6;
				if(r.equals("OCTAVE"))y=7;
				if(p+y*x<0||p+y*x>7)y++;
				System.out.println(nota+H[(8+p+y*x)%8]);
				if(i<cad.length()&&cad.charAt(i)==';')i++;
				else break;
				}else {System.out.println(nota+": invalid note for this key");
				while(i<cad.length()&&cad.charAt(i)!=';')i++;
				i++;
				}
			}
			System.out.println();
		}
		}catch(Exception e){}
	}
}
