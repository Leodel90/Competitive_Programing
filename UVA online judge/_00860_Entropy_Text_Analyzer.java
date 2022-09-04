import java.text.DecimalFormat;
import java.util.*;
import java.util.Map.Entry;
public class _00860_Entropy_Text_Analyzer {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		boolean xd=true,xD=true;
        while(true){
        	TreeMap<String, Integer> T= new TreeMap<String, Integer>();
        	int y =0;
        	while(true){
        		String cad = leer.nextLine();
        		xd=cad.equals("****END_OF_TEXT****");
        		xD=cad.equals("****END_OF_INPUT****");
        		if(xd||xD)break;
        		cad+=" ";
        		String p="";
        		for (int i = 0; i < cad.length(); i++){
					char x = cad.charAt(i);
					if(x==','||x=='.'||x==':'||x==';'||x=='!'||x=='?'||x=='('||x==')'||x==' '||x==34||x==92&&i+1<cad.length()&&cad.charAt(i+1)=='n'){
						if(p.length()>0){if(T.containsKey(p))T.put(p, T.get(p)+1);else T.put(p, 1);
						y++;p="";
						if(x==92&&i+1<cad.length()&&cad.charAt(i+1)=='n')i++;
						}
					}else{if(x>=97&&x<=122){
							x=(char)(x-32);
						}
						p=p+x;
					}
				}
        	}
        	if(xd){
        		double ET= 0,EM=Math.log10(y);
        		while(!T.isEmpty()){
        			Entry<String, Integer>x =T.pollLastEntry();
        			ET+=x.getValue()*(EM-Math.log10(x.getValue()));
        		}
        		ET/=y;
        		DecimalFormat A= new DecimalFormat("0.0");
        		String RET=A.format(ET);
        		RET=RET.substring(0,RET.length()-2)+"."+RET.charAt(RET.length()-1);
        		A = new DecimalFormat("0");
        		String RER= A.format((ET/EM)*100);
        		System.out.println(y+" "+RET+" "+RER);
        	}
        	if(xD)break;
        }
	}
}
/*
Midnight, not a sound from the pavement
Has the moon lost her memory?
She is smiling alone
In the lamplight, the withered leaves collect at my feet
And the wind begins to moan
****END_OF_TEXT****
Memory, all alone in the moonlight
I can dream of the old days
Life was beautiful then
I remember the time I knew what happiness was
Let the memory live again
****END_OF_TEXT****
****END_OF_INPUT****

*/