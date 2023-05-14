package com.nelioalves.cursomc.sp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.sp.domain.Pedido;
import com.nelioalves.cursomc.sp.repositories.PedidoRepository;
import com.nelioalves.cursomc.sp.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repository;
	
	public Pedido findById(Integer id) {
		return repository.findById(id).orElseThrow(
				() -> new ObjectNotFoundException("Objeto não encontrado Id: "+ id + " "+ 
						Pedido.class.getName() )
		);
	}
	
}
