package com.petguard.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.petguard.entity.Mascota;
import com.petguard.serviceinterface.IMascotaService;

@Named
@RequestScoped
public class MascotaController {
	@Inject
	private IMascotaService IServiceM;
	private Mascota m;
	List<Mascota> listMascotas;
	
	@PostConstruct
	public void init() {
		this.listMascotas=new ArrayList<Mascota>();
		this.m=new Mascota();
		this.list();
	}
	public String newMascota() {
		this.setM(new Mascota());
		return "usuario.xhtml";
	}
	public void insert() {
		try {
			IServiceM.insert(m);
			cleanMascota();
			this.list();
		} catch (Exception e) {
			e.getMessage();
			// TODO: handle exception
		}
	}
	public void list() {
	try {
		listMascotas=IServiceM.list();
	} catch (Exception e) {
		e.getMessage();
	}
	}
	private void cleanMascota() {
		this.init();
		// TODO Auto-generated method stub
		
	}
	public Mascota getM() {
		return m;
	}
	public void setM(Mascota m) {
		this.m = m;
	}
	public List<Mascota> getListMascotas() {
		return listMascotas;
	}
	public void setListMascotas(List<Mascota> listMascotas) {
		this.listMascotas = listMascotas;
	}
	
}
