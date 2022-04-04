package com.bardolog1.tareasb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bardolog1.tareasb.service.ITareaService;
import com.bardolog1.tareasb.modelo.*;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping("/tarea")
public class TareaController {
	
	@Autowired
	private ITareaService service;
	
	@GetMapping
	public List<Tarea> lista(){
		return service.listar();
	}
	
	@PostMapping	
	//public ResponseEntity<Void> registrar(@RequestBody Tarea tarea){
	public Tarea agregar (@RequestBody Tarea tarea)	{
		//Tarea obj =service.registrar(tarea);
		//URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdTarea()).toUri();
		//ResponseEntity.created(uri).build();
		return  service.registrar(tarea);
	}
	@PutMapping	
	public ResponseEntity<Tarea> actualizar(@RequestBody Tarea tarea){
		Tarea obj =service.actualizar(tarea);
		return new ResponseEntity<Tarea>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
		Tarea obj = service.listarID(id);
		if(obj==null) {
			throw new Exception("No encontrado");
		}
		service.eliminar(id);
		return new ResponseEntity<Void>( HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Tarea> listarPorId(@PathVariable("id") Integer id) throws Exception{
		Tarea obj = service.listarID(id);
		if(obj==null) {
			throw new Exception("No encontrado");
		}
		return new ResponseEntity<Tarea>(obj, HttpStatus.OK);
	}

}
