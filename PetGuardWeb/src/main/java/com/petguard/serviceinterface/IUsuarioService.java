package com.petguard.serviceinterface;

import java.util.List;
import java.util.Optional;

import com.petguard.entity.Usuario;

public interface IUsuarioService {
	public void insert(Usuario usuar);

	public List<Usuario> list();

	Integer update(Usuario usuar) throws Exception;

	Integer delete(Usuario usuar) throws Exception;

	List<Usuario> getAll() throws Exception;

	Optional<Usuario> getOne(Usuario usuar) throws Exception;

	Optional<Usuario> authentication(Usuario usuar) throws Exception;
}
