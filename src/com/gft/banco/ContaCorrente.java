package com.gft.banco;

import java.math.BigDecimal;

public class ContaCorrente extends Conta{
    public ContaCorrente(Titular titular, BigDecimal saldo) {
        super(titular, saldo);
    }

    @Override
    public BigDecimal rendimento() {
        return saldo.multiply(BigDecimal.valueOf(0.03));
    }

    @Override
    public BigDecimal calcularImposto() {
        return saldo.multiply(BigDecimal.valueOf(0.25));
    }
}
