package com.petguard.daointerface;

import java.util.List;

import com.petguard.entity.Cliente;

public interface ICliente {

	public void insert(Cliente cli);
	public List<Cliente>list();
	public void update(Cliente cli);
}
