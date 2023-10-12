package com.dcc.ufjf;

import java.util.HashMap;
import java.util.Map;

public class BD {
    private static Map<Integer, Produto> produtos = new HashMap<>();

    public static Produto getProduto(Integer numeroIdentificador) {
        return produtos.get(numeroIdentificador);
    }

    public static void addProduto(Produto produto) {
        produtos.put(produto.getNumeroIdentificador(), produto);
    }
}
