package com.hbt.semillero.servicios.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.entidades.Marca;

/**
 * EJB de consultas
 */
@Stateless
public class ConsultasEJB {

	@PersistenceContext
	private EntityManager em;

	/**
	 * Consulta una lista de todas las marcas registradas en el sistema.
	 */
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Marca> consultarMarcasExistentes() {
		return em.createQuery("Select ma from Marca ma").getResultList();
	}
}
