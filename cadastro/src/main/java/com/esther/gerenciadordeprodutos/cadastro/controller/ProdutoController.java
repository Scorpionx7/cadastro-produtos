package com.esther.gerenciadordeprodutos.cadastro.controller;

import org.springframework.ui.Model;
import com.esther.gerenciadordeprodutos.cadastro.model.Produto;
import com.esther.gerenciadordeprodutos.cadastro.repository.ProdutoRepository;
import com.esther.gerenciadordeprodutos.cadastro.service.ProdutoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@Controller
@RequestMapping(value = "/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping("/")
    public String listarProdutos(Model model) {
        List<Produto> produtos = produtoService.listar();
        model.addAttribute("produtos", produtos);
        return "listagem";
    }

    @GetMapping("/cadastro")
    public String exibirFormularioProduto(Model model) {
        model.addAttribute("produto", new Produto());
        return "cadastro";
    }

    @PostMapping("/salvar")
    public String salvarProduto(@ModelAttribute Produto produto) {
        produtoService.salvar(produto);
        return "redirect:/produtos/";
    }

    @DeleteMapping("/excluir/{id}")
    public String excluirProduto(@PathVariable Long id) {
        produtoService.excluirPorId(id);
        return "redirect:/produtos/";
    }


}
