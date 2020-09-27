package com.petguard.daointerface;

import java.util.List;

import com.petguard.entity.Mascota;

public interface IMascota {
	public void insert(Mascota mas);
	public List<Mascota>list();
}
