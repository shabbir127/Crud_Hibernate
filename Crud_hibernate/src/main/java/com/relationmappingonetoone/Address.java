package com.relationmappingonetoone;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {

	@Id
	private int id;
	private String address;
	@OneToOne(mappedBy = "address")
	private EmpDtls empDtls;
	
	
	
	public EmpDtls getEmpDtls() {
		return empDtls;
	}
	public void setEmpDtls(EmpDtls empDtls) {
		this.empDtls = empDtls;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
