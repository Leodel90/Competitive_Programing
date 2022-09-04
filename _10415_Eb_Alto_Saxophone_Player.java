import java.util.*;
public class _10415_Eb_Alto_Saxophone_Player {
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
	    int t = leer.nextInt();
	    boolean N[][]= new boolean [14][10];
	    int c1=9,c2=3;
        for (int i = 0; i < 7; i++){
			for (int j = 6; j <=c1&&c1>=6; j++)
				N[i][j]=true;
			if(i>4)c2--;
			for (int j = 1; j <=c2; j++)
				N[i][j]=true;
			c1--;
		}
        N[7][2]=true;c1=8;c2=3;
        for (int i = 8; i < 14; i++){
			for (int j = 6; j <=c1&&c1>=6; j++)
				N[i][j]=true;
			if(i>11)c2--;
			for (int j = 0; j <=c2; j++) 
				N[i][j]=true;
			c1--;
		}
        leer.nextLine();
        for (int i = 0; i < t; i++){
			String S= leer.nextLine();
			boolean ON[]= new boolean[10];
			int C[]= new int[10];
			for (int j = 0; j < S.length(); j++){
				int x=S.charAt(j);if(x==' ')break;
				if(x==65||x==66||x==97||x==98)x=x+7;
				if(x>=97)x=x-99;
				else x=x-60;
				for (int k = 0; k < 10; k++){
					if(!ON[k]&&N[x][k]){
						C[k]++;ON[k]=true;
					}else {
						ON[k]=N[x][k];
					}
				}
			}
			for (int k = 0; k < 10; k++){ 
				System.out.print(C[k]);
				if(k<9)System.out.print(" ");
			}System.out.println();
		}
	}
}
/*
12 

cdefgab 

BAGFEDC 
CbCaDCbCbCCbCbabCCbCbabae 

BAAGFFEDCbabbabbbabbbabab 
ccccCCdccaccacccccaaacccc 
cacacaaBBBBcCbbbbBAAGGGGG 
GFGFGGaaaaFFgGgGbcdefgabbbbbbbbbbbbb 
bbbbbbbbbbbbbbbbbbbbbbbbb
cccccccccbbbbbbbbbaaaaaaaaaaa
*/