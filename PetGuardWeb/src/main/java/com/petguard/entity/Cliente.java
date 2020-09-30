package com.petguard.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CCliente;
	
	@Column(name = "CUsuario", nullable = false)
	private int CUsuario;
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cliente")
	private Usuario usuario;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int CCliente, int CUsuario, Usuario usuario) {
		super();
		this.CCliente = CCliente;
		this.CUsuario = CUsuario;
		this.usuario = usuario;
	}

	public int getCCliente() {
		return CCliente;
	}

	public void setCCliente(int cCliente) {
		CCliente = cCliente;
	}

	public int getCUsuario() {
		return CUsuario;
	}

	public void setCUsuario(int cUsuario) {
		CUsuario = cUsuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	






}
