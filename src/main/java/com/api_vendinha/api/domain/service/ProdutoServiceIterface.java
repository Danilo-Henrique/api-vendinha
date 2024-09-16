package com.api_vendinha.api.domain.service;

import com.api_vendinha.api.domain.dtos.request.ProdutoRequestDto;
import com.api_vendinha.api.domain.dtos.request.UserRequestDto;
import com.api_vendinha.api.domain.dtos.response.ProdutoResponseDto;
import com.api_vendinha.api.domain.dtos.response.UserResponseDto;

public interface ProdutoServiceIterface {

    ProdutoResponseDto save(ProdutoRequestDto produtoRequestDto);

    ProdutoResponseDto update(Long id, ProdutoRequestDto produtoRequestDto);
}
