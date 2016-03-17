/**
 * 
 */
package com.fuat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * @author Fuat Arslan
 *
 */
@Entity
public class EDM {
	
	//@Id
	//@Column
	//@GeneratedValue(strategy=GenerationType.AUTO)//to assign auto number to the value.
	@Id
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private int salary;
	@Column
	private String d_name;
	@Column
	private String d_description;
	@Column
	private String m_name;
	@Column
	private String m_description;
	
	
	public EDM(){}


	public EDM(String firstname, String lastname, int salary, String d_name, String d_description, String m_name,
			String m_description) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
		this.d_name = d_name;
		this.d_description = d_description;
		this.m_name = m_name;
		this.m_description = m_description;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getD_name() {
		return d_name;
	}


	public void setD_name(String d_name) {
		this.d_name = d_name;
	}


	public String getD_description() {
		return d_description;
	}


	public void setD_description(String d_description) {
		this.d_description = d_description;
	}


	public String getM_name() {
		return m_name;
	}


	public void setM_name(String m_name) {
		this.m_name = m_name;
	}


	public String getM_description() {
		return m_description;
	}


	public void setM_description(String m_description) {
		this.m_description = m_description;
	}
	
	
	
	

}
