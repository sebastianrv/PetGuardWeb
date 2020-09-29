package com.petguard.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.petguard.entity.Cliente;

public class ClienteDaoImpl {
	@PersistenceContext(unitName="PetGuardWeb")
	private EntityManager em;
	
	@Transactional
	public void insert(Cliente cli) {
		try {
			em.persist(cli);
		} catch (Exception e) {
			System.out.println("Error al insertar cliente");
			// TODO: handle exception
		}
	}
	public void update(Cliente cli) {
		try {
			em.merge(cli);
		} catch (Exception e) {
			System.out.println("Error al actualizar clientes");
			// TODO: handle exception
		}
	}
}
