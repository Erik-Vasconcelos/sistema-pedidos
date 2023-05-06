package com.nelioalves.cursomc.sp.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.cursomc.sp.domain.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

	@GetMapping
	public List<Categoria> getAll() {
		return Arrays.asList(new Categoria(1, "Informática"),
				new Categoria(2, "Escritório"));
		
	}
	
}
