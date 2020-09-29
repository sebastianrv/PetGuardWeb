package com.petguard.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import com.petguard.daointerface.IUbicacion;
import com.petguard.entity.Ubicacion;
import com.petguard.serviceinterface.IUbicacionService;

public class UbicacionServiceImpl implements IUbicacionService,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IUbicacion IUbiDao;
	@Override
	public void insert(Ubicacion ubic) {
		IUbiDao.insert(ubic);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Ubicacion> list() {
		// TODO Auto-generated method stub
		return IUbiDao.list();
	}

}
