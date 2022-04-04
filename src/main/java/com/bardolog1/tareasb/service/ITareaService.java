package com.bardolog1.tareasb.service;

import java.util.List;
import com.bardolog1.tareasb.modelo.*;

public interface ITareaService {

	
	List<Tarea> listar();
	Tarea registrar (Tarea tarea);
	Tarea actualizar (Tarea tarea);
	void eliminar (Integer codigo);
	Tarea listarID (Integer codigo);
}
