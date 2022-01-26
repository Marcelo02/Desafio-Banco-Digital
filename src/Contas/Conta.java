package Contas;

import Clientes.Cliente;

public abstract class Conta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	public double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}


	public void sacar(double valor) {
		if (valor<saldo){
			saldo -= valor;
		}
		else{
			System.out.println("Voce nao tem saldo suficiente. =(");
		}
	}


	public void depositar(double valor) {
		saldo += valor;
	}


	public void transferir(double valor, Conta contaDestino) {
		if (valor<this.saldo) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
		else{
			System.out.println("Saldo insuficiente! =(");
		}
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
