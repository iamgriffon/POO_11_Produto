package Poo11.spring;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import Poo11.spring.entities.Produto;
import Poo11.spring.service.ProdutoService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

	@Bean
	public CommandLineRunner runner(ProdutoService produtoService){	
		return args->{
			Produto produto = new Produto("produto x", BigDecimal.valueOf(10), "descritivo", 10);
			Produto savedproduto = produtoService.save(produto);
			System.out.println(produtoService.findbyid(savedproduto.getId())); 
			produtoService.findall().forEach(System.out::println);
			Produto produtoupdate = new Produto(savedproduto.getId(),"produto y", BigDecimal.valueOf(20), "descritivo", 20);
			System.out.println(produtoService.update(produtoupdate));
			produtoService.delete(savedproduto.getId());
		};
	}

}
