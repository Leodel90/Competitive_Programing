import java.util.*;
public class _11225_Tarot_scores {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n = leer.nextInt();
		for (int xd = 1; xd <=n; xd++){
			int m = leer.nextInt();
			int c=0;double p=0;
			for (int i = 0; i < m; i++){
				String a = leer.next();
					if(!a.equals("fool") && !a.equals("twenty-one") && !a.equals("one")){
						if(!a.equals("king")){
							if(!a.equals("queen")){
								if(!a.equals("knight")){
									if(!a.equals("jack"))p+=0.50;else p+=1.50;
								}else p+=2.50;
							}else p+=3.50;
						} else p+=4.50;
					}else {c++;p+=4.50;}
				leer.nextLine();
			}int l=56;
			if(c==3)l=36;
			if(c==2)l=41;
			if(c==1)l=51;
			System.out.println("Hand #"+xd);
			if(p>=l){
				if((int)p==p)System.out.println("Game won by "+(int)(p-l)+" point(s).");
				else System.out.println("Game won by "+(p-l)+" point(s).");
			}else{
				if((int)p==p)System.out.println("Game lost by "+(int)(l-p)+" point(s).");
				else System.out.println("Game won by "+(l-p)+" point(s).");
			}
			if(xd!=n)System.out.println();
		}
	}
}
