package com.hbt.semillero.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "PERSONA")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_PERSONA")
	private Long idPersona;

	@Column(name = "NUM_ID")
	private String numeroIdentificacion;

	@Column(name = "TIPO_ID")
	private String tipoIdentificacion;

	@Column(name = "NUM_TEL")
	private String numeroTelefonico;

	@Column(name = "NOMBRES")
	private String nombres;

	@Column(name = "APELLIDOS")
	private String apellidos;

	@Column(name = "EDAD")
	private int edad;

	public abstract String identificarTipoPersona();

	/**
	 * Obtiene el nombre completo de la persona.
	 * 
	 * @return
	 */
	protected String obtenerNombreCompleto() {
		return getNombres() + " " + getApellidos();
	}

	/*
	 * M�todos de acceso y modificadores de atributos
	 */

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
