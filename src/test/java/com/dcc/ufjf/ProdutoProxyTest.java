package com.dcc.ufjf;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoProxyTest {

    @BeforeEach
    void setUp() {
        BD.addProduto(new Produto(1, "Xbox One S", 1500.0, 500.0));
        BD.addProduto(new Produto(2, "Playstation 5", 2500.0, 800.0));
    }

    @Test
    void deveRetornarDadosDoProdutoPraUsuarioNaoAdmin() {
        Funcionario funcionario = new Funcionario("Jaozin", false);
        ProdutoProxy produto = new ProdutoProxy(2);

        assertEquals(Arrays.asList("Playstation 5", "2500.0"), produto.obterDadosProduto(funcionario));
    }

    @Test
    void deveRetornarDadosDoProdutoPraUsuarioAdmin() {
        Funcionario funcionario = new Funcionario("Maria", true);
        ProdutoProxy produto = new ProdutoProxy(2);

        assertEquals(Arrays.asList("Playstation 5", "2500.0", "800.0"), produto.obterDadosProduto(funcionario));
    }
}
