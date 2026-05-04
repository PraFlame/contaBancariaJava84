package contaBancaria;

import java.util.Scanner;
import contaBancaria.model.Conta;
import contaBancaria.model.ContaCorrente; //Importando do pacote de contasModelo
import contaBancaria.model.ContaPoupanca;
import contaBancaria.util.Cores;



public class Menu {
	
	private static final Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {


		int opcao;
		
		//Atualizações do pacote model//
		
		/* Teste retirado dado classe conta ser abstrata
		// Teste da Classe Conta
		
		//Instanciar novo objeto da classe conta pelo método construtivo
        Conta c1 = new Conta(1, 123, 1, "Adriana Sanches", 10000.0f);
        
        //visualizando os dados da conta atual
        c1.visualizar();
        
        /*
        //Modificando DIRETAMENTE o Saldo da conta e o nome do titular
        c1.setSaldo(15000.0f);
	    c1.setTitular("Maria Joaquina");
		c1.visualizar();
		*/ //Testes da classe conta
		/*
		//Sacando
        c1.sacar(12000.0f);
		c1.visualizar();
		
		
		//Depositando
        c1.depositar(5000.0f);
		c1.visualizar();
		*/ // Teste retirado dado classe conta ser abstrata
		
		
		// Iniciando testes das classes Corrente e Poupança
		// Teste da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "José da Silva", 0.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
				
		// Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca(3, 123, 2, "Maria dos Santos", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		// Finalizando testes das classes Corrente e Poupança
		

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Conta\n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE + "Saque\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE + "Depósito\n\n");

				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE + "Transferência entre Contas\n\n");

				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				break;
			}
		}
	}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Flame Souza");
		System.out.println("Generation Brasil - flames@genstudents.org");
		System.out.println("https://github.com/PraFlame/contaBancariaJava84.git");
		System.out.println("*********************************************************");
	}
	

}
