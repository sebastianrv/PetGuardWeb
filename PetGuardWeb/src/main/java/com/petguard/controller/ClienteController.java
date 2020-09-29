package com.petguard.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.petguard.entity.Cliente;
import com.petguard.entity.Usuario;
import com.petguard.serviceinterface.IClienteService;
import com.petguard.serviceinterface.IUsuarioService;

public class ClienteController {
	@Inject
	private IClienteService cS;
	@Inject
	private IUsuarioService uS;

	private Usuario usuario;
	private Cliente cliente;

	List<Usuario> listUsuario;
	List<Cliente> listCliente;

	@PostConstruct
	public void init() {
		this.usuario = new Usuario();
		this.cliente = new Cliente();
		this.listUsuario = new ArrayList<Usuario>();
		this.listCliente = new ArrayList<Cliente>();
		this.list();
		this.listUsuario();
	}

	public String newCliente() {
		this.setCliente(new Cliente());
		listUsuario = uS.list();
		return "Cliente.xhtml";
	}

	public void insert() {
		try {
			cS.insert(cliente);
			this.cleanCliente();
			this.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void list() {
		try {
			listCliente = cS.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void cleanCliente() {
		this.init();

	}

	public void listUsuario() {
		try {
			listUsuario = uS.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String goUpdate(Cliente cl) {
		this.setCliente(cl);
		return "updateCliente.xhtml";
	}
	public void update() {
		try {
			cS.update(this.cliente);
			this.cleanCliente();
			this.list();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public IClienteService getcS() {
		return cS;
	}

	public void setcS(IClienteService cS) {
		this.cS = cS;
	}

	public IUsuarioService getuS() {
		return uS;
	}

	public void setuS(IUsuarioService uS) {
		this.uS = uS;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Usuario> getListUsuario() {
		return listUsuario;
	}

	public void setListUsuario(List<Usuario> listUsuario) {
		this.listUsuario = listUsuario;
	}

	public List<Cliente> getListCliente() {
		return listCliente;
	}

	public void setListCliente(List<Cliente> listCliente) {
		this.listCliente = listCliente;
	}
	
}
