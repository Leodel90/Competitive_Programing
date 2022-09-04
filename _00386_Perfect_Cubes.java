import java.io.*;
public class _00386_Perfect_Cubes {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int V[]= new int [201];
		int P[]= new int [8000001];
		for (int i = 2; i <=200; i++){V[i]=(int)Math.pow(i, 3);P[V[i]]=i;}
		for (int a = 2; a <=200; a++){
			for (int b = 2,l1=V[a]-V[b]; V[b]<<1<=l1; b++,l1=V[a]-V[b]){
				for (int c = b,pd=l1-V[c]; V[c]<=pd; c++,pd=l1-V[c]){
					if(P[pd]!=0)
						pw.println("Cube = "+a+", Triple = ("+b+","+c+","+P[pd]+")");
				}
			}
		}pw.close();
	}
}