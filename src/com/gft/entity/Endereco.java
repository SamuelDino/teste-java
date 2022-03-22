package com.gft.entity;

public class Endereco {

    private String rua;
    private String numero;
    private String bairro;
    private Cidade cidade;
    private String CEP;

    public Endereco(String rua, String numero, String bairro, Cidade cidade, String CEP) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.CEP = CEP;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro=" + bairro +
                ", cidade=" + cidade +
                ", estado=" + cidade.getEstado() +
                ", CEP='" + CEP + '\'' +
                '}';
    }
}
