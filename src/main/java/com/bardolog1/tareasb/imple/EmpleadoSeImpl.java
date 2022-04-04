package com.bardolog1.tareasb.imple;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bardolog1.tareasb.modelo.Empleado;
import com.bardolog1.tareasb.service.EmpleadoService;
import com.bardolog1.tareasb.repository.EmpleadoRepository;

@Service
public class EmpleadoSeImpl implements EmpleadoService{
	
	@Autowired
	EmpleadoRepository repo;
	
	@Override
	public List<Empleado> listar() {
		return repo.findAll();
	}

	@Override
	public Empleado registrar(Empleado empleado) {
		return repo.save(empleado);
	}

	@Override
	public Empleado actualizar(Empleado empleado) {
		return repo.save(empleado);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
		
	}

	@Override
	public Empleado listarID(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}

}
