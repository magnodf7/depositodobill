package projetodsi;

import java.util.Scanner;

public class login {
	
	Scanner teclado = new Scanner(System.in);
	
	public String login1, login2, senha1, senha2, registrar, escolha;
	String loginveri1 = "teste1";
	String senhaveri1 = "123" ;
	String loginveri2 = "teste2";
	String senhaveri2 = "456";
	
	public void login() {
		
		System.out.println("==================================================");
		System.out.println("                 SEJA BEM VINDO                   ");
		System.out.println("==================================================");
		System.out.println("Escolha uma opção: ");
		System.out.println("  ");
	    System.out.println("1 - ADMINISTRADOR");
	    System.out.println("2 - FUNCIONÁRIO");
	    System.out.println("3 - REGISTRAR");
	    escolha = teclado.next();
		
	    if (escolha.equals ("1")) {
	    	System.out.println("Login:");
	    	login1 = teclado.next();
	    	System.out.println("Senha:");
	    	senha1 = teclado.next();
	    	 
	    	if (login1.equals(loginveri1) && senha1.equals(senhaveri1)) { 
	  	    	Telafuncional menu = new Telafuncional();
	  	    	menu.telafuncional();
	  	    	
	    	} else {
	    		System.out.println("Login e Senha inválidos!");
	    		login();
	    	}
	    } 
	    
	  
	    
	    
	    if(escolha.equals("2")){
	    System.out.println("Login:");
	    login2 = teclado.next();
	    System.out.println("Senha:");
	    senha2 =  teclado.next();
	    
	    	if (login2.equals(loginveri2) && senha2.equals(senhaveri2)) {
	    		Telafuncional2 menu2 = new Telafuncional2();
	  	    	menu2.telafuncional2();
	        } else {
	        	System.out.println("Login e Senha inválidos!");
	        	login();
	        }
	    }
	    
	    
	    if(escolha.equals("3")) {
	    	
	    	Cadastrodaempresa cadastro = new Cadastrodaempresa();
	    	cadastro.empresa();
	    	
	    }
		

	}
	
	
}
