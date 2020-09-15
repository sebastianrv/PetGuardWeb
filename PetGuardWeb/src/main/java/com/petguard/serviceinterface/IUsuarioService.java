package com.petguard.serviceinterface;

import java.util.List;

import com.petguard.entity.Usuario;

public interface IUsuarioService {
	public void insert(Usuario usuar);
	public List<Usuario>list();
}
