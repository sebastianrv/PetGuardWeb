package com.petguard.daointerface;

import java.util.List;
import java.util.Optional;

import com.petguard.entity.Rol;
import com.petguard.entity.Usuario;
import com.petguard.entity.RolUsuario;


public interface IRolDao {
	Integer insert(Rol rol) throws Exception;

	Integer update(Rol rol) throws Exception;

	Integer delete(Rol rol) throws Exception;

	List<Rol> findAll() throws Exception;

	Optional<Rol> findById(Rol rol) throws Exception;

	Integer insertUserRole(List<RolUsuario> userRoles) throws Exception;

	List<RolUsuario> findUserRolesByUser(Usuario usuar) throws Exception;
}
