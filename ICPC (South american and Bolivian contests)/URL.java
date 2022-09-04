import java.util.*;
public class URL {
//Concurso 143
	static Scanner leer = new Scanner(System.in);
	public static void main(String[] args) {
		while(leer.hasNext()){
			String cad = leer.nextLine();
			int i = 0;
		while(i<cad.length()){
				String res;
				if(cad.charAt(i)=='h'){res="http://"+cad.charAt(i+4);i=i+5;}
				else{res="ftp://"+cad.charAt(i+3);;i=i+4;}
				String c = cad.substring(i,i+2),d="/",b="";
				while(!c.equals("bo")){
					res=res+cad.charAt(i);
					i++;
					c=cad.substring(i,i+2);
				}
				res=res+".bo";
				i=i+2;
				while(true){
				    if(i+4<=cad.length()){
						c=cad.substring(i,i+4);	
						b=cad.substring(i,i+3);
					}
					if(!c.equals("http")&&!b.equals("ftp") && i<cad.length())
					{res=res+d+cad.charAt(i);
					 d="";i++;
					}else break;
				c="";b="";
				}
				System.out.println(res);
				
			}
			
			
			
		}
//-----------------------------------
/*
httpbbo
httpbboo
httpbooboo
httpsunbox
httpinformaticaboinf143
ftpstarsaminfbodescargas
ftpstarsaminfbodescargashttpinformaticaboinf143
httpinformaticaboinf143ftpstarsaminfbodescargashttpinformaticaboinf143httpbbo
httpsunboxftpbboftpsdjsgkerbohttd
*/
	}

}
