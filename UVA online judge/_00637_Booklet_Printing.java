import java.util.*;
public class _00637_Booklet_Printing {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		while(true){
			int n = leer.nextInt();
			if(n>0){System.out.println("Printing order for "+n+" pages:");
				int l =n;
				if(l%4!=0)l+=4-l%4;
				int p=l;boolean q = true;
				String L;int c=1,o=n;
				while(o>0){int t=l-p+1;o--;
					L="Sheet "+c+", ";
					if(q){L+="front: ";
						if(p<=n){L+=p+", "+t;o--;}
						else L+="Blank, "+t;
						p=t+1;
					}else{
						L+="back : ";
						if(t<=n){L+=p+", "+t;o--;}
						else L+=p+", Blank";
						p=t-1;c++;
					}
					q=!q;
				System.out.println(L);
				}
			}else break;
		}

	}

}
