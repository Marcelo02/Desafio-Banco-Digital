import Clientes.Cliente;
import Contas.*;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Cliente gerson = new Cliente("Gerson");
        ContaCorrente cc = new ContaCorrente(gerson);
        ContaPoupanca poupanca = new ContaPoupanca(gerson);
        cc.saldo = 180;

        System.out.println("Bem-vindo " + gerson.getNome());
        System.out.println(
                "O que voce quer fazer?\n" +
                        "1 - Ver extrato\n" +
                        "2 - Sacar\n" +
                        "3 - Depositar\n" +
                        "4 - Tranferir");

        int i = scan.nextInt();
        switch (i) {
            case 1:
                poupanca.imprimirExtrato();
                cc.imprimirExtrato();
                break;
            case 2:
                System.out.println("Quanto voce deseja sacar?");
                double valor = scan.nextDouble();
                System.out.println(
                        "De qual conta voce quer sacar?\n" +
                                "1 - Poupanca\n" +
                                "2 - Corrente");
                int i2 = scan.nextInt();
                if (i2 == 1) {
                    poupanca.sacar(valor);
                } else {
                    cc.sacar(valor);
                }
                poupanca.imprimirExtrato();
                cc.imprimirExtrato();
                break;
            case 3:
                System.out.println("Quanto voce deseja depositar?");
                valor = scan.nextDouble();
                System.out.println(
                        "De qual conta voce quer depositar?\n" +
                                "1 - Poupanca\n" +
                                "2 - Corrente");
                int i3 = scan.nextInt();
                if (i3 == 1) {
                    poupanca.depositar(valor);
                } else {
                    cc.depositar(valor);
                }
                poupanca.imprimirExtrato();
                cc.imprimirExtrato();
                break;
            case 4:
                System.out.println("Quanto voce deseja transferir?");
                valor = scan.nextDouble();
                System.out.println(
                        "De qual conta voce quer transferir?\n" +
                                "1 - Poupanca\n" +
                                "2 - Corrente");
                int i4 = scan.nextInt();
                if (i4 == 1) {
                    poupanca.transferir(valor, cc);
                } else {
                    cc.transferir(valor, poupanca);
                }
                poupanca.imprimirExtrato();
                cc.imprimirExtrato();
                break;
            default:
                System.out.println("Numero invalido! Tente novamente =(");
                break;
        }
    }

}
/*Conta cc = new ContaCorrente(gerson);
		Conta poupanca = new ContaPoupanca(gerson);

		cc.depositar(100);
		cc.transferir(100, poupanca);


		cc.imprimirExtrato();
		poupanca.imprimirExtrato();*/
