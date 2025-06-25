package com.itb.inf2am.pizzariaa.controller;


// No spring é comum adicionarmos anotações (annotation) em classes, atributos e métodos
// Uma annotation é uma forma de adicionar informações (metadados) ao seu código que podem
// ser interpretadas pelo compilador ou em tempo de execução por ferramentas e frameworks
// como o Spring
// Uma annotation é uma palavra iniciada com '@' que você coloca acima de uma class, método,
// atributo ou parâmetro, para dar instruções extras ao Java ou a algum framework sobre como
// aquele elemento deve ser tratado.

import com.itb.inf2am.pizzariaa.model.entity.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoController {
    List<Produto> produtos = new ArrayList<>();

    @GetMapping
    public List<Produto> findAll() {

        Produto p1 = new Produto();
        p1.setNome("Pizza de Calabreso");
        p1.setDescricao("Pizza com muito calabreso acebolado");
        p1.setValor_venda(49.50);

        Produto p2 = new Produto();
        p2.setNome("Pizza de Muçarela");
        p2.setDescricao("Pizza com muito queijo muçarela");
        p2.setValor_venda(46.50);

        // Adicionando o produto
        produtos.add(p1);
        produtos.add(p2);

        return produtos;
    }

}
