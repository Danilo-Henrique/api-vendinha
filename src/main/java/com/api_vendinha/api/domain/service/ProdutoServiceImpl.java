package com.api_vendinha.api.domain.service;

import com.api_vendinha.api.Infrastructure.repository.ProdutoRepository;
import com.api_vendinha.api.domain.dtos.request.ProdutoRequestDto;
import com.api_vendinha.api.domain.dtos.response.ProdutoResponseDto;
import com.api_vendinha.api.domain.dtos.response.UserResponseDto;
import com.api_vendinha.api.domain.entities.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoServiceIterface {

    private final ProdutoRepository produtoRepository;


    @Autowired
    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }


    @Override
    public ProdutoResponseDto save(ProdutoRequestDto produtoRequestDto) {
        Produto produto = new Produto();

        produto.setName(produtoRequestDto.getName());
        produto.setPreço(produtoRequestDto.getPreço());
        produto.setQuantidade(produtoRequestDto.getQuantidade());

        Produto savedProduto = produtoRepository.save(produto);

        return new ProdutoResponseDto();
    }

    @Override
    public ProdutoResponseDto update(Long id, ProdutoRequestDto produtoRequestDto) {
        Produto produtoExist = produtoRepository.findById(id).orElseThrow();
        produtoExist.setName(produtoRequestDto.getName());
        produtoExist.setPreço(produtoRequestDto.getPreço());
        produtoExist.setQuantidade(produtoRequestDto.getQuantidade());

        produtoRepository.save(produtoExist);
        ProdutoResponseDto produtoResponseDto = new ProdutoResponseDto();

        produtoResponseDto.setId(produtoExist.getId());
        produtoResponseDto.setName(produtoExist.getName());
        produtoResponseDto.setPreço(produtoExist.getPreço());
        produtoResponseDto.setQuantidade(produtoExist.getQuantidade());

        return produtoResponseDto;




    }

}
