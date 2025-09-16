package com.itb.inf2am.pizzariaa.controller;

import com.itb.inf2am.pizzariaa.model.entity.Categoria;
import com.itb.inf2am.pizzariaa.model.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {

    @Autowired
    private ProdutoService categoriaService;

    @GetMapping
    public ResponseEntity<List<Categoria>> findAll() {

        return ResponseEntity.ok(categoriaService.findAll());
    }

    // @RequestBody : Corpo da Requisição ( Recebendo um objeto JSON )
    // RespondeEntity: Toda resposta HTTP (status, cabeçalhos e corpo), aqui temos mais controle sobre o que é devolvido para o cliente
    // 1. Status HTTP ( 200 ok, 201 CREATED, 404 NOT FOUND etc...)
    // 2. Headers: ( cabeçalhos extras, como Location, Authorization etc...)
    // 3. Body: ( o objeto que será convertido em JSON/XML para o cliente )

    @PostMapping
    public ResponseEntity<Categoria> save(@RequestBody Categoria categoria) {

        Categoria newProduto = categoriaService.save(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProduto);
    }

}
