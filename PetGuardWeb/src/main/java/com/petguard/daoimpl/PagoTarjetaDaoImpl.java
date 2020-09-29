package com.petguard.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.petguard.daointerface.IPagoTarjeta;
import com.petguard.entity.PagoTarjeta;

public class PagoTarjetaDaoImpl implements Serializable, IPagoTarjeta {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="PetGuardWeb")
	private EntityManager em;
	
	@Transactional
	public void insert(PagoTarjeta pagot) {
		try {
			em.persist(pagot);
		} catch (Exception e) {
			System.out.println("Error al registrarse");
			// TODO: handle exception
		}
	}
	public List<PagoTarjeta> list(){
		List<PagoTarjeta> listaPa=new ArrayList<PagoTarjeta>();
		try {
			@SuppressWarnings("unused")
			Query q=em.createQuery("from Usuario 1");
		} catch (Exception e) {
			System.out.println("Error al listar");
			// TODO: handle exception
		}
		return listaPa;
	}

}
