import java.util.*;
public class _00187_Transaction_Procesing {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
        LinkedList<String> C = new LinkedList<String>();
        while(true){
        String cad = leer.nextLine();
        if(cad.charAt(0)!='0'||cad.charAt(1)!='0'||cad.charAt(2)!='0')
        C.add(cad);
        else break;
        }
        String CT[]= new String[C.size()];
        
        for (int i = 0; i < CT.length; i++) 
			CT[i]=C.remove();
        String h = "";
        double s=0;
        boolean q=false;
        LinkedList<Integer> K= new LinkedList<Integer>();
        LinkedList<Double> M= new LinkedList<Double>();
		while(true){String cad = leer.nextLine(),t=""+cad.charAt(0)+cad.charAt(1)+cad.charAt(2);
		if(!t.equals(h)){
			if(s!=0){
				System.out.println("*** Transaction "+h+" is out of balance ***");
				while(!K.isEmpty()){
					int i=K.remove();
					String nom=" ",cta="",m=M.remove()/100+"";
					if(m.charAt(m.length()-2)=='.')m=m+'0';
						for (int j = 3; j <=33;j++){
							if(j<CT[i].length())nom+=""+CT[i].charAt(j);
							else nom +=" "; 
						}for (int j = 0; j < 3; j++)cta+=""+CT[i].charAt(j); 
					    for (int j = m.length(); j < 10; j++) 
							m=" "+m;
					    
					    System.out.println(cta+nom+m);
				}String S = -s/100+"";
				if(S.charAt(S.length()-2)=='.')S+='0';
				for (int i = S.length(); i < 27; i++)
					S=" "+S;
				System.out.println("999 Out of Balance"+S);s=0;
				System.out.println();
			}h=t;
			M= new LinkedList<Double>();
			K=new LinkedList<Integer>();
		}
			if(!t.equals("000")){
			String c = ""+cad.charAt(3)+cad.charAt(4)+cad.charAt(5);
			for (int i = 0; i < CT.length; i++){
				if(c.equals(""+CT[i].charAt(0)+CT[i].charAt(1)+CT[i].charAt(2))){
				double k= Double.parseDouble(cad.substring(6,cad.length()));
				K.add(i);
				s+=k;
                M.add(k);
				break;
				}
			}
			}else break;
		}
	}
}


/*
111Cash
121Accounts Receivable
211Accounts Payable
241Sales Tax Payable
401Sales
555Office Supplies
000No such account
100111    11795
100121   -11795
101121      105
101241       -7
101401     -100
102211   -70000
102555    40000
103111   -40000
103555    40000
000000        0

110kenny
111siapa
000No
100110 -5
100110 4
103111 3
000000 0
*/