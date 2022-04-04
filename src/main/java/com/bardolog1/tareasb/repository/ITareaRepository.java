package com.bardolog1.tareasb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bardolog1.tareasb.modelo.Tarea;

@Repository
public interface ITareaRepository  extends JpaRepository <Tarea, Integer>{

}
