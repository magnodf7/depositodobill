package projetodsi;

import java.util.Scanner;

public class Cadastrodefornecedor {

public void fornecedor(){
    
		Scanner teclado = new Scanner(System.in);
		
        String nome, cnpj, endereco, uf, cidade, bairro, telefone, email, cep, escolha;
        
        System.out.println("=======================================");
		System.out.println("        CADASTRO DE FORNECEDOR         ");
		System.out.println("=======================================");
		System.out.println("   ");
        System.out.println("Digite o nome: "); 
        nome = teclado.next();
        System.out.println("Digite o CNPJ: ");
        cnpj = teclado.next();
        System.out.println("Digite o endereço:");
        endereco = teclado.next();
        System.out.println("Digite o CEP: ");
        cep = teclado.next();
        System.out.println("Digite o UF: ");
        uf = teclado.next();
        System.out.println("Digite o nome da cidade: ");
        cidade = teclado.next();
        System.out.println("Digite o nome do bairro: ");
        bairro = teclado.next();
        System.out.println("Digite o telefone: ");
        telefone = teclado.next();
        System.out.println("Digite o email: ");
        email = teclado.next();
        System.out.println("  ");
		System.out.println("FORNECEDOR CADASTRADO COM SUCESSO!");
		System.out.println("  ");
		System.out.println("ESCOLHA UMA OPÇÃO");
		System.out.println("1 - CADASTRAR NOVO FORNECEDOR");
		System.out.println("2 - VOLTAR AO MENU INICIAL");
		escolha = teclado.next();
		
		if (escolha.equals("1")) {
			fornecedor();
		}
		
		if (escolha.equals("2")) {
			Telafuncional menu = new Telafuncional();
    		menu.telafuncional();
		}
    }
}	