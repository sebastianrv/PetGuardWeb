package com.petguard.serviceinterface;

import java.util.List;
import java.util.Optional;

import com.petguard.entity.Rol;
import com.petguard.entity.Usuario;
import com.petguard.entity.RolUsuario;

public interface IRolService {
	Integer insert(Rol rol) throws Exception;

	Integer update(Rol rol) throws Exception;

	Integer delete(Rol rol) throws Exception;

	List<Rol> getAll() throws Exception;

	Optional<Rol> getOne(Rol rol) throws Exception;

	Integer assignRolesToUser(Usuario usuar, List<Rol> roles) throws Exception;

	List<RolUsuario> findUserRolesByUser(Usuario usuar) throws Exception;

}
