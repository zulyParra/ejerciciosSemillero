package com.hbt.semillero.entidades;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Concepto de Herencia
 *
 */
@Entity
@Table(name="COMPRADOR")
@Inheritance(strategy = InheritanceType.JOINED)
public class Comprador extends Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="ID_COMPRADOR")
	private Long idComprador;
	
	@Column(name="FECHA_AFILIACION")
	private Calendar fechaAfiliacion;


	@Override
	public String identificarTipoPersona() {
		return "Soy un comprador llamado: " + obtenerNombreCompleto();
	}

	public String mostrarFechaIngreso() {
		return fechaAfiliacion.getTime().toString();
	}

	public Calendar getFechaAfiliacion() {
		return fechaAfiliacion;
	}

	public void setFechaAfiliacion(Calendar fechaAfiliacion) {
		this.fechaAfiliacion = fechaAfiliacion;
	}

}
