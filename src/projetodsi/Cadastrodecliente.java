package projetodsi;

import java.util.Scanner;

public class Cadastrodecliente {

public void cliente(){
		
		 Scanner teclado = new Scanner(System.in);

		String nome, cpf, rg, data, telefone, endereco, email, cep, uf, cidade , bairro, escolha;
		int idade;
		
		System.out.println("=======================================");
		System.out.println("          CADASTRO DE CLIENTE          ");
		System.out.println("=======================================");
		System.out.println("   ");
		System.out.println("Digite o nome: ");
		nome = teclado.next();
		System.out.println("Digite a idade: ");
		idade = teclado.nextInt();
		System.out.println("Digite o CPF: ");
		cpf = teclado.next();
		System.out.println("Digite o RG: ");
		rg = teclado.next();
		System.out.println("Digite o endereço: ");
		endereco = teclado.next();
		System.out.println("Digite o CEP: ");
		cep = teclado.next();
		System.out.println("Digite o UF: ");
		uf = teclado.next();
		System.out.println("Digite a cidade: ");
		cidade = teclado.next();
		System.out.println("Digite o bairro: ");
		bairro = teclado.next();
		System.out.println("Digite o telefone: ");
		telefone = teclado.next();
		System.out.println("Digite o email: ");
		email = teclado.next();
		System.out.println("  ");
		System.out.println("CLIENTE CADASTRADO COM SUCESSO!");
		System.out.println("  ");
		System.out.println("ESCOLHA UMA OPÇÃO");
		System.out.println("1 - CADASTRAR NOVO CLIENTE");
		System.out.println("2 - VOLTAR AO MENU INICIAL");
		escolha = teclado.next();
		
		if (escolha.equals("1")) {
			cliente();
		}
		
		if (escolha.equals("2")) {
			Telafuncional menu = new Telafuncional();
    		menu.telafuncional();
		}
	}

}
