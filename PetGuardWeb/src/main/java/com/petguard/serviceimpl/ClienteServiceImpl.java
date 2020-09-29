package com.petguard.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.petguard.daointerface.ICliente;
import com.petguard.entity.Cliente;
import com.petguard.serviceinterface.IClienteService;

@Named
@RequestScoped
public class ClienteServiceImpl implements IClienteService, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ICliente IClDao;

	@Override
	public void insert(Cliente cli) {
		IClDao.insert(cli);
	}

	public List<Cliente> list() {
		return IClDao.list();
	}
	public void update(Cliente cli) {
		IClDao.update(cli);
	}
}
