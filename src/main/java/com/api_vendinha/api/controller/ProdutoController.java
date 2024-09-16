package com.api_vendinha.api.controller;


import com.api_vendinha.api.domain.dtos.request.ProdutoRequestDto;
import com.api_vendinha.api.domain.dtos.response.ProdutoResponseDto;
import com.api_vendinha.api.domain.service.ProdutoServiceIterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private final ProdutoServiceIterface produtoService;

    @Autowired
    public ProdutoController(ProdutoServiceIterface produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ProdutoResponseDto salvar(@RequestBody ProdutoRequestDto produtoRequestDto) {

        return produtoService.save(produtoRequestDto);
    }

    @PutMapping("/{id}")
    public ProdutoResponseDto update(
            @PathVariable Long id,
            @RequestBody ProdutoRequestDto produtoRequestDto
    ){

        return produtoService.update(id, produtoRequestDto);
    }
}


