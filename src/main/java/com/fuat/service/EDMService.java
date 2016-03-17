package com.fuat.service;

import java.util.List;

import com.fuat.model.EDM;


public interface EDMService {
	
	public void add(EDM employee);//add employee with all information.
	public void edit(EDM employee);//edit employee with all information.
	public void delete(String firstname); // delete will be based on first name of the employee.
	public EDM getEDM(String firstname);//search employee with given first name.
	public List getAllEDM();//list all employees.
	

}
