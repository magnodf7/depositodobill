package projetodsi;

import java.util.Scanner;

public class Cadastrodoproduto {
	
	 Scanner teclado = new Scanner (System.in);
     
     String prod, grup, fornec, escolha;
     double valorc, valorv;
     int cod, quant;
 
     public void produto() {
    	  
    	    System.out.println("=======================================");
 		    System.out.println("          CADASTRO DE PRODUTO          ");
 		    System.out.println("=======================================");
 		    System.out.println("   ");
            System.out.println("Digite o nome do produto: ");
    		prod = teclado.next();
    		System.out.println("Digite o código do produto: ");
    		cod = teclado.nextInt();
    		System.out.println("Digite o grupo ao qual o produto pertence: ");
    		grup = teclado.next();
    		System.out.println("Digite o valor de custo do produto: ");
    		valorc = teclado.nextDouble();
    		System.out.println("Digite o valor da revenda do produto: ");
    		valorv = teclado.nextDouble();
    		System.out.println("Digite a quantidade em estoque do produto: ");
    		quant = teclado.nextInt();
    		System.out.println("Digite o fornecedor do produto: ");
    		fornec = teclado.next();
    		System.out.println("  ");
    		System.out.println("PRODUTO CADASTRADO COM SUCESSO!");
    		System.out.println("  ");
    		System.out.println("ESCOLHA UMA OPÇÃO");
    		System.out.println("1 - CADASTRAR NOVO PRODUTO");
    		System.out.println("2 - MENU INICIAL");
    		escolha = teclado.next();
    		
    		if (escolha.equals("1")) {
            	produto();
    		}
    		
    		if (escolha.equals("2")) {
    			Telafuncional menu = new Telafuncional();
        		menu.telafuncional();
    		}
    }
   
}
