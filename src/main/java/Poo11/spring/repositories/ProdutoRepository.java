package Poo11.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Poo11.spring.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    

}
