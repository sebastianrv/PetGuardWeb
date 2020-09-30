package com.petguard.serviceimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import com.petguard.daointerface.IRolDao;
import com.petguard.entity.Rol;
import com.petguard.entity.Usuario;
import com.petguard.entity.RolUsuario;
import com.petguard.serviceinterface.IRolService;

@Named
public class RolServiceImpl implements IRolService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IRolDao rD;

	@Transactional
	@Override
	public Integer insert(Rol t) throws Exception {
		return rD.insert(t);
	}

	@Transactional
	@Override
	public Integer update(Rol t) throws Exception {
		return rD.update(t);
	}

	@Transactional
	@Override
	public Integer delete(Rol t) throws Exception {
		return rD.delete(t);
	}

	@Override
	public List<Rol> getAll() throws Exception {
		return rD.findAll();
	}

	@Override
	public Optional<Rol> getOne(Rol t) throws Exception {
		return rD.findById(t);
	}

	@Transactional
	@Override
	public Integer assignRolesToUser(Usuario usuar, List<Rol> roles) throws Exception {
		List<RolUsuario> userRoles = new ArrayList<>();

		roles.forEach(rol -> {
			RolUsuario userRol = new RolUsuario();
			userRol.setUsuario(usuar);
			userRol.setRol(rol);
			userRoles.add(userRol);
		});

		rD.insertUserRole(userRoles);

		return 1;
	}

	@Override
	public List<RolUsuario> findUserRolesByUser(Usuario usuar) throws Exception {
		return rD.findUserRolesByUser(usuar);
	}

}
