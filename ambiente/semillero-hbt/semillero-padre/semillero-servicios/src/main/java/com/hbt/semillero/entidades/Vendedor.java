package com.hbt.semillero.entidades;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "VENDEDOR")
@Inheritance(strategy = InheritanceType.JOINED)
public class Vendedor extends Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "ID_VENDEDOR")
	private Long idVendedor;

	@Column(name = "FECHA_INGRESO")
	private Calendar fechaIngreso;

	@Override
	public String identificarTipoPersona() {
		return "Soy un vendedor llamado: " + obtenerNombreCompleto();
	}

	public String mostrarFechaIngreso() {
		return fechaIngreso.getTime().toString();
	}

	public Calendar getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Calendar fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
