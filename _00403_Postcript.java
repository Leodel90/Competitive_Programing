import java.util.*;
public class _00403_Postcript {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);	
        try{
        	char P[][]= new char[61][61];
        for (int i = 1; i <=60; i++) {
			for (int j = 1; j <=60; j++) 
				P[i][j]='.';
		}
            String C5[]= new String [5];
            C5[0]=".***..****...****.****..*****.*****..****.*...*.*****...***.*...*.*.....*...*.*...*..***..****...***..****...****.*****.*...*.*...*.*...*.*...*.*...*.*****.";
            C5[1]="*...*.*...*.*...*.*...*.*.....*.....*.....*...*...*......*..*..*..*.....**.**.**..*.*...*.*...*.*...*.*...*.*.....*.*.*.*...*.*...*.*...*..*.*...*.*.....*..";
            C5[2]="*****.****..*.....*...*.***...***...*..**.*****...*......*..***...*.....*.*.*.*.*.*.*...*.****..*...*.****...***....*...*...*..*.*..*.*.*...*.....*.....*...";
            C5[3]="*...*.*...*.*.....*...*.*.....*.....*...*.*...*...*...*..*..*..*..*.....*...*.*..**.*...*.*.....*..**.*..*......*...*...*...*..*.*..**.**..*.*....*....*....";
            C5[4]="*...*.****...****.****..*****.*......***..*...*.*****..**...*...*.*****.*...*.*...*..***..*......****.*...*.****...***...***....*...*...*.*...*...*...*****.";
        	while(true){
        		String Pos= leer.next();
        		if(Pos.length()==2){
        			String F=leer.next();
        			int R=leer.nextInt(),C=0;
        			if(Pos.charAt(1)=='P')C=leer.nextInt();
        			String T="",Te=leer.nextLine();
        			boolean q=false;
        			for (int i = 0; i < Te.length(); i++){
						if(Te.charAt(i)=='|'){
							if(q)break;else q=true;
						}else{if(q)T=T+Te.charAt(i);}
					}
        			int x=0;
        		    if(F.equals("C5")){int m=0;
        		    	if(Pos.charAt(1)=='C'){
        		    		if(T.length()>10){
        		    			x=(T.length()>>1)-5;
        		    			C=1;if((T.length()&1)==1)m=3;
        		    		}else C=31-T.length()*3;
        		    	}
        		    	if(Pos.charAt(1)=='R'){
        		    		if(T.length()>10){
        		    			C=1;x=T.length()-10;
        		    		}else C=61-T.length()*6;
        		    	}if(Pos.charAt(1)=='L')C=1;
        		    	while(x<T.length()){
							if(T.charAt(x)!=' '){
								int p=(T.charAt(x)-65)*6+m;
								for (int j = 0; j < 5&&R+j<=60; j++){
									int c=C;
								for (int k = p; k<p+6-m && c<=60; k++){
									if(C5[j].charAt(k)!='.')P[R+j][c]=C5[j].charAt(k);
								    c++;
								 }
								}
							}
							x++;
							C=C+6-m;m=0;
						}
        		    }else{
        		    	if(Pos.charAt(1)=='C')
            				C=31-(T.length()>>1);
        		    	if(Pos.charAt(1)=='R')
        		    	C=61-T.length();
        		    	if(Pos.charAt(1)=='L')C=1;
        		    	for (int i = C; i <= 60; i++){
							if(x>=T.length())break;
        		    		if(T.charAt(x)!=' ')
								P[R][i]=T.charAt(x);
							x++;
						}
        		    }
        		}else{
        			for (int i = 1; i <=60; i++) {
        				for (int j = 1; j <=60; j++) 
        					System.out.print(P[i][j]);System.out.println();
        			}System.out.println();
        			System.out.println("------------------------------------------------------------");
        			System.out.println();
        			for (int i = 1; i <=60; i++) {
        				for (int j = 1; j <=60; j++) 
        					P[i][j]='.';
        			}
        	        
        		}
        	}
        }catch(Exception e){}
	}
}

/*
.C C5 3 |ACM|
.C C1 10 |SOUTH CENTRAL REGION PROBLEM FOUR SAMPLE OUTPUT|
.C C5 20 |OVERFLOW CENTERED LARGE FONT|
.C C5 30 |CENTERED|
.P C1 33 11 |LINE THAT OVERWRITES THROUGH CENTERED|
.L C1 40 |SMALL FONT LINE IS LEFT JUSTIFIED ON ROW FORTY|
.R C5 50 |RIGHT|
.P C5 57 10 |BOTTOM AND RIGHT TRUNCATION|
.EOP 
.C C5 3 |ACM|
.C C1 10 |SOUTH CENTRAL REGION PROBLEM FOUR SAMPLE OUTPUT|
.C C5 20 |OVERFLOW CENTERED LARGE FONT|
.C C5 30 |CENTERED|
.P C1 33 11 |LINE THAT OVERWRITES THROUGH CENTERED|
.L C1 40 |SMALL FONT LINE IS LEFT JUSTIFIED ON ROW FORTY|
.C C5 50 |ABCDEFGHIJK|
.EOP 

*/