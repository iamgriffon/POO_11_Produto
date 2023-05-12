package Poo11.spring.service;


import java.util.List;

import Poo11.spring.entities.Produto;

public interface ProdutoService{
    
    Produto save(Produto produto);
    Produto findbyid(Integer id);
    List<Produto> findall();
    void delete(Integer id);
    Produto update(Produto produto);
    
}
