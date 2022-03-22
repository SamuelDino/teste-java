package com.gft.banco;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Titular titular, BigDecimal saldo) {
        super(titular, saldo);
    }

    @Override
    public BigDecimal rendimento() {
        return saldo.multiply(BigDecimal.valueOf(0.05));
    }
}
