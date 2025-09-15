package com.itb.inf2am.pizzariaa.model.services;


import com.itb.inf2am.pizzariaa.model.entity.Produto;
import com.itb.inf2am.pizzariaa.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired       // Injeção de dependência
    private ProdutoRepository produtoRepository;

    // Método responsável em listar todos os produtos cadastrados no banco de dados

    public List<Produto> findAll() {
        return produtoRepository.findAll();

    }

    // Método responsável em Criar o Produto no banco de dados

    public Produto save(Produto produto) {
        produto.setCod_status(true);
        return produtoRepository.save(produto);
    }
}
