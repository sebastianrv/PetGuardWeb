package com.petguard.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int CUsuario;
	
	@OneToOne(cascade = CascadeType.ALL)
	@MapsId
	@JoinColumn(name="CUsuario",nullable=false)
	private Cliente cliente;
	
	@Column(name = "NNombres", nullable = false, length = 45)
	private String NNombres;
	@Column(name = "NApellidos", nullable = false, length = 45)
	private String NApellidos;
	@Column(name = "NTelefono", nullable = false, length = 10)
	private Integer NTelefono;
	@Column(name = "TCorreo", nullable = false, length = 45)
	private String TCorreo;
	@Column(name = "DFechaNacimiento", nullable = false)
	private Date DFechaNacimiento;
	@Column(name = "username", nullable = false, length = 30)
	private String username; 
	@Column(name = "password", nullable = false)
	private String password;
	@Column(name = "state", nullable = false, length = 1)
	private String state;
	
	public Usuario() {
		super();
	}

	public int getCUsuario() {
		return CUsuario;
	}

	public void setCUsuario(int cUsuario) {
		CUsuario = cUsuario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNNombres() {
		return NNombres;
	}

	public void setNNombres(String nNombres) {
		NNombres = nNombres;
	}

	public String getNApellidos() {
		return NApellidos;
	}

	public void setNApellidos(String nApellidos) {
		NApellidos = nApellidos;
	}

	public Integer getNTelefono() {
		return NTelefono;
	}

	public void setNTelefono(Integer nTelefono) {
		NTelefono = nTelefono;
	}

	public String getTCorreo() {
		return TCorreo;
	}

	public void setTCorreo(String tCorreo) {
		TCorreo = tCorreo;
	}

	public Date getDFechaNacimiento() {
		return DFechaNacimiento;
	}

	public void setDFechaNacimiento(Date dFechaNacimiento) {
		DFechaNacimiento = dFechaNacimiento;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}




}
