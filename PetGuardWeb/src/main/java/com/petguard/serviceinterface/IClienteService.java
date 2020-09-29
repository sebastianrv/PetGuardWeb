package com.petguard.serviceinterface;

import java.util.List;

import com.petguard.entity.Cliente;

public interface IClienteService {
	public void insert(Cliente cli);

	public List<Cliente> list();

	public void update(Cliente cli);
}
