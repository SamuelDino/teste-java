package com.gft.banco;

import java.math.BigDecimal;

public abstract class Conta implements Imposto{
    private static int proxNumero = 1000;
    protected final int numero;
    protected Titular titular;
    protected BigDecimal saldo;

    public Conta(Titular titular, BigDecimal saldo) {
        this.numero = proxNumero++;
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract BigDecimal rendimento();

    public int getNumero() {
        return numero;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
