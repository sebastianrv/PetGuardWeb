package com.petguard.daoimpl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.petguard.daointerface.ICliente;
import com.petguard.entity.Cliente;

public class ClienteDaoImpl implements ICliente, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	@Override
	public List<Cliente> list() {
		// TODO Auto-generated method stub
		return null;
	}
}
