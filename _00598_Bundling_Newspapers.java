import java.io.*;
import java.util.*;
public class _00598_Bundling_Newspapers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int t = Integer.parseInt(br.readLine());
		br.readLine();
		for (int xd = 0; xd < t; xd++){
			if(xd>0)pw.println();
		int li=0,ls=0,n=0;
		String N[]= new String[12];
		StringTokenizer tk= new StringTokenizer(br.readLine());
		try{
			while(true){
				String h = br.readLine();
				if(h.length()==0)break;
				N[n]=h;if(N[n].length()==0)break;n++;}
		}catch(Exception e){}
		String h =tk.nextToken();
		if(!h.equals("*")){
			li=Integer.parseInt(h);
			if(tk.hasMoreTokens())ls=Integer.parseInt(tk.nextToken());
			else ls=li;
		}else {li=1;ls=n;}
		StringBuilder sb= new StringBuilder(),asb;
		LinkedList<StringBuilder> Psb= new LinkedList<StringBuilder>();Psb.add(sb);
		LinkedList<Integer> Pi= new LinkedList<Integer>();Pi.add(0);
		int c=0,s=0,ss=1;
		while(true){
			sb=Psb.removeFirst();
			if(s==0){c++;
				if(c<=ls){s=ss;ss=0;
					if(c>=li){
						if(c>li)pw.println();
						pw.println("Size "+c);
					}
				}
				else break;
			}s--;
			for (int i = Pi.removeFirst(); i < n ; i++){
				asb= new StringBuilder(sb);
				if(c>1)asb.append(", ");
				asb.append(N[i]);ss++;
				Psb.add(asb);Pi.add(i+1);
				if(c>=li)pw.println(asb);
			}
		}pw.println();
		}
		pw.close();
	}
}

/*
2

2 3
Times
Herald-Tribune
Post
New Advocate

2 3
Times
Herald-Tribune
Post
New Advocate

*/