package com.esther.gerenciadordeprodutos.cadastro.service;

import com.esther.gerenciadordeprodutos.cadastro.model.Produto;
import com.esther.gerenciadordeprodutos.cadastro.repository.ProdutoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listar(){
        return produtoRepository.findAll(Sort.by("preco"));
    }

    public Produto salvar(Produto produto){
        return produtoRepository.save(produto);
    }
    public void excluir(Produto produto){
        produtoRepository.delete(produto);
    }
    public void excluirPorId(Long id) {
        produtoRepository.deleteById(id);
    }

}
