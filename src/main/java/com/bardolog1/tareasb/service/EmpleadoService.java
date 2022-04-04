package com.bardolog1.tareasb.service;

import java.util.List;

import com.bardolog1.tareasb.modelo.Empleado;

public interface EmpleadoService {

	List<Empleado> listar();
	Empleado registrar (Empleado empleado);
	Empleado actualizar (Empleado empleado);
	void eliminar (Integer codigo);
	Empleado listarID (Integer codigo);
	
}
