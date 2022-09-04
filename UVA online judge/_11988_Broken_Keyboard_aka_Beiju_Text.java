import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class _11988_Broken_Keyboard_aka_Beiju_Text{
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
		PrintWriter out= new PrintWriter(System.out);
        try{
	       while(true){
		    String cad =br.readLine();
		    boolean q=false;
            Lista r=new Lista();
            Lista a=new Lista();
		    char C[]=cad.toCharArray();
		     for (int i = 0; i < C.length; i++){
			   char x=C[i];
			    if(x!='['&&x!=']'){
			        if(q)a.add(x);
			        else r.add(x);
			    }else{
				   q=x=='[';
				   if(a.ini!=null){
					   a.fin.sig=r.ini;
					   r.ini=a.ini;
					   if(r.fin==null)r.fin=a.fin;
					   a= new Lista();
				   }
			   }
		    }
		   while(a.ini!=null){out.print(a.ini.v);a.ini=a.ini.sig;}
		   while(r.ini!=null){out.print(r.ini.v);r.ini=r.ini.sig;}
                out.println();
	       }
        }catch(Exception e){}
        br.close();out.close();
	}
	public static class Nodo{
		Nodo sig;
		char v;
		public  Nodo(char x){
			v=x;sig=null;
		}
	}
	public static class Lista{
		Nodo ini,fin;
		public Lista(){
			ini = null; fin=null;
		}
		public void add(char x){
			Nodo aux=new Nodo(x);
			if(ini==null)ini=aux;
			else fin.sig=aux;
			fin=aux;
		}	
	}
}