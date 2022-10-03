package com.example.SpringMesseage.ent;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Auto {
	
	@Id
	private int pincode;
	private String area;
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Auto [pincode=" + pincode + ", area=" + area + "]";
	}

}
