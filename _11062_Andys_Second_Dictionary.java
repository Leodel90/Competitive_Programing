import java.util.*;
public class _11062_Andys_Second_Dictionary {
		public static void main(String[] args) {
			Scanner leer = new Scanner(System.in);
			TreeSet<String> D= new TreeSet<String>();
			try{String p ="";
			  while(true){
				  String cad = leer.nextLine()+" ";
				  if(cad.charAt(0)=='|')break;
				  for (int i = 0; i < cad.length(); i++){
					char x =cad.charAt(i);
					if(!(x>=65&&x<=90||x>=97&&x<=122)&&x!='-'){
						if(p.length()>0){
							D.add(p);p="";
						}
					}else{
						if(x!='-'||i<cad.length()-2&&(p.length()>0||cad.charAt(i+1)>=65&&cad.charAt(i+1)<=92||cad.charAt(i+1)>=97&&cad.charAt(i+1)<=122)){
							if(x<97&&x!='-')p+=(char)(x+32);else p+=x;
						}else{
							if(i==cad.length()-2)break;
						}
					}
				}
			  }	
			}catch(Exception e){}
			while(!D.isEmpty())System.out.println(D.pollFirst());
		}
	}
