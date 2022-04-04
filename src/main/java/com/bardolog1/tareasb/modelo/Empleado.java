package com.bardolog1.tareasb.modelo;

import javax.persistence.*;

@Entity
@Table(name="empleado")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idPer;
	
	@Column(name="nombre", length = 45, nullable=false)
	private String nomPer;
	
	@Column(name="apellido", length = 45, nullable=false)
	private String apllPer;
	

	
	public Integer getIdPer() {
		return idPer;
	}

	public void setIdPer(Integer idPer) {
		this.idPer = idPer;
	}

	public String getNomPer() {
		return nomPer;
	}

	public void setNomPer(String nomPer) {
		this.nomPer = nomPer;
	}

	public String getApllPer() {
		return apllPer;
	}

	public void setApllPer(String apllPer) {
		this.apllPer = apllPer;
	}


	

}
