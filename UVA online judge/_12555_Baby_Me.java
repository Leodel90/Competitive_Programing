import java.util.Scanner;
public class _12555_Baby_Me{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int t = leer.nextInt();
        leer.nextLine();       
        for (int i = 1; i <=t; i++){
        	double a=0,b=2,w=0;
        	String P=leer.nextLine();
        	for (int j = 0; j < P.length(); j++){
        		if(P.charAt(j)<48||P.charAt(j)>57){w+=a/b;b=20;a=0;}
			    else a=a*10+P.charAt(j)-48;
			}
        	String R=w+"",r=R.charAt(0)+"";
        	for (int j = 1; j<R.length(); j++){
        		if(R.charAt(j)!='0')r=r+R.charAt(j);
        	}
        	if(r.charAt(r.length()-1)=='.')r=r.substring(0,r.length()-1);
        	System.out.println("Case "+i+": "+r);
	    }
	}
}
