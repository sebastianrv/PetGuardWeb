package com.petguard.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.petguard.entity.Ubicacion;
import com.petguard.serviceinterface.IUbicacionService;

@Named
@RequestScoped
public class UbicacionController {

	@Inject
	private IUbicacionService IServiceUbic;
	private Ubicacion ubic;
	List<Ubicacion> listUbicacion;
	
	@PostConstruct
	public void init() {
		this.listUbicacion=new ArrayList<Ubicacion>();
	}
	public String newUbicacion() {
		this.setUbic(new Ubicacion());
		return "index.xhtml";
	}
	public void insert() {
		try {
			IServiceUbic.insert(ubic);
			cleanUbicacion();
			this.list();
		} catch (Exception e) {
			e.getMessage();
			// TODO: handle exception
		}
	}
	public void list() {
		try {
			listUbicacion=IServiceUbic.list();
		} catch (Exception e) {
			e.getMessage();
			// TODO: handle exception
		}
	}
	public void cleanUbicacion() {
		this.init();
	}
	public Ubicacion getUbic() {
		return ubic;
	}
	public void setUbic(Ubicacion ubic) {
		this.ubic=ubic;
	}
	public List<Ubicacion> getListUbicacion() {
		return listUbicacion;
	}
	public void setListUbicacion(List<Ubicacion> listUbicacion) {
		this.listUbicacion = listUbicacion;
	}

}
