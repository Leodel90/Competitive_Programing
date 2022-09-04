import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class _12504_Updating_a_Dictionary {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int xd = 0; xd < t; xd++){
			char  D[] = br.readLine().toCharArray();
			TreeMap<String, String> OD= new TreeMap<String, String>();
			String k="",v="";
			for (int i = 0; i < D.length; i++){
				char x = D[i];
				if(x<97||x>122){
					if(x<48||x>57){
						if(k.length()>0&&v.length()>0){OD.put(k, v);k="";v="";}}
					else v+=x;
				}
				else k+=x;
			}
			D= br.readLine().toCharArray();
			k="";v="";
			TreeSet<String> N= new TreeSet<String>();
			TreeSet<String> C= new TreeSet<String>();
			for (int i = 0; i < D.length; i++){
				char x = D[i];
				if(x<97||x>122){
					if(x<48||x>57){
						if(k.length()>0&&v.length()>0){
						if(OD.containsKey(k)){if(!OD.get(k).equals(v))C.add(k);
							OD.remove(k);
						}else N.add(k);
						k="";v="";
							}
						}
					else v+=x;
				}
				else k+=x;
			}
			if(!N.isEmpty()||!C.isEmpty()||!OD.isEmpty()){
				if(!N.isEmpty()){System.out.print("+"+N.pollFirst());
					while(!N.isEmpty())System.out.print(","+N.pollFirst());
					System.out.println();
				}
				if(!OD.isEmpty()){System.out.print("-"+OD.pollFirstEntry().getKey());
				while(!OD.isEmpty())System.out.print(","+OD.pollFirstEntry().getKey());
				System.out.println();
			}
				if(!C.isEmpty()){System.out.print("*"+C.pollFirst());
				while(!C.isEmpty())System.out.print(","+C.pollFirst());
				System.out.println();
			}
			}else System.out.println("No changes");
			
			System.out.println();
		}
	}
}

