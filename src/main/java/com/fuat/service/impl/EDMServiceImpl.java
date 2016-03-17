package com.fuat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fuat.dao.EDMDao;
import com.fuat.model.EDM;
import com.fuat.service.EDMService;

@Service
public class EDMServiceImpl implements EDMService {
	@Autowired
	private EDMDao edmDao;

	@Transactional
	@Override
	public void add(EDM edm) {
		edmDao.add(edm);
	}

	@Transactional
	@Override
	public void edit(EDM edm) {
		edmDao.edit(edm);
	}

	@Transactional
	@Override
	public void delete(String firstname) {
		edmDao.delete(firstname);
	}

	@Transactional
	@Override
	public EDM getEDM(String firstname) {

		return edmDao.getEDM(firstname);
	}

	@Transactional
	@Override
	public List getAllEDM() {

		return edmDao.getAllEDM();
	}

}
