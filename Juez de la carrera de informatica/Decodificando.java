import java.util.*;
public class Decodificando {
	public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
int xd = leer.nextInt();
leer.nextLine();      
for (int tr = 0; tr < xd; tr++) {
       	char cad[] = leer.nextLine().toCharArray();
       	int max = 0;
       	char l=' ';
       	int letras[]= new int [26];
       	for (int i = 0; i < cad.length; i++){
       		int x = cad[i];
       		if(cad[i]!=' ')
       		{   if(x>=97)
       			x=x-97;
       		else 
       			x=x-65;
       			letras[x]++;
       		    if(letras[x]>max){max=letras[x];l=cad[i];
       		    if(l>=97)l=(char)(l-32);
       		    }
       		    else{
       		    	if(letras[x]==max&&cad[i]!=l&&cad[i]-32!=l)
       		    	{if(l!='E'&&cad[i]!='E'&&cad[i]!='e')
       		    		l=' ';
       		    	else l='E';
       		    	}
       		    }
       		}
		}
       	if(l!=' '){
       		int y= (l-43)%26;
       		String res="";
       		for (int i = 0; i < cad.length; i++){
				if(cad[i]!=' '){
       			if(cad[i]<97)
					res=res+(char)((cad[i]-y-39)%26+65);
       			else 
       				res=res+(char)((cad[i]-y-71)%26+97);
				}
				else res=res+cad[i];
			}
       		System.out.println(y+" "+res);
       	}
       	else System.out.println("NOT POSSIBLE");
      }
	}
}

/*
10
RD TQIJW GWTYMJWX INFWD JSYWNJX ZXJ F XNRUQJ JSHWDUYNTS YJHMSNVZJ
THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
XVIDRE TFCCVXZRKV GIFXIRDDZEX TFEKVJK UVTIPGKZFE
XVIDRE TFCCVXZRKV GIFXIRDDZEX TFEKVJK
Uifsf bsf op Uisfbet po Nz
aaaAAa eeeee hhdrlikfdjgxf
eeEETTT TTT tt lkbmmndv lkjemnbeseqqe e E tta
eeEETTT TTT tt lkbmmndv lkjemnbeseqqe e E tta T
*/