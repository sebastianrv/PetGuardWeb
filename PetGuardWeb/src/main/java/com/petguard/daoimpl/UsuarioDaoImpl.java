package com.petguard.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
	public Integer update(Usuario usuar) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Integer delete(Usuario usuar) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Usuario> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Usuario> findById(Usuario usuar) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getPassworHashedByUserName(String NNombres) throws Exception {
		Usuario usuar = new Usuario();

		try {

			Query query = em.createQuery("FROM Usuario u WHERE u.NNombres = ?1");
			query.setParameter(1, NNombres);
			@SuppressWarnings("unchecked")
			List<Usuario> lista = query.getResultList();
			if (!lista.isEmpty()) {
				usuar = lista.get(0);
			}
		} catch (Exception e) {
			throw e;
		}

		return usuar != null ? usuar.getPassword() : "";
	}
	@Override
	public Optional<Usuario> findUserByUsername(Usuario usuar) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}
