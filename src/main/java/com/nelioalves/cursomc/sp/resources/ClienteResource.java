package com.nelioalves.cursomc.sp.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.sp.domain.Cliente;
import com.nelioalves.cursomc.sp.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;

	@GetMapping("/{id}")
	public ResponseEntity<?> getAll(@PathVariable Integer id) {
		Cliente Cliente = service.findById(id);
		return ResponseEntity.ok().body(Cliente);
	}
	
}
