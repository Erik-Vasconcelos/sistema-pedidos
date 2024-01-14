package com.nelioalves.cursomc.sp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.sp.domain.Categoria;
import com.nelioalves.cursomc.sp.repositories.CategoriaRepository;
import com.nelioalves.cursomc.sp.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public Categoria findById(Integer id) {
		return repository.findById(id).orElseThrow(
				() -> new ObjectNotFoundException("Objeto não encontrado Id: "+ id + " "+ 
						Categoria.class.getName() )
		);
	}
	
	public Categoria insert(Categoria categoria) {
		return repository.save(categoria);
	}
	
}
