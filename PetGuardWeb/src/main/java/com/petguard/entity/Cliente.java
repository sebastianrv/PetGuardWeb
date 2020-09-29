package com.petguard.entity;

import javax.persistence.CascadeType;
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
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cliente")
	private Usuario usuario;

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(int CCliente, Usuario usuario) {
		super();
		this.CCliente = CCliente;
		this.usuario = usuario;
	}

	public int getCCliente() {
		return CCliente;
	}

	public void setCCliente(int cCliente) {
		CCliente = cCliente;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}







}
