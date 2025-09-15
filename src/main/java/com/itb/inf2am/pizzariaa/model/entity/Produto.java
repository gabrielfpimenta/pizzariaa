package com.itb.inf2am.pizzariaa.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Produto") // facultativo quando o nome da tabela for igual ao nome da classe

public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-Incremento, ou seja, incremento de 1 em 1
    private Long id;
    @Column(length = 45, nullable = false)
    private String nome;
    @Column(length = 45, nullable = true)
    private String tipo;
    @Column(length = 255, nullable = true)
    private String descricao;
    @Column(columnDefinition = "DECIMAL(5,2))", nullable = true)
    private Double valor_compra;
    @Column(columnDefinition = "DECIMAL(5,2))", nullable = true)
    private Double valor_venda;
    @Column(nullable = true)
    private int quantidade_estoque;
    private boolean cod_status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(Double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public Double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(Double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public int getQuantidade_estoque() {
        return quantidade_estoque;
    }

    public void setQuantidade_estoque(int quantidade_estoque) {
        this.quantidade_estoque = quantidade_estoque;
    }

    public boolean isCod_status() {
        return cod_status;
    }

    public void setCod_status(boolean cod_status) {
        this.cod_status = cod_status;
    }
}
