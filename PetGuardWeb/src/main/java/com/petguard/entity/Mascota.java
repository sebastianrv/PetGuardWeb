package com.petguard.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Mascota")
public class Mascota implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CMascota;
	@Column(name="NNombre",nullable=false, length = 20)
	private String NNombre;
	@Column(name="NRaza",nullable=false, length = 20)
	private String NRaza;
	@Column(name="NEdad",nullable=false)
	private int NEdad;
	@Column(name="NTamaño",nullable=false)
	private String TTamaño;
	@Column(name="NSexo",nullable=false)
	private String NSexo;
	public Mascota() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mascota(int cMascota, String nNombre, String nRaza, int nEdad, String tTamaño, String nSexo, int CMascota, String NNombre, String NRaza, int NEdad, String TTamaño, String NSexo) {
		super();
		this.CMascota = CMascota;
		this.NNombre = NNombre;
		this.NRaza = NRaza;
		this.NEdad = NEdad;
		this.TTamaño = TTamaño;
		this.NSexo = NSexo;
	}
	public int getCMascota() {
		return CMascota;
	}
	public void setCMascota(int cMascota) {
		CMascota = cMascota;
	}
	public String getNNombre() {
		return NNombre;
	}
	public void setNNombre(String nNombre) {
		NNombre = nNombre;
	}
	public String getNRaza() {
		return NRaza;
	}
	public void setNRaza(String nRaza) {
		NRaza = nRaza;
	}
	public int getNEdad() {
		return NEdad;
	}
	public void setNEdad(int nEdad) {
		NEdad = nEdad;
	}
	public String getTTamaño() {
		return TTamaño;
	}
	public void setTTamaño(String tTamaño) {
		TTamaño = tTamaño;
	}
	public String getNSexo() {
		return NSexo;
	}
	public void setNSexo(String nSexo) {
		NSexo = nSexo;
	}


}
