package com.petguard.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

	public Usuario() {
		super();
	}
	public Usuario(int CUsuario, String NNombres, String NApellidos, Integer NTelefono, String TCorreo, Date DFechaNacimiento) {
		super();
		this.CUsuario=CUsuario;
		this.NNombres=NNombres;
		this.NApellidos=NApellidos;
		this.NTelefono=NTelefono;
		this.TCorreo=TCorreo;
		this.DFechaNacimiento=DFechaNacimiento;
	}
	public int getCUsuario() {
		return CUsuario;
	}
	public void setCUsuario(int cUsuario) {
		CUsuario = cUsuario;
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
}
