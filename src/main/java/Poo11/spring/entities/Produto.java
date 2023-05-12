package Poo11.spring.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name="produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private BigDecimal preco;
    private String descritivo;
    private Integer quantidade;

    public Produto(String titulo, BigDecimal preco, String descritivo, Integer quantidade){
        this.titulo = titulo;
        this.preco = preco;
        this.descritivo = descritivo;
        this.quantidade = quantidade;

    }
    public Produto(Integer id, String titulo, BigDecimal preco, String descritivo, Integer quantidade){
        this.id = id;
        this.titulo = titulo;
        this.preco = preco;
        this.descritivo = descritivo;
        this.quantidade = quantidade;

    }

}
