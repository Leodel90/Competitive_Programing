import java.util.*;
public class _10528_Major_Scales{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		String N[]= {"C","C#","D","D#","E","F","F#","G","G#","A","A#","B"};
		int P[]={2,2,1,2,2,2,1};
		boolean M[][]= new boolean[12][12];
        for (int i = 0; i < 12; i++){
			for (int j = 0,k=i; j < 7; k=(k+P[j])%12,j++){
				if(N[k].length()==2){
					if(N[k].equals("A#"))M[i][7]=true;
					if(N[k].equals("C#"))M[i][8]=true;
					if(N[k].equals("D#"))M[i][9]=true;
					if(N[k].equals("F#"))M[i][10]=true;
					if(N[k].equals("G#"))M[i][11]=true;
				}else M[i][N[k].charAt(0)-65]=true;
			}
		}
        while(true){
        	String l=leer.nextLine();
        	if(l.equals("END"))break;
        	StringTokenizer cad = new StringTokenizer(l);
        	boolean V[]= new boolean[12];
        	while(cad.hasMoreTokens()){
        		String h = cad.nextToken();
        		for (int i = 0; i < 12; i++){
        			boolean q=false;
        		if(h.length()==2){
					if(h.equals("A#"))q=M[i][7];
					if(h.equals("C#"))q=M[i][8];
					if(h.equals("D#"))q=M[i][9];
					if(h.equals("F#"))q=M[i][10];
					if(h.equals("G#"))q=M[i][11];
				}else q=M[i][h.charAt(0)-65];
        		V[i]=V[i]||!q;        		
        		}
        	}boolean q=false;
        	for (int i = 0; i < 12; i++){
				if(!V[i]){if(q)System.out.print(' ');
			     else q=true;
					System.out.print(N[i]);
				}
			}System.out.println();
        }
	}
}
