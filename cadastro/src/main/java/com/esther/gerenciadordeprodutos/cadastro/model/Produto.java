package com.esther.gerenciadordeprodutos.cadastro.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private double preco;
    private boolean disponivelParaVenda;

    public Produto() {
    }

    public Produto(Long id, String nome, String descricao, double preco, boolean disponivelParaVenda) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.disponivelParaVenda = disponivelParaVenda;
    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponivelParaVenda() {
        return disponivelParaVenda;
    }

    public void setDisponivelParaVenda(boolean disponivelParaVenda) {
        this.disponivelParaVenda = disponivelParaVenda;
    }
}
