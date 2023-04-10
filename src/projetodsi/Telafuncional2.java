package projetodsi;

import java.util.Scanner;

public class Telafuncional2 {
Scanner teclado =  new Scanner(System.in);
	
	String escolha;
	
public void telafuncional2() {
		System.out.println("Escolha uma opção: ");
		System.out.println("  ");
		System.out.println("1 - CADASTRAR CLIENTE");
		System.out.println("2 - CADASTRAR PRODUTO");
		System.out.println("3 - CADASTRAR FUNCIONÁRIO");
		System.out.println("4 - CADASTRAR FORNECEDOR");
		System.out.println("5 - FOLHA SALARIAL");
		System.out.println("6 - SAIR");
		escolha = teclado.next();
		
        if (escolha.equals ("1")) {
        	Cadastrodecliente cadastro_cliente = new Cadastrodecliente();
        	cadastro_cliente.cliente();
        }
        
        if (escolha.equals ("2")) {
        	Cadastrodoproduto cadastro_produto = new Cadastrodoproduto();
        	cadastro_produto.produto();
        }
        
        if (escolha.equals ("3")) {
        	System.out.println("VOCÊ NÃO TEM PERMISSÃO");
        	System.out.println("  ");
        	telafuncional2();
        }
        
        if (escolha.equals("4")) {
        	System.out.println("VOCÊ NÃO TEM PERMISSÃO");
        	System.out.println("  ");
        	telafuncional2();
        }
        
        if (escolha.equals("5")) {
        	System.out.println("VOCÊ NÃO TEM PERMISSÃO");
        	System.out.println("  ");
        	telafuncional2();
        }
        
        if (escolha.equals("6")) {
        	login Login = new login();
        	Login.login();
        }
	}
}


