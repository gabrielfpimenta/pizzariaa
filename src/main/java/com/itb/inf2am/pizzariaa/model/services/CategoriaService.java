package com.itb.inf2am.pizzariaa.model.services;


import com.itb.inf2am.pizzariaa.model.entity.Categoria;
import com.itb.inf2am.pizzariaa.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired       // Injeção de dependência
    private CategoriaRepository categoriaRepository;

    // Método responsável em listar todos os produtos cadastrados no banco de dados

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();

    }

    // Método responsável em Criar o Produto no banco de dados

    public Categoria save(Categoria categoria) {
        categoria.setCod_status(true);
        return categoriaRepository.save(categoria);
    }
}
