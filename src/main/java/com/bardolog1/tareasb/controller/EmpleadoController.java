package com.bardolog1.tareasb.controller;

import java.util.List;
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
import com.bardolog1.tareasb.modelo.Empleado;
import com.bardolog1.tareasb.service.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
	@Autowired
	EmpleadoService service;
	
	@GetMapping
	public ResponseEntity <List<Empleado>> lista(){
		List<Empleado> obj =service.listar();
		return new ResponseEntity <List<Empleado>>(obj, HttpStatus.OK);
	}

	@PostMapping	
	public ResponseEntity<Empleado> registrar(@RequestBody Empleado empleado){
		Empleado obj =service.registrar(empleado);
		return new ResponseEntity<Empleado>(obj, HttpStatus.OK);
	}
	@PutMapping	
	public ResponseEntity<Empleado> actualizar(@RequestBody Empleado empleado){
		Empleado obj =service.actualizar(empleado);
		return new ResponseEntity<Empleado>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
		Empleado obj = service.listarID(id);
		if(obj==null) {
			throw new Exception("No encontrado");
		}
		service.eliminar(id);
		return new ResponseEntity<Void>( HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Empleado> listarPorId(@PathVariable("id") Integer id) throws Exception{
		Empleado obj = service.listarID(id);
		if(obj==null) {
			throw new Exception("No encontrado");
		}
		return new ResponseEntity<Empleado>(obj, HttpStatus.OK);
	}


}
