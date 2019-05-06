package helloworldmvc.oui;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;


public class App  {
    public static void main( String[] args ){
    	
    	  String chaine="";
    	  String fichier ="C:\\Users\\thoma\\Desktop\\TXT";
    	  try{
    		   InputStream ips=new FileInputStream(fichier); 
    		   InputStreamReader ipsr=new InputStreamReader(ips);
    		   BufferedReader br=new BufferedReader(ipsr);
    		   String ligne;
    	   while ((ligne=br.readLine())!=null){
    		    System.out.println(ligne);
    		    chaine+=ligne+"\n";
    		   }
    		   br.close(); 
    	  }  
    	  catch (Exception e){
    		   System.out.println(e.toString());
    	  }
    	 }
    	}


