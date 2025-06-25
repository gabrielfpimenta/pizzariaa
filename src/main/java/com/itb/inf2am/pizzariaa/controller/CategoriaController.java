package com.itb.inf2am.pizzariaa.controller;

import com.itb.inf2am.pizzariaa.model.entity.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/categoria")
public class CategoriaController {
    List<Categoria> Categorias = new ArrayList<>();

    @GetMapping
    public List<Categoria> findAll() {

        Categoria c1 = new Categoria();
        c1.setNome("Pizzas Doces");
        c1.setDescricao("Pizzas com adição de ingredientes doces, como chocolate, frutas e adoçantes");


        Categoria c2 = new Categoria();
        c2.setNome("Pizzas Salgadas");
        c2.setDescricao("Pizzas com os ingredientes tradicionais salgados, como fermento e sal");

        // Adicionando o Categoria
        Categorias.add(c1);
        Categorias.add(c2);

        return Categorias;
    }

}
