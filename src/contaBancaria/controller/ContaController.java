package contaBancaria.controller;

import java.util.ArrayList;
import java.util.List;

import contaBancaria.model.Conta;
import contaBancaria.repository.ContaRepository;



public class ContaController implements ContaRepository {
	
	private List<Conta> listaContas = new ArrayList<Conta>();
	int num = 0;
	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}
		
	}
	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.printf("A conta número %d foi criada com sucesso!%n", conta.getNumero());
		
	}
	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}
	
	
	//Adicionando ferramentas auxiliares às funções (Gerado após o projeto final Bloco 1)
	public int gerarNumero() {
		return ++ num;
	}

	public Conta buscarNaCollection(int numero) {
		for(var conta : listaContas) {
			if(conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}

}
