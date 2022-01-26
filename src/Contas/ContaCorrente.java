package Contas;

import Clientes.Cliente;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato contas.Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
