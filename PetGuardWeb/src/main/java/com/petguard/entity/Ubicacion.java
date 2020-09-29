package com.petguard.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Ubicacion")
public class Ubicacion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int CUbicacion;
	@Column(name="Departamento",nullable=false)
	private String Departamento;
	@Column(name="Provincia",nullable=false)
	private String Provincia;
	@Column(name="Distrito",nullable=false)
	private String Distrito;
	@Column(name="Direccion",nullable=false)
	private String Direccion;
	public Ubicacion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ubicacion(int CUbicacion, String Departamento, String Provincia, String Distrito, String Direccion) {
		super();
		this.CUbicacion = CUbicacion;
		this.Departamento = Departamento;
		this.Provincia = Provincia;
		this.Distrito = Distrito;
		this.Direccion = Direccion;
	}
	public int getCUbicacion() {
		return CUbicacion;
	}
	public void setCUbicacion(int cUbicacion) {
		CUbicacion = cUbicacion;
	}
	public String getDepartamento() {
		return Departamento;
	}
	public void setDepartamento(String departamento) {
		Departamento = departamento;
	}
	public String getProvincia() {
		return Provincia;
	}
	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	public String getDistrito() {
		return Distrito;
	}
	public void setDistrito(String distrito) {
		Distrito = distrito;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	
}
