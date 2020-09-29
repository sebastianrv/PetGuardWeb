package com.petguard.daointerface;

import java.util.List;

import com.petguard.entity.PagoTarjeta;

public interface IPagoTarjeta {

	public void insert(PagoTarjeta pagot);
	public List<PagoTarjeta>list();
}
