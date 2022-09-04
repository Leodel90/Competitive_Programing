import java.io.*;
import java.util.*;
public class _00565_Pizza_Anyone {
	public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	try{
		while(true){
			LinkedList<Integer> P= new LinkedList<Integer>(),N= new LinkedList<Integer>();
			int p,n;
			while(true){
				char C[]=br.readLine().toCharArray();
				if(C[0]=='.')break;p=0;n=0;
				for (int i = 0; i < C.length-1; i=i+2){
					if(C[i]=='+')p|=1<<(C[i+1]-65);
					else n|=1<<(C[i+1]-65);
				}
				P.add(p);N.add(n);
			}
			Iterator<Integer> pi =P.iterator();
			Iterator<Integer> ni =N.iterator();
			boolean q=false;int I=0;
			for (int i = 0; i < 65536&&!q; i++,pi=P.iterator(),ni=N.iterator()){
				q=true;I=i;
				while(q&&pi.hasNext()){n=ni.next();
					q=(i&pi.next())!=0 || (i&n)!=n;
				}
			}
			if(q){
				pw.print("Toppings: "); 
				for (int i = 1,j=65; j < 81; i=i<<1,j++){
					if((I&i)==i)pw.print((char)j);
				}
				pw.println();
			}else pw.println("No pizza can satisfy these requests.");
		}
	}catch(Exception e){}
	pw.close();
	}
}

/*
+A+B+C+D-E-F-G-H;
-A-B+C+D-E-F+G+H;
-A+B-C+D-E+F-G+H;
.
+A+B+C+D;
+E+F+F+H;
+A+B-G;
+O+J-F;
+H+I+C;
+P;
+O+M+L;
+M-L+P;
.
+A+B+C+D;
+E+F+F+H;
+A+B-G;
+P-O;
+O+J-F;
+H+I+C;
+P;
+O;
+O+M+L;
-O-P;
+M-L+P;
.

*/