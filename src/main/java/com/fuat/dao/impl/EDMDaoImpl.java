package com.fuat.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fuat.dao.EDMDao;
import com.fuat.model.EDM;

@Repository
public class EDMDaoImpl implements EDMDao{
	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(EDM edm) {
		session.getCurrentSession().save(edm);
		
	}

	@Override
	public void edit(EDM edm) {
		session.getCurrentSession().update(edm);
	}

	@Override
	public void delete(String firstname) {
		session.getCurrentSession().delete(getEDM(firstname));
		
	}

	@Override
	public EDM getEDM(String firstname) {
		
		return (EDM) session.getCurrentSession().get(EDM.class, firstname);
	}

	@Override
	public List getAllEDM() {
		
		//List<EDM> result = (List<EDM>) ((Session) session).createQuery("from Edm").list();
		return session.getCurrentSession().createQuery("from EDM").list();
	}

}
