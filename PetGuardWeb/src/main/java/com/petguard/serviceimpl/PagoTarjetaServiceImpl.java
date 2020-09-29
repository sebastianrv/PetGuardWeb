package com.petguard.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import com.petguard.daointerface.IPagoTarjeta;
import com.petguard.entity.PagoTarjeta;
import com.petguard.serviceinterface.IPagoTarjetaService;

public class PagoTarjetaServiceImpl implements IPagoTarjetaService, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IPagoTarjeta IPtDao;
	
	@Override
	public void insert(PagoTarjeta pagot) {
		IPtDao.insert(pagot);
	}

	@Override
	public List<PagoTarjeta> list() {
		// TODO Auto-generated method stub
		return IPtDao.list();
	}

}
