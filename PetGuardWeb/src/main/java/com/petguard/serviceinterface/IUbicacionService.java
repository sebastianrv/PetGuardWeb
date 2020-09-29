package com.petguard.serviceinterface;

import java.util.List;

import com.petguard.entity.Ubicacion;

public interface IUbicacionService {
	public void insert(Ubicacion ubic);
	public List<Ubicacion>list();
}
