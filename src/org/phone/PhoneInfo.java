package org.phone;

public class PhoneInfo {

	public void phoneName() {
		
		System.out.println("OnePlus");
	}
	
	public void phoneMieiNum() {
		
		System.out.println("123");
	}
	
	public void camera() {
		
		System.out.println("64mp");
	}
	
	public void storage() {
		
		System.out.println("128GB");
	}
	
	public void osName() {
		
		System.out.println("oxygen");
	}
	
	public static void main(String[] args) {
		
		PhoneInfo d = new PhoneInfo();
		
		d.phoneName();
		d.phoneMieiNum();
		d.camera();
		d.storage();
		d.osName();
	}
	
	
	
	
	
	
}
