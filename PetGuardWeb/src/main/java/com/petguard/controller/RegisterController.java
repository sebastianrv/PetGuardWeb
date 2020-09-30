package com.petguard.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.mindrot.jbcrypt.BCrypt;

import com.petguard.entity.Cliente;
import com.petguard.entity.Rol;
import com.petguard.entity.Usuario;
import com.petguard.serviceinterface.IClienteService;
import com.petguard.serviceinterface.IRolService;

@Named
@ViewScoped
public class RegisterController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IClienteService cS;

	@Inject
	private IRolService rS;

	private Cliente cliente;
	private Usuario usuario;

	@PostConstruct
	public void init() {
		this.cliente = new Cliente();
		this.usuario = new Usuario();
	}

	public String registerUser() {
		String redirect = null;
		try {
			String password = this.usuario.getPassword();
			String passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());
			this.usuario.setPassword(passwordHash);
			this.usuario.setState("A");
			this.cliente.setUsuario(usuario);
			this.usuario.setCliente(cliente);
			this.cS.insert(cliente);

			List<Rol> roles = new ArrayList<Rol>();
			int TIPO_USUARIO = 1;
			Rol r = new Rol();
			r.setId(TIPO_USUARIO);
			roles.add(r);
			rS.assignRolesToUser(usuario, roles);
			redirect = "index?faces-redirect=true";
		} catch (Exception e) {

		}

		return redirect;
	}

	public Cliente getCustomer() {
		return cliente;
	}

	public void setCustomer(Cliente cliente) {
		this.cliente = cliente;
	}

	public Usuario getUser() {
		return usuario;
	}

	public void setUser(Usuario usuario) {
		this.usuario = usuario;
	}

}
