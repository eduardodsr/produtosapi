package com.github.produtosapi.repository;

import com.github.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

// repository = Classes requisicoes Banco de Dados (h2 console)

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
