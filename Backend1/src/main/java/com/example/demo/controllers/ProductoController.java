
package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entity.Producto;
import com.example.demo.models.service.ProductoServices;



@RestController
@RequestMapping("/api/evidencia")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT})
public class ProductoController {
	
	
	@Autowired
	ProductoServices productoServices;
	@GetMapping("/{id}")
	public Optional<Producto> buscarPorId(@PathVariable Integer id){
		
		return productoServices.findById(id);
	}

	@GetMapping("/listar")
	public List<Producto> listarTodos(){
		
		return productoServices.findAll();
	}
	
	
	@PostMapping
	public Producto guardar(@RequestBody Producto e) {
	
	return productoServices.save(e);

	}
	
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		
		productoServices.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Producto actualizar (@RequestBody Producto e,@PathVariable Integer id ) {
		
		Producto eEnBD = productoServices.findById(id).get();
		eEnBD.setCodigo(e.getCodigo());
		eEnBD.setNombre(e.getNombre());
		eEnBD.setPrecio(e.getPrecio());
		eEnBD.setCantidad(e.getCantidad());
		
		
		return productoServices.save(eEnBD);
		 
	}
	
}
