package com.petguard.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.petguard.entity.Mascota;

public class MascotaDaoImpl implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="PetGuardWeb")
	private EntityManager em;
	
	@Transactional
	public void insert(Mascota mas) {
		try {
			em.persist(mas);
		} catch (Exception e) {
		System.out.println("Error al registrarse");	
			// TODO: handle exception
		}
	}
	public List<Mascota>list(){
		List<Mascota>listaM=new ArrayList<Mascota>();
		try {
			@SuppressWarnings("unused")
			Query q=em.createQuery("from Mascota 1");
		} catch (Exception e) {
			System.out.println("Error al listar");			
			// TODO: handle exception
		}
		return listaM;
	
	}
}
