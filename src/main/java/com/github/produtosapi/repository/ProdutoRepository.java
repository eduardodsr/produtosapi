package com.github.produtosapi.repository;

import com.github.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// repository = Requisicoes ao Banco de Dados (h2 console)

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNome(String nome);
}
