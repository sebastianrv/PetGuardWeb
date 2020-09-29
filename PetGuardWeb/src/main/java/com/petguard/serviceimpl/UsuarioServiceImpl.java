package com.petguard.serviceimpl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.mindrot.jbcrypt.BCrypt;

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
		return IUDao.list();
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
	public List<Usuario> getAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> getOne(Usuario usuar) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> authentication(Usuario usuar) throws Exception {
		String password = usuar.getPassword();

		String passwordHash = IUDao.getPassworHashedByUserName(usuar.getUsername());

		if (BCrypt.checkpw(password, passwordHash)) {
			usuar.setPassword(passwordHash);
			return IUDao.findUserByUsername(usuar);
		}

		return Optional.of(new Usuario());
	}

}
