package com.petguard.controller;

import java.io.Serializable;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.petguard.entity.Usuario;
import com.petguard.serviceimpl.UsuarioServiceImpl;

@Named
@ViewScoped
public class LoginController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private UsuarioServiceImpl uS;

	private Usuario usuario;

	@PostConstruct
	public void init() {
		this.usuario = new Usuario();
	}

	public String authentication() {
		String redirect = null;

		try {
			Optional<Usuario> userFound = this.uS.authentication(usuario);

			if (userFound.isPresent() && userFound.get().getState().equalsIgnoreCase("A")) {
				// Almacenar en la sesi�n de JSF
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("user", userFound.get());
				redirect = "/panel?faces-redirect=true";
			} else {
				FacesContext.getCurrentInstance().addMessage(null,
						new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales incorrectas"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return redirect;
	}

	public Usuario getUser() {
		return usuario;
	}

	public void setUser(Usuario usuario) {
		this.usuario = usuario;
	}

}
