package com.salonservice.bean;

public class AddressDTO {

	private Integer addId;
	private String doorNo;
	
	private String street;
	private String area;
	private String city;
	private String state;	
	private Integer pincode;
	
	public AddressDTO() {
		super();
	}

	public AddressDTO(Integer addId, String doorNo, String street, String area, String city, String state,
			Integer pincode) {
		super();
		this.addId = addId;
		this.doorNo = doorNo;
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	public Integer getAddId() {
		return addId;
	}
	public void setAddId(Integer addId) {
		this.addId = addId;
	}
	public String getDoorNo() {
		return doorNo;
	}
	
	
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	
}
