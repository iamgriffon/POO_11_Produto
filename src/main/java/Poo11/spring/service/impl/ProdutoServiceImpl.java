package Poo11.spring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import Poo11.spring.entities.Produto;
import Poo11.spring.repositories.ProdutoRepository;
import Poo11.spring.service.ProdutoService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProdutoServiceImpl implements ProdutoService{
    private final ProdutoRepository produtorepository;

    @Override
    public Produto save(Produto produto) {
        return produtorepository.save(produto);
    }

    @Override
    public Produto findbyid(Integer id) {
       return produtorepository.findById(id).orElseThrow(()-> new RuntimeException("Not Found"));
    }

    @Override
    public List<Produto> findall() {
        return produtorepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        Produto prod = produtorepository.findById(id).orElseThrow(()-> new RuntimeException("Not found"));
        produtorepository.delete(prod);
    }

    @Override
    public Produto update(Produto produto) {
        Produto prod = produtorepository.findById(produto.getId()).orElseThrow(()-> new RuntimeException("Not found"));
        prod.setPreco(produto.getPreco());
        prod.setDescritivo(produto.getDescritivo());
        prod.setQuantidade(produto.getQuantidade());
        prod.setTitulo(produto.getTitulo());
        return produtorepository.save(prod);
    }
    
}
