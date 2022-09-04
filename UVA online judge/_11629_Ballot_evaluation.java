import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.*;
public class _11629_Ballot_evaluation {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer T= new StringTokenizer(br.readLine());
        int p= Integer.parseInt(T.nextToken());
        int g= Integer.parseInt(T.nextToken());
        DecimalFormat F= new DecimalFormat("0.0");
        TreeMap<String, Double> P= new TreeMap<String, Double>();
        for (int i = 0; i < p; i++){T= new StringTokenizer(br.readLine());P.put(T.nextToken(), Double.parseDouble(T.nextToken()));}
		for (int i = 1; i <=g; i++){
			double r= 0;T= new StringTokenizer(br.readLine());
			while(true){
				String cad=F.format(r+P.get(T.nextToken()));
				r=Double.parseDouble(cad.substring(0,cad.length()-2)+"."+cad.charAt(cad.length()-1));
				String C= T.nextToken();
				if(!C.equals("+")){
				    int n = Integer.parseInt(T.nextToken());
				    boolean q;
				    if(!C.equals("<")){
				    	if(!C.equals(">")){
				    		if(!C.equals("<=")){
				    			if(!C.equals(">="))q=r==n;else q=r>=n;
				    		}else q=r<=n;
				    	}else q=r>n;
				    }else q=r<n;
				    String R;
				    if(q)R=" was correct.";else R=" was incorrect.";
				    System.out.println("Guess #"+i+R);break;
				}
			}
		}
	}
}
/*
1 1
as 0.1
as + as + as + as + as + as + as + as + as + as = 1

*/
