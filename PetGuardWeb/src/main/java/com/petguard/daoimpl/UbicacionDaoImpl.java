package com.petguard.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.petguard.daointerface.IUbicacion;
import com.petguard.entity.Ubicacion;

public class UbicacionDaoImpl implements Serializable, IUbicacion{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="PetGuardWeb")
	private EntityManager em;
	
	@Transactional
	public void insert(Ubicacion ubic) {
		try {
			em.persist(ubic);
		} catch (Exception e) {
			System.out.println("Error al registrarse");
			// TODO: handle exception
		}
	}
	public List<Ubicacion>list(){
		List<Ubicacion> listaUb=new ArrayList<Ubicacion>();
		try {
			@SuppressWarnings("unused")
			Query q=em.createQuery("from Usuario 1");
		} catch (Exception e) {
			System.out.println("Error al listar");
			// TODO: handle exception
		}
		return listaUb;
	}


}
