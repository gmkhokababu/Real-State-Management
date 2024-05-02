package com.project.realestate;

public class Tenant {
	int id;
	String name;
	String presentAddress;
	String permanentAddress;
	String phoneNo;
	String email;
	String ocupation;
	String propertyId;
	public Tenant() {
		super();
	}
	public Tenant(int id, String name, String presentAddress, String permanentAddress, String phoneNo, String email,
			String ocupation, String propertyId) {
		super();
		this.id = id;
		this.name = name;
		this.presentAddress = presentAddress;
		this.permanentAddress = permanentAddress;
		this.phoneNo = phoneNo;
		this.email = email;
		this.ocupation = ocupation;
		this.propertyId = propertyId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOcupation() {
		return ocupation;
	}
	public void setOcupation(String ocupation) {
		this.ocupation = ocupation;
	}
	public String getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(String propertyId) {
		this.propertyId = propertyId;
	}
	@Override
	public String toString() {
		return "Tenant [id=" + id + ", name=" + name + ", presentAddress=" + presentAddress + ", permanentAddress="
				+ permanentAddress + ", phoneNo=" + phoneNo + ", email=" + email + ", ocupation=" + ocupation
				+ ", propertyId=" + propertyId + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getPresentAddress()=" + getPresentAddress() + ", getPermanentAddress()=" + getPermanentAddress()
				+ ", getPhoneNo()=" + getPhoneNo() + ", getEmail()=" + getEmail() + ", getOcupation()=" + getOcupation()
				+ ", getPropertyId()=" + getPropertyId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
