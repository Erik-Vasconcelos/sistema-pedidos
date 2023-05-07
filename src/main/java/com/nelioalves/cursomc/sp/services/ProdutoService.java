package com.nelioalves.cursomc.sp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.sp.domain.Produto;
import com.nelioalves.cursomc.sp.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repository;
	
	public Produto insert(Produto produto) {
		return repository.save(produto);
	}
	
	public Produto findById(Integer id) {
		return repository.findById(id).orElse(null);
	}
	
}
