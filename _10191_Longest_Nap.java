import java.util.*;
public class _10191_Longest_Nap {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		try{int c =1;
		    while(true){
		    	int n = leer.nextInt();
		    	int T[]= new int [(n<<1)+2];
		    	int p = 1;
		    	for (int i = 0; i < n; i++) {
					String li= leer.next(),ls=leer.next();
					leer.nextLine();
					int a=Integer.parseInt(""+li.charAt(0)+li.charAt(1))*60-600+Integer.parseInt(""+li.charAt(3)+li.charAt(4));
					int b=Integer.parseInt(""+ls.charAt(0)+ls.charAt(1))*60-600+Integer.parseInt(""+ls.charAt(3)+ls.charAt(4));
		    	    int j=p-2;
		    	    T[p]=a;T[p+1]=b;
		    	    while(true){
		    	    	if(j==-1||b>T[j]){
		    	    		if(j==-1||a>=T[j+1]){
		    	    			int x,y;
		    	    			for (int k = j+2; k < T.length-1; k=k+2){
									x=T[k];
									T[k]=a;
									a=x;
									y=T[k+1];
									T[k+1]=b;
									b=y;
								}
		    	    		}else{
		    	    			if(a<T[j])T[j]=a;
		    	    			if(b>T[j+1])T[j+1]=b;
		    	    			p=p-2;
		    	    		}
		    	    		break;
		    	    	}else j=j-2;
		    	    }p=p+2;
		    	}
		    	int y=0;
		    	T[p]=480;
		    	for (int i = 0; i < p; i=i+2){
					if(T[i+1]-T[i]>T[y+1]-T[y])
						y=i;
				}
		        
		    	int hh = (T[y]+600)/60;
		    	int mm = T[y]%60; 	
		    	String cad ="Day #"+c+": the longest nap starts at "+hh+":";
		    	if(mm<10)cad=cad+'0'+mm;
		    	else cad+=mm;
		    	cad=cad+" and will last for ";
		    	hh=(T[y+1]-T[y])/60;
		    	mm=(T[y+1]-T[y])%60;
		    	if(hh>0)cad+=hh+" hours and ";
		    	cad+=mm+" minutes.";
		       System.out.println(cad);
		    c++;
		    }
		}catch (Exception e){
			
		}
	}

}
/*
3
10:07 12:19 Football game
13:11 16:17 Why why why me?
16:59 17:30 Nanananna Music :D
1
12:00 16:00 Burdens up my ass
1
12:00 15:59 Miserable At Best
3
15:00 17:00 Hey, don't blow a fuse!
13:00 15:00 Codeforces contest!!
10:00 11:00 Dinner time....yeaa :D
3
13:00 14:00 Shower
14:00 15:00 Again Shower!
15:00 16:00 Not again :(
3
10:00 10:12 Good night mommy
13:01 13:14 Masturbating time/Quickie
14:10 15:57 Secret Research!
1
13:59 14:01 Do you know what this means?
1
13:58 14:01 Got a buck to spare dude?
9
17:57 17:59 Aaaaaaaaaaaaaaaa
13:13 13:58 Break time :D
10:05 10:15 Solving this problem was a bummer(jk)
15:25 16:25 uhunt problem solving
14:21 15:01 ........
10:20 11:01 Pandora Radio()
16:30 17:00 Reading (I need more time to cram for the test).
12:00 12:37 Can't decide what to do, I guess I'll just take a nap.
17:30 17:54 Late night porn
4
14:47 17:04 Popcorn mmmm.....
10:16 11:05 I still watch popeye(Please don't tell anyone)
17:30 17:50 Cleaning up the mess
13:18 14:01 Whoaa
2
16:00 18:00 Shit happened today
11:59 14:01 I tried for 4 hours, but still couldn't solve problem 10191
*/