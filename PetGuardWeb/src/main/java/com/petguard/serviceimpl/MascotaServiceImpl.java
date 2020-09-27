package com.petguard.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import com.petguard.daointerface.IMascota;
import com.petguard.entity.Mascota;
import com.petguard.serviceinterface.IMascotaService;

public class MascotaServiceImpl implements IMascotaService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private IMascota IMDao;

	@Override
	public void insert(Mascota mas) {
		IMDao.insert(mas);
		// TODO Auto-generated method stub

	}

	@Override
	public List<Mascota> list() {
		// TODO Auto-generated method stub
		return IMDao.list();
	}

}
