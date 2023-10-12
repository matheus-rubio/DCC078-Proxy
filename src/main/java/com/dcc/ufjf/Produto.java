package com.dcc.ufjf;

import java.util.Arrays;
import java.util.List;

public class Produto implements IProduto {
    private Integer numeroIdentificador;
    private String nome;
    private Double valor;
    private Double lucroPorVenda;

    public Produto(Integer numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
        Produto objeto = BD.getProduto(numeroIdentificador);
        this.nome = objeto.nome;
        this.valor = objeto.valor;
        this.lucroPorVenda = objeto.lucroPorVenda;
    }

    public Produto(Integer numeroIdentificador, String nome, Double valor, Double lucroPorVenda) {
        this.numeroIdentificador = numeroIdentificador;
        this.nome = nome;
        this.valor = valor;
        this.lucroPorVenda = lucroPorVenda;
    }

    public Integer getNumeroIdentificador() {
        return this.numeroIdentificador;
    }

    public List<String> obterDadosProduto(Funcionario funcionario) {
        if (funcionario.isAdministrador()) {
            return Arrays.asList(this.nome, this.valor.toString(), this.lucroPorVenda.toString());
        } else {
            return Arrays.asList(this.nome, this.valor.toString());
        }
    }
}
