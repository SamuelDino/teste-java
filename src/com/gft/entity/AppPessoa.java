package com.gft.entity;

public class AppPessoa {
    public static void main(String[] args) {
        Estado ceara = new Estado("Ceará");
        Cidade fortaleza = new Cidade("Fortaleza", ceara);
        Endereco endereco1 = new Endereco("Rua da paz", "100", "Centro", fortaleza, "60.000-00");
        Pessoa joao = new Pessoa("João",endereco1, "(85)99999.5000");
        System.out.println(joao.toString());
    }
}
