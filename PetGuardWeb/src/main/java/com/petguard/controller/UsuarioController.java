package com.petguard.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.petguard.entity.Usuario;
import com.petguard.serviceinterface.IUsuarioService;

@Named
@RequestScoped
public class UsuarioController {
	@Inject
	private IUsuarioService IServiceU;
	private Usuario u;
	List<Usuario> listUsuarios;
	
	@PostConstruct
	public void init() {
		this.listUsuarios=new ArrayList<Usuario>();
		this.u=new Usuario();
		this.list();
	}

	public String newUsuario() {
		this.setU(new Usuario());
		return "usuario.xhtml";
	}
	public void insert() {
		try {
			IServiceU.insert(u);
			cleanUsuario();
			
		} catch (Exception e) {
			e.getMessage();
			// TODO: handle exception
		}
	}
	public void list() {
		try {
			listUsuarios=IServiceU.list();
		} catch (Exception e) {
			e.getMessage();
			// TODO: handle exception
		}
	}
	
	private void cleanUsuario() {
		this.init();
		
	}

	public Usuario getU() {
		return u;
	}
	public void setU(Usuario u) {
		this.u=u;
	}

	public List<Usuario> getListUsuarios() {
		return listUsuarios;
	}

	public void setListUsuarios(List<Usuario> listUsuarios) {
		this.listUsuarios = listUsuarios;
	}
	
}
