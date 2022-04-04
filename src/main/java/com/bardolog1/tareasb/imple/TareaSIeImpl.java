package com.bardolog1.tareasb.imple;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bardolog1.tareasb.modelo.Tarea;
import com.bardolog1.tareasb.repository.ITareaRepository;
import com.bardolog1.tareasb.service.ITareaService;

@Service
public class TareaSIeImpl implements ITareaService {

	@Autowired
	ITareaRepository repo;
	
	@Override
	public List<Tarea> listar() {
		return repo.findAll();
	}

	@Override
	public Tarea registrar(Tarea tarea) {
		
		long miliseconds = System.currentTimeMillis();
	    Date date = new Date(miliseconds);
		final long MILLSECS_PER_DAY = 24 * 60 * 60 * 1000;
		java.util.Date hoy = new java.util.Date();
		tarea.setFechaIni(date);
		Date fechaIn =tarea.getFechaIni();
		int dia = (int) +((fechaIn.getTime() - hoy.getTime())/MILLSECS_PER_DAY);
		tarea.setDiasPen(dia);
		
		
		return repo.save(tarea);
	}

	@Override
	public Tarea actualizar(Tarea tarea) {
		return repo.save(tarea);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
		
	}

	@Override
	public Tarea listarID(Integer codigo) {
		return repo.findById(codigo).orElse(null);
	}

}
