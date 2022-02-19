package projetoTres;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class parDeAnagramas {
	    public static void main(String[] args) {
	    	
	    	Scanner s = new Scanner(System.in);
	    	System.out.print("\nDigite uma palavra: ");
	    	subString (s.nextLine());
	    	
	    }
	  
	    static void subString(String str){
	    	
	        HashMap<String, Integer> map= new HashMap<>();
	  
	        for(int i = 0; i < str.length(); i++){
	        	
	            for(int j = i; j < str.length(); j++){
	            	
	                char[] valC = str.substring(i, j+1).toCharArray();
	                Arrays.sort(valC);
	                String val = new String(valC);
	                
	                if (map.containsKey(val)) 
	                    map.put(val, map.get(val)+1); 
	                else 
	                    map.put(val, 1);
	                
	            }
	        }
	        int contadorDeParesDeAnagramas = 0;
	        
	        for(String key: map.keySet()){
	        	
	            int n = map.get(key);
	            contadorDeParesDeAnagramas += (n * (n-1))/2;
	            
	        }
	        
	        System.out.println("Você possui " + contadorDeParesDeAnagramas + " par(es) de anagrama(s).");
	        
	   }
}
	
