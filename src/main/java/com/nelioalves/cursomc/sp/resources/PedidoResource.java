package com.nelioalves.cursomc.sp.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.sp.domain.Pedido;
import com.nelioalves.cursomc.sp.services.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService service;

	@GetMapping("/{id}")
	public ResponseEntity<?> getAll(@PathVariable Integer id) {
		Pedido Pedido = service.findById(id);
		return ResponseEntity.ok().body(Pedido);
	}
	
}
