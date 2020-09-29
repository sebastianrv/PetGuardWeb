package com.petguard.serviceinterface;

import java.util.List;

import com.petguard.entity.PagoTarjeta;

public interface IPagoTarjetaService {

	public void insert(PagoTarjeta pagot);
	public List<PagoTarjeta>list();
}
