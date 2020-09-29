package com.petguard.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PagoTarjeta")
public class PagoTarjeta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int CTarjeta;
	@Column(name = "NNumeroTarjeta", nullable = false, length = 45)
	private int NNumeroTarjeta;
	@Column(name = "NFechaVencimiento", nullable = false, length = 45)
	private int NFechaVencimiento;
	@Column(name = "NCodigoCV", nullable = false, length = 45)
	private int NCodigoCV;
	public PagoTarjeta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PagoTarjeta(int CTarjeta, int NNumeroTarjeta, int NFechaVencimiento, int NCodigoCV) {
		super();
		this.CTarjeta = CTarjeta;
		this.NNumeroTarjeta = NNumeroTarjeta;
		this.NFechaVencimiento = NFechaVencimiento;
		this.NCodigoCV = NCodigoCV;
	}
	public int getCTarjeta() {
		return CTarjeta;
	}
	public void setCTarjeta(int cTarjeta) {
		CTarjeta = cTarjeta;
	}
	public int getNNumeroTarjeta() {
		return NNumeroTarjeta;
	}
	public void setNNumeroTarjeta(int nNumeroTarjeta) {
		NNumeroTarjeta = nNumeroTarjeta;
	}
	public int getNFechaVencimiento() {
		return NFechaVencimiento;
	}
	public void setNFechaVencimiento(int nFechaVencimiento) {
		NFechaVencimiento = nFechaVencimiento;
	}
	public int getNCodigoCV() {
		return NCodigoCV;
	}
	public void setNCodigoCV(int nCodigoCV) {
		NCodigoCV = nCodigoCV;
	}
	
	
}
