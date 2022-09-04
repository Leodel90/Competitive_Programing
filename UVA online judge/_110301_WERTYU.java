import java.io.*;    
public class _110301_WERTYU{

	public static void main(String[] args) {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		char C[] = new char[255];
		for (int i = 50; i <= 57; i++)C[i]=(char)(i-1);
		C[49]=(char)96;C[48]=(char)57;
		C[66]='V';C[67]='X';
		C[68]='S';C[69]='W';C[70]='D';
		C[71]='F';C[72]='G';C[73]='U';
		C[74]='H';C[75]='J';C[76]='K';
		C[77]='N';C[78]='B';C[79]='I';
		C[80]='O';C[82]='E';
		C[83]='A';C[84]='R';C[85]='Y';
		C[86]='C';C[87]='Q';C[88]='Z';
		C[89]='T';C[45]='0';C[61]='-';
		C[91]='P';C[93]='[';C[92]=']';
		C[59]='L';C[39]=';';C[44]='M';
		C[46]=',';C[47]='.';C[160]=' ';
		
		/*
		for (int i = 0; i < 255; i++){
			System.out.println(i+"  "+(char)i);
		}
		*/
		
		try{
			while(true){
				char CAD []= br.readLine().toCharArray();
				if(CAD.length==0)break;
				StringBuilder sb= new StringBuilder();
				for (int i = 0; i < CAD.length; i++){
					sb.append(C[CAD[i]]);
				}
				pw.println(sb);
			}
		}catch(Exception e){}pw.close();
		
	}

}
/*
O S, GOMR YPFSU/
*/