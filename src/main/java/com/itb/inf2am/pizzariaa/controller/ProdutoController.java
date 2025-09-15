package com.itb.inf2am.pizzariaa.controller;


// No spring é comum adicionarmos anotações (annotation) em classes, atributos e métodos
// Uma annotation é uma forma de adicionar informações (metadados) ao seu código que podem
// ser interpretadas pelo compilador ou em tempo de execução por ferramentas e frameworks
// como o Spring
// Uma annotation é uma palavra iniciada com '@' que você coloca acima de uma class, método,
// atributo ou parâmetro, para dar instruções extras ao Java ou a algum framework sobre como
// aquele elemento deve ser tratado.

import com.itb.inf2am.pizzariaa.model.entity.Produto;
import com.itb.inf2am.pizzariaa.model.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity <List<Produto>> findAll() {

        return ResponseEntity.ok(produtoService.findAll());
    }

    // @RequestBody : Corpo da Requisição ( Recebendo um objeto JSON )
    // RespondeEntity: Toda resposta HTTP (status, cabeçalhos e corpo), aqui temos mais controle sobre o que é devolvido para o cliente
    // 1. Status HTTP ( 200 ok, 201 CREATED, 404 NOT FOUND etc...)
    // 2. Headers: ( cabeçalhos extras, como Location, Authorization etc...)
    // 3. Body: ( o objeto que será convertido em JSON/XML para o cliente )

    @PostMapping
    public ResponseEntity<Produto> save(@RequestBody Produto produto) {

        Produto newProduto = produtoService.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProduto);
    }

}
