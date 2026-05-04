package contaBancaria.model;

public abstract class Conta {
	
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	//Metodo construtivo feito automáticamente pleo STS
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		super();
		this.numero = numero;  //A variável número da classe conta vai receber 
		this.agencia = agencia;//a variável número declarada na função conta pelo método construtivo//
		this.tipo = tipo;      //Assim como as outras variávels declaradas//
		this.titular = titular;
		this.saldo = saldo;
	}

	//Gerando getters and Setters;
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	//Criando os métodos auxiliares.
	public boolean sacar(float valor) { //Esse método exige return por não ser void
		if(this.saldo < valor) {
			System.out.println("\nSaldo Insuficiente!!");
			return false;
		}
		else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	public void depositar(float valor) { //depositanto
		this.saldo = this.saldo + valor;
	}
	//Metodos que não são Static precisam ser chamados atrelados a uma variável na classe
	//Essa variável deve ser declarada no main para que seja a facilitadora que permite acessar
	//os "serviços" que a classe oferece.
	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1:
			tipo = "Conta Corrente";
			break;
		case 2:
			tipo = "Conta Poupança";
			break;
		}

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados da Conta:");
		System.out.println("***********************************************************");
		System.out.println("Numero da Conta: " + this.numero);
		System.out.println("Agência: " + this.agencia);
		System.out.println("Tipo da Conta: " + tipo);
		System.out.println("Titular: " + this.titular);
		System.out.printf("Saldo: R$ %.2f%n", this.saldo);

	}


}
