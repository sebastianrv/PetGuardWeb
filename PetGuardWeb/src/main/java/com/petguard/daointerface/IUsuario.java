package com.petguard.daointerface;

import java.util.List;
import java.util.Optional;

import com.petguard.entity.Usuario;

public interface IUsuario {
	public void insert(Usuario usuar);

	public List<Usuario> list();

	Integer update(Usuario usuar) throws Exception;

	Integer delete(Usuario usuar) throws Exception;

	List<Usuario> findAll() throws Exception;

	Optional<Usuario> findById(Usuario usuar) throws Exception;

	String getPassworHashedByUserName(String NNombres) throws Exception;

	Optional<Usuario> findUserByUsername(Usuario usuar) throws Exception;
}
