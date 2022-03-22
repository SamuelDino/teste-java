package com.gft.banco;

import java.math.BigDecimal;

public class AppConta {
    public static void main(String[] args) {
        Titular titular1 = new Titular("Joao");
        Conta contaCorrente = new ContaCorrente(titular1, BigDecimal.valueOf(1000.00));
        Conta contaPoupanca = new ContaPoupanca(titular1, BigDecimal.valueOf(1000.00));
        System.out.println("Titular: " + titular1.getNome() +
                "\nSaldo Conta Corrente: " + String.format("%.2f", contaCorrente.getSaldo()) +
                " Rendimento: " + String.format("%.2f", contaCorrente.rendimento()) +
                " Imposto: "+ String.format("%.2f", contaCorrente.calcularImposto()) +
                "\nSaldo Conta Poupanca: " + String.format("%.2f", contaPoupanca.getSaldo()) +
                " Rendimento: " + String.format("%.2f", contaPoupanca.rendimento())+
                " Imposto: "+ String.format("%.2f", contaPoupanca.calcularImposto()));
    }
}
