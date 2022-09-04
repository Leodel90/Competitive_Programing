import java.io.*;
public class _11236_Grocery_store {
	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		double a=0.01,b,c,d=0;
		for (int A = 1; A <=158; A++,a=A/100.0){b=a;
			for (int B = A,C; b*b<=20/(a*b)+0.01; B++,b=B/100.0){
				C=Math.max(B,1000000/(A*B)+1);c=C/100.0;
				for(long D=((long)(A+B+C)*1000000)/(long)(A*B*C-1000000); C<=D && c<=20/(a*b*c)+0.01 ;C++,
						D=((long)(A+B+C)*1000000)/(long)(A*B*C-1000000),c=C/100.0){
						if(D*A*B*C==(D+A+B+C)*(long)1000000 && D+A+B+C<=2000){d=D/100.0;
							pw.print(a);
							if(A%10==0)pw.print("0");
							pw.print(" "+b);
							if(B%10==0)pw.print("0");
							pw.print(" "+c);
							if(C%10==0)pw.print("0");
							pw.print(" "+d);
							if(D%10==0)pw.print("0");
							pw.println();
						}
				}
			}
		}
		pw.close();
	}
}
