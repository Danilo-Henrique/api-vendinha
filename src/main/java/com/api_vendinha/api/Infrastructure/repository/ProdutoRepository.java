package com.api_vendinha.api.Infrastructure.repository;


import com.api_vendinha.api.domain.entities.Produto;
import com.api_vendinha.api.domain.entities.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository {

    Optional<Produto> findByName(String name);

    Optional<Produto> findById(Long id);


    Produto save(Produto produto);

    Produto update(Produto produto);
}
