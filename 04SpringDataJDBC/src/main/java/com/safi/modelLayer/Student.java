package com.safi.modelLayer;



public class Student {
	private Integer stId;
	private String stName;
	private String stCity;
	private String stGender;
	
	
	
	public Student(Integer stId, String stName, String stCity, String stGender) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.stCity = stCity;
		this.stGender = stGender;
	}
	
	
	public Student() {
		super();
	}


	public Integer getStId() {
		return stId;
	}
	public void setStId(Integer stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStCity() {
		return stCity;
	}
	public void setStCity(String stCity) {
		this.stCity = stCity;
	}
	public String getStGender() {
		return stGender;
	}
	public void setStGender(String stGender) {
		this.stGender = stGender;
	}


	@Override
	public String toString() {
		return "StudentDetail [stId=" + stId + ", stName=" + stName + ", stCity=" + stCity + ", stGender=" + stGender
				+ "]";
	}
	
	
	
	
}
