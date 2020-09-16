package com.petguard.serviceimpl;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.petguard.daointerface.IUsuario;
import com.petguard.entity.Usuario;
import com.petguard.serviceinterface.IUsuarioService;
@Named
@RequestScoped
public class UsuarioServiceImpl implements IUsuarioService,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IUsuario IUDao;
	@Override
	public void insert(Usuario usuar) {
		IUDao.insert(usuar);
		// TODO Auto-generated method stub
		
	}

	@Override
	public java.util.List<Usuario> list() {
		// TODO Auto-generated method stub
		return IUDao.List();
	}

}
