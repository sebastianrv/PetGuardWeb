package com.petguard.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.petguard.daointerface.IUsuario;
import com.petguard.entity.Usuario;

public class UsuarioDaoImpl implements Serializable, IUsuario{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName="PetGuardWeb")
	private EntityManager em;
	
	@Transactional
	public void insert(Usuario usuar) {
		try {
			em.persist(usuar);
		} catch (Exception e) {
			System.out.println("Error al registrarse");
			// TODO: handle exception
		}
	}
	public List<Usuario> list(){
		List<Usuario> listaU=new ArrayList<Usuario>();
		try {
			@SuppressWarnings("unused")
			Query q=em.createQuery("from Usuario 1");
		} catch (Exception e) {
			System.out.println("Error al listar");
			// TODO: handle exception
		}
		return listaU;
	}
	@Override
	public java.util.List<Usuario> List() {
		// TODO Auto-generated method stub
		return null;
	}

}
