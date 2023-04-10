package projetodsi;

import java.util.Scanner;

public class Cadastrodefuncionario {

public void funcionario(){
		Scanner teclado = new Scanner(System.in);
		
		String usuario, senha, nome, cpf, nomem, nomep, rg, cnh, escolaridade, nasc, genero, estadoc, naturalidade, endereco, cep, uf,
		       cidade, bairro, telefone, email, cargo, escolha;
		int idade;
		
		System.out.println("=======================================");
		System.out.println("        CADASTRO DE FUNCIONÁRIO        ");
		System.out.println("=======================================");
		System.out.println("   ");
		System.out.println("Digite o usuário: ");
		usuario = teclado.next();
		System.out.println("Digite a senha: ");
		senha = teclado.next();
		System.out.println("Digite o nome: ");
		nome = teclado.next();
		System.out.println("Digite o CPF: ");
		cpf = teclado.next();
		System.out.println("Digite o RG: ");
		rg = teclado.next();
		System.out.println("Digite a data de nascimento: ");
		nasc = teclado.next();
		System.out.println("Digite a idade: ");
		idade = teclado.nextInt();
		System.out.println("Digite o cargo: ");
		cargo = teclado.next();
		System.out.println("Digite o nome da mãe: ");
		nomem = teclado.next();
		System.out.println("Digite o nome do pai: ");
		nomep = teclado.next();
		System.out.println("Possui CNH(se sim, qual a categoria?): ");
		cnh = teclado.next();
		System.out.println("Digite a escolaridade: ");
		escolaridade = teclado.next();
		System.out.println("Gênero: ");
		genero = teclado.next();
		System.out.println("Estado civil: ");
		estadoc = teclado.next();
		System.out.println("Naturalidade: ");
		naturalidade = teclado.next();
		System.out.println("Digite o endereço: ");
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
		System.out.println("FUNCIONÁRIO CADASTRADO COM SUCESSO!");
		System.out.println("  ");
		System.out.println("ESCOLHA UMA OPÇÃO");
		System.out.println("1 - CADASTRAR NOVO FUNCIONÁRIO");
		System.out.println("2 - VOLTAR AO MENU INICIAL");
		escolha = teclado.next();
		
		if (escolha.equals("1")) {
		   funcionario();
		}
		
		if (escolha.equals("2")) {
			Telafuncional menu = new Telafuncional();
    		menu.telafuncional();
		}
		
		}

}
