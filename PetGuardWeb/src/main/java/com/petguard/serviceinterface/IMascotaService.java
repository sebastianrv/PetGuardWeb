package com.petguard.serviceinterface;

import java.util.List;

import com.petguard.entity.Mascota;

public interface IMascotaService {
	public void insert(Mascota mas);
	public List<Mascota>list();
}
