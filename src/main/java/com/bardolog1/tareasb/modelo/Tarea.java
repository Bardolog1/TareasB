package com.bardolog1.tareasb.modelo;

import java.sql.Date;


import javax.persistence.*;

@Entity
@Table(name="tareas")

public class Tarea {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTarea;
	 
	@Column(name="finicio")
	private Date fechaIni;
	
	
	@Column(name="descripcion", length =200, nullable=false)
	private String descrip;
	
	@Column(name="tiempoej")
	private int tiempoEj;
	
	@Column(name="status", length = 30, nullable=false)
	private String status;
	
	@Column(name="diaspend")
	private int diasPen;
	
	@ManyToOne
	@JoinColumn(name="idPersona")
	private Empleado asignado;
	
	@Column(name="ffinal")
	private Date fechaFin;
	
	
	public int getIdTarea() {
		return idTarea;
	}

	public void setIdTarea(int idTarea) {
		this.idTarea = idTarea;
	}

	public Date getFechaIni() {
		return this.fechaIni;
	}

	public void setFechaIni(Date fechaIni) {
		this.fechaIni = fechaIni;
	}

	public String getDescrip() {
		return descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public int getTiempoEj() {
		return tiempoEj;
	}

	public void setTiempoEj(int tiempoEj) {
		this.tiempoEj = tiempoEj;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getDiasPen() {
		return diasPen;
	}

	public void setDiasPen(int diasPen) {
		this.diasPen=diasPen;
	}

	public Empleado getAsignado() {
		return asignado;
	}

	public void setAsignado(Empleado asignado) {
		this.asignado = asignado;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	
	
	
	

}
