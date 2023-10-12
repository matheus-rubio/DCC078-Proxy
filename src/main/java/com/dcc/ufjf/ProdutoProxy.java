package com.dcc.ufjf;

import java.util.List;

public class ProdutoProxy implements IProduto {
    private Produto produto;

    private Integer numeroIdentificador;

    public ProdutoProxy(Integer numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public List<String> obterDadosProduto(Funcionario funcionario) {
        if (this.produto == null) {
            this.produto = new Produto(this.numeroIdentificador);
        }
        return this.produto.obterDadosProduto(funcionario);
    }
}
