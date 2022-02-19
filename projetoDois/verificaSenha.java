package projetoDois;

import java.util.Scanner;

public class verificaSenha {
	
	   public static void main(String[] args)
	   {
		   		   
	      int minCaracteresSenha=6, caracteresMaiusculos=0, caracteresMinusculos=0;
	      int digitos=0;
	      char ch;
	      Scanner s = new Scanner(System.in);
	     	            
	      System.out.print("\nCrie uma senha: ");
	      String senha = s.nextLine();
	      
	      int caracteresDeEntrada = senha.length();
	      int diferenca = minCaracteresSenha - caracteresDeEntrada;
	      
	      if(caracteresDeEntrada<minCaracteresSenha){
	         System.out.println("\n Acrescente mais " + diferenca + " caracter(es) a sua senha.");
	         return;
	      } 
	      else {
	    	  
	    	 for(int i=0; i<caracteresDeEntrada; i++){
	    		 
	    		 ch = senha.charAt(i);
	    		 
	    		 if(Character.isUpperCase(ch))
	            	caracteresMaiusculos++;
	    		 else if(Character.isLowerCase(ch))
	            	caracteresMinusculos++;
	    		 else if(Character.isDigit(ch))
	            	digitos++;
	    		 
	    	 }
	     }	  
	      
	         if(caracteresMaiusculos==0)
	         	System.out.println("\nSua senha precisa conter, pelo menos, um caractere maiúsculo.");
	         else if(caracteresMinusculos==0)
	            System.out.println("\nSua senha precisa conter, pelo menos, um caractere minúsculo. ");
	         else if(digitos==0) 
	            System.out.println("\nSua senha precisa conter, pelo menos, um dígito.");  
	         else if(!(senha.contains("!")||senha.contains("@")|| senha.contains("#") || senha.contains("$")|| senha.contains("%") || senha.contains("^") || senha.contains("&") || senha.contains("*")||senha.contains("(")||senha.contains(")")||senha.contains("-")||senha.contains("+")))
	        	 System.out.println("\nVocê precisa de, pelo menos, um caractere especial para sua senha.");
	         else
	        	 System.out.println("\nSenha criada.");
	        	 	   	   
	  }
	   
}