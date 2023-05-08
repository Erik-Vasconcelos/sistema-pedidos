package com.nelioalves.cursomc.sp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.sp.domain.Cliente;
import com.nelioalves.cursomc.sp.repositories.ClienteRepository;
import com.nelioalves.cursomc.sp.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	public Cliente findById(Integer id) {
		return repository.findById(id).orElseThrow(
				() -> new ObjectNotFoundException("Objeto não encontrado Id: "+ id + " "+ 
						Cliente.class.getName() )
		);
	}
	
}
