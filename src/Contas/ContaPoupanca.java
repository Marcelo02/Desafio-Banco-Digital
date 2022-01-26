package Contas;

import Clientes.Cliente;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}


	public void imprimirExtrato() {
		System.out.println("=== Extrato contas.Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
}
