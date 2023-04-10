package projetodsi;

import java.util.Scanner;

public class Folhasalarial {

public void Folhasalarial() {
		
		Scanner teclado = new Scanner(System.in);
		
		String nomec, cpf, cargo, dadosb, escolha;
		float inss, fgts, vt, vb, vl, descontos;
		int dtrabalho;
		
		System.out.println("=======================================");
		System.out.println("       CADASTRAR FOLHA SALARIAL        ");
		System.out.println("=======================================");
		System.out.println("   ");
		System.out.println("Digite o nome do colaborador: ");
		nomec = teclado.next();
		System.out.println("Digite o CPF: ");
		cpf = teclado.next();
		System.out.println("Digite o cargo: ");
		cargo = teclado.next();
		System.out.println("Valor bruto do salário: ");
		vb = teclado.nextFloat();
		System.out.println("Desconto do INSS: ");
		inss = teclado.nextFloat();
		System.out.println("Desconto do FGTS: ");
		fgts = teclado.nextFloat();
		System.out.println("Desconto do Vale transporte: ");
		vt = teclado.nextFloat();
		System.out.println("Digite o número de dias trabalhado: ");
		dtrabalho = teclado.nextInt();
		descontos = (inss+fgts+vt);
		vl = vb - descontos;
		System.out.println("Valor líquido do salário: " + vl);
		System.out.println("  ");
		System.out.println("Digite os dados bancários: ");
		dadosb = teclado.next();
		System.out.println("  ");
		System.out.println("FUNCIONÁRIO FOI CADASTRADO NA FOLHA SALARIAL");
		System.out.println("  ");
		System.out.println("ESCOLHA UMA OPÇÃO");
		System.out.println("1 - CADASTRAR NOVA FOLHA SALARIAL");
		System.out.println("2 - VOLTAR AO MENU INICIAL");
		escolha = teclado.next();
		
		if (escolha.equals("1")) {
			Folhasalarial();
		}
		
		if (escolha.equals("2")) {
			Telafuncional menu = new Telafuncional();
    		menu.telafuncional();
		}
		
	}

}
