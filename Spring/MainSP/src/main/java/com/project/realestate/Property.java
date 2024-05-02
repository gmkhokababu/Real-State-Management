package com.project.realestate;

public class Property {
	int id;
	String type;
	String location;
	int size;
	String amenities;
	String status;
	int landlordId;
	public Property() {
		super();
	}
	public Property(int id, String type, String location, int size, String amenities, String status, int landlordId) {
		super();
		this.id = id;
		this.type = type;
		this.location = location;
		this.size = size;
		this.amenities = amenities;
		this.status = status;
		this.landlordId = landlordId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getAmenities() {
		return amenities;
	}
	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getLandlordId() {
		return landlordId;
	}
	public void setLandlordId(int landlordId) {
		this.landlordId = landlordId;
	}
	@Override
	public String toString() {
		return "Property [id=" + id + ", type=" + type + ", location=" + location + ", size=" + size + ", amenities="
				+ amenities + ", status=" + status + ", landlordId=" + landlordId + ", getId()=" + getId()
				+ ", getType()=" + getType() + ", getLocation()=" + getLocation() + ", getSize()=" + getSize()
				+ ", getAmenities()=" + getAmenities() + ", getStatus()=" + getStatus() + ", getLandlordId()="
				+ getLandlordId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
