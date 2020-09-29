package com.petguard.daointerface;

import java.util.List;

import com.petguard.entity.Ubicacion;

public interface IUbicacion {

	public void insert(Ubicacion ubic);
	public List<Ubicacion>list();
}
