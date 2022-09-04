import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.io.*;
public class _00139_Telephone_Tangles {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw= new PrintWriter(new BufferedWriter (new OutputStreamWriter(System.out)));
		TreeMap<String, String> C= new TreeMap<String,String>();
		StringTokenizer tk;DecimalFormat df= new  DecimalFormat("0.00");
		while(true){String T=br.readLine();
			String c= "",p="";int y=0;
			for (int i = y;i<T.length()&&T.charAt(i)!=' '; i++,y++)c+=T.charAt(i);
			if(c.equals("000000"))break;
			while(T.charAt(y)==' ')y++;
			for (int i = y; i < T.length(); i++)p+=T.charAt(i);			
			C.put(c,p);
		}
		LinkedList<String> L= new LinkedList<String>();
		int lm=0;
		while(true){
			tk = new StringTokenizer(br.readLine());
			String n=tk.nextToken();int m;
			if(n.equals("#"))break;
			if(tk.hasMoreTokens())m=Integer.parseInt(tk.nextToken());
			else m=Integer.parseInt(br.readLine());
			L.add(n);
			String c="",p=null;float cps=0;
			if(n.charAt(0)!='0'){c=n;p="Local";}
			for (int i = 0; i < n.length()&&p==null; i++){c=c+n.charAt(i);
				if(C.containsKey(c)){
					if(n.length()-i-1>=4&&(c.length()-1>=1&&c.length()-1<=5&&n.length()-i-1<=7||
							c.length()-2>=1&&c.length()-2<=3&&c.charAt(1)=='0'&&n.length()-i-1<=10)){p=C.get(c);
						c=n.substring(i+1,n.length());
						cps=Integer.parseInt(p.substring(p.indexOf('$')+1,p.length()))/100.0f;
						p=p.substring(0,p.indexOf('$'));
					}
				}
			}
			if(p==null){p="Unknown";c="";cps=-1;}
			lm=Math.max(lm, p.length());
			L.add(p);L.add(c);L.add(m+"");
			n="";if(cps!=-1){n=df.format(cps);
			n=n.substring(0,n.length()-3)+"."+n.substring(n.length()-2,n.length());}
			L.add(n);if(cps!=-1)cps*=m;n=df.format(cps);
			L.add(n.substring(0,n.length()-3)+"."+n.substring(n.length()-2,n.length()));
		}lm+=17;
		while(!L.isEmpty()){
			String r=L.remove();pw.print(r);
			int g=r.length(),l=16;r=L.remove();
			for (int i = g+1; i <=l; i++)pw.print(" ");pw.print(r);
			g=l+r.length();l=41;
			for (int i = g+1; i <=l; i++)pw.print(" ");
			g=l;r=L.remove();l+=10-r.length();
			for (int i = g+1; i <=l; i++)pw.print(" ");
			pw.print(r);g+=10;r=L.remove();l=g+5-r.length();
			for (int i = g+1; i <=l; i++)pw.print(" ");
			pw.print(r);g+=5;r=L.remove();l=g+6-r.length();
			for (int i = g+1; i <=l; i++)pw.print(" ");
			pw.print(r);g+=6;r=L.remove();l=g+7-r.length();
			for (int i = g+1; i <=l; i++)pw.print(" ");
			pw.println(r);
		}
		pw.close();
	}
}

/*
088925 Broadwood$81
03 Arrowtown$38
0061 Australia$140
000000
031526       22
0061853279   3
0889256287213   122
779760  1
002832769 5
#

088925 Broadwood0000000baaaaaaad$81
03  Arrowtown $38
01 $24
0061 Australia$140
00852 Hong Kong.012345678901234$1111
00 Los Angelos$10
000000
031526        22
0889256287213   122
008520123456789   64
779760	 1
  002832769   	 5
001234 1   
0123456 3
0123 4
00134 5
00123456789012 9
0061234 600
0061853279  300
00611234567890 700
006112345678901 800
123456789 2
123456789012345 4
#
*/