package projetodsi;

import java.util.Scanner;

public class Cadastrodaempresa {

public void empresa(){
       
	    Scanner teclado = new Scanner(System.in);
		
	    String usuario, senha, razao, nomef, cnpj, endereco, telefone, email, uf, cep, cidade, bairro, escolha;
 	
		
		System.out.println("=======================================");
		System.out.println("          CADASTRO DA EMPRESA          ");
		System.out.println("=======================================");
		System.out.println("   ");
		System.out.println("Digite o nome do usuário: ");
		usuario = teclado.next();
		System.out.println("Digite sua senha: ");
		senha = teclado.next();
		System.out.println("Digite a Razão Social: ");
		razao = teclado.next();
		System.out.println("Digite o nome fantasia: ");
		nomef = teclado.next();
		System.out.println("Digite o CNPJ: ");
		cnpj = teclado.next();
		System.out.println("Digite o endereço: ");
		endereco = teclado.next();
		System.out.println("Digite o CEP: ");
		cep = teclado.next();
		System.out.println("Digite o nome da cidade: ");
		cidade = teclado.next();
		System.out.println("Digite o nome do bairro: ");
		bairro = teclado.next();
		System.out.println("Digite o telefone: ");
		telefone = teclado.next();
		System.out.println("Digite o e-mail: ");
		email = teclado.next();
		System.out.println(" ");
		System.out.println("REGISTRADO!");
		System.out.println(" ");
		System.out.println("Escolha uma opção:");
		System.out.println("1 - FAZER LOGIN");
		System.out.println("2 - SAIR");
		escolha = teclado.next();
		
		if (escolha.equals("1")) {
			login Login = new login();
			Login.login();
		}
		
		if (escolha.equals("2")) {
			System.out.println("PROGRAMA FINALIZADO");
		}
		
	}
}
		
		
		
		
		
